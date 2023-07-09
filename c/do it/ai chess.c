// Here is a basic outline for creating a chess AI program in C:

// Represent the chess board: Create a two-dimensional array to represent the chess board, where each square is either empty or occupied by a piece.

// Implement the rules of chess: Write functions to move the pieces according to the rules of chess, such as the movements of the pawns, knights, bishops, rooks, queen, and king.

// Generate all possible moves: Write a function to generate all possible moves for a given board state and player.

// Evaluate the board state: Write a function to evaluate the strength of a given board state for a player. This function should take into account factors such as material, piece mobility, and control of the center of the board.

// Minimax algorithm: Implement the Minimax algorithm to search for the best move. This algorithm generates all possible moves, evaluates the resulting board state, and chooses the move that minimizes the opponent's potential maximum gain.

// Alpha-beta pruning: Optimize the Minimax algorithm by adding Alpha-beta pruning to reduce the number of board evaluations.

// Game loop: Write a main loop that alternates between the player and the AI, until the game is won or drawn.

// This outline is meant to be a high-level summary, and the implementation details can be quite complex. Good luck!




#include <stdio.h>
#include <string.h>
#include<stdbool.h>
const int MAX_MOVES = 28;
const int BOARD_SIZE = 8;
char board[BOARD_SIZE][BOARD_SIZE];
bool white_turn;
int king_x, king_y, queen_x, queen_y, bishop1_x, bishop1_y, bishop2_x, bishop2_y,
    rook1_x, rook1_y, rook2_x, rook2_y, knight1_x, knight1_y, knight2_x, knight2_y,
    pawn1_x, pawn1_y, pawn2_x, pawn2_y, pawn3_x, pawn3_y, pawn4_x, pawn4_y,
    pawn5_x, pawn5_y, pawn6_x, pawn6_y, pawn7_x, pawn7_y, pawn8_x, pawn8_y;

struct Move {
    int x, y;
};

bool is_on_board(int x, int y) {
    return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
}

int get_all_king_moves(struct Move moves[]) {
    int move_count = 0;
    for (int i = -1; i <= 1; i++) {
        for (int j = -1; j <= 1; j++) {
            if (i == 0 && j == 0) continue;
            int new_x = king_x + i, new_y = king_y + j;
            if (is_on_board(new_x, new_y) && board[new_x][new_y] == '.') {
                moves[move_count].x = new_x;
                moves[move_count].y = new_y;
                move_count++;
            }
        }
    }
    return move_count;
}

int get_all_queen_moves(struct Move moves[]) {
    int move_count = 0;
    for (int i = -1; i <= 1; i++) {
        for (int j = -1; j <= 1; j++) {
            if (i == 0 && j == 0) continue;
            int new_x = queen_x + i, new_y = queen_y + j;
            while (is_on_board(new_x, new_y) && board[new_x][new_y] == '.') {
                moves[move_count].x = new_x;
                moves[move_count].y = new_y;
                move_count++;
                new_x += i;
                new_y += j;
            }
            if (is_on_board(new_x, new_y) && board[new_x][new_y] != 'Q') {
                moves[move_count].x = new_x;
                moves[move_count].y = new_y;
                move_count++;
            }
        }
    }
    return move_count;
}

int bishop_valid_moves(int bishop_x, int bishop_y, struct Move moves[]) {
    int move_count = 0;
    int i, j;
    for (i = bishop_x + 1, j = bishop_y + 1; is_on_board(i, j); i++, j++) {
        if (board[i][j] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    for (i = bishop_x - 1, j = bishop_y - 1; is_on_board(i, j); i--, j--) {
        if (board[i][j] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    for (i = bishop_x - 1, j = bishop_y + 1; is_on_board(i, j); i--, j++) {
        if (board[i][j] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    for (i = bishop_x + 1, j = bishop_y - 1; is_on_board(i, j); i++, j--) {
        if (board[i][j] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    return move_count;
}


int rook_valid_moves(int rook_x, int rook_y, struct Move moves[]) {
    int move_count = 0;
    int i, j;
    for (i = rook_x + 1; is_on_board(i, rook_y); i++) {
        if (board[i][rook_y] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = rook_y;
            move_count++;
        } else {
            break;
        }
    }
    for (i = rook_x - 1; is_on_board(i, rook_y); i--) {
        if (board[i][rook_y] == '.') {
            moves[move_count].x = i;
            moves[move_count].y = rook_y;
            move_count++;
        } else {
            break;
        }
    }
    for (j = rook_y + 1; is_on_board(rook_x, j); j++) {
        if (board[rook_x][j] == '.') {
            moves[move_count].x = rook_x;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    for (j = rook_y - 1; is_on_board(rook_x, j); j--) {
        if (board[rook_x][j] == '.') {
            moves[move_count].x = rook_x;
            moves[move_count].y = j;
            move_count++;
        } else {
            break;
        }
    }
    return move_count;
}


int knight_valid_moves(int knight_x, int knight_y,  struct Move moves[]) {
    int move_count = 0;
    int dx[] = {2, 2, -2, -2, 1, 1, -1, -1};
    int dy[] = {1, -1, 1, -1, 2, -2, 2, -2};
    int i;
    for (i = 0; i < 8; i++) {
        int new_x = knight_x + dx[i];
        int new_y = knight_y + dy[i];
        if (is_on_board(new_x, new_y)) {
            moves[move_count].x = new_x;
            moves[move_count].y = new_y;
            move_count++;
        }
    }
    return move_count;
}


int pawn_valid_moves(int pawn_x, int pawn_y,  struct Move moves[]) {
    int move_count = 0;
    int direction = (pawn_x == 1) ? 1 : -1;
    int new_x = pawn_x + direction;
    if (is_on_board(new_x, pawn_y) && board[new_x][pawn_y] == '.') {
        moves[move_count].x = new_x;
        moves[move_count].y = pawn_y;
        move_count++;
        if ((pawn_x == 1 || pawn_x == 6) && board[new_x + direction][pawn_y] == '.') {
            moves[move_count].x = new_x + direction;
            moves[move_count].y = pawn_y;
            move_count++;
        }
    }
    if (is_on_board(new_x, pawn_y + 1) && is_upper_case(board[new_x][pawn_y + 1])) {
        moves[move_count].x = new_x;
        moves[move_count].y = pawn_y + 1;
        move_count++;
    }
    if (is_on_board(new_x, pawn_y - 1) && is_upper_case(board[new_x][pawn_y - 1])) {
        moves[move_count].x = new_x;
        moves[move_count].y = pawn_y - 1;
        move_count++;
    }
    return move_count;
}



