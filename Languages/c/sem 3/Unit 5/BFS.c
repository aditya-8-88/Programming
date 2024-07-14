// #include <stdio.h>
// #include <stdlib.h>

// struct queue
// {
//     int front;
//     int rear;
//     int capacity;
//     int *array;
// };

// struct queue *createqueue(int vertices)
// {
//     struct queue *queue = (struct queue *)malloc(sizeof(struct queue));
//     queue->front = -1;
//     queue->rear = -1;
//     queue->capacity = vertices;
//     queue->array = (int *)malloc(queue->capacity * sizeof(int));
//     return queue;
// }

// void freeQueue(struct queue* q) {
//     free(q->array);
//     free(q);
// }

// int isEmpty(struct queue *queue)
// {
//     return queue->front == -1;
// }

// int enqueue(int item, struct queue *queue)
// {
//     if (isEmpty(queue))
//         queue->front = 0;
//     queue->rear++;
//     queue->array[queue->rear] = item;
//     return 0;
// }

// int dequeue(struct queue *queue)
// {
//     int item = queue->array[queue->front];

//     if (queue->front == queue->rear)
//         queue->front = queue->rear = -1;
//     else
//         queue->front++;

//     return item;
// }

// int BFS(int vertices, int adj[vertices][vertices], int searchvertex)
// {

//     struct queue *queue = createqueue(vertices);

//     int visited[vertices];
//     for (int i = 0; i < vertices; i++)
//         visited[i] = 0;
//     visited[searchvertex] = 1;

//     enqueue(searchvertex, queue);
//     while (!isEmpty(queue))
//     {
//         int currentvertex = dequeue(queue);
//         printf(" %d", currentvertex);
//         for (int j = 0; j < vertices; j++)
//         {
//             if (adj[currentvertex][j] == 1 && visited[j] == 0)
//             {
//                 visited[j] = 1;
//                 enqueue(j, queue);
//             }
//         }
//     }
//     freeQueue(queue);
// }

// int main()
// {
//     int vertices;
//     printf("enter the number of vertices: ");
//     scanf("%d", &vertices);

//     int adj[vertices][vertices];
//     printf("input your adjacency maatrix: ");
//     for (int i = 0; i < vertices; i++)
//     {
//         for (int j = 0; j < vertices; j++)
//         {
//             scanf("%d", &adj[i][j]);
//         }
//     }
//     int searchvertex;
//     printf("input the starting vertices: ");
//     scanf("%d", &searchvertex);
//     BFS(vertices, adj, searchvertex);
//     return 0;
// }

#include <stdio.h>
#include <stdlib.h>

struct queue
{
    int front;
    int rear;
    int capacity;
    int *array;
};

struct queue* createqueue(int capacity)
{
    struct queue* q = (struct queue*)malloc(sizeof(struct queue));
    q->front = q->rear = -1;
    q->capacity = capacity;
    q->array = (int *)malloc(sizeof(int) * capacity);
    return q;
}

int freequeue(struct queue* q)
{
    free(q->array);
    free(q);
    return 0;
}

int isEmpty(struct queue* q)
{
    return q->front == -1;
}

int enqueue(struct queue* q, int item)
{
    if (q->front == -1)
        q->front = 0;
    q->rear++;
    q->array[q->rear] = item;
    return 0;
}

int dequeue(struct queue* q)
{
    int item = q->array[q->front];
    if (q->front == q->rear)
        q->front = q->rear = -1;
    else
        q->front++;
     return item;
}

int BFS(int start, int vertices, int graph[vertices][vertices])
{
    struct queue* q = createqueue(vertices);
    int visited[vertices];
    for (int i = 0; i < vertices; i++)
        visited[i] = 0;

    enqueue(q, start);
    visited[start] = 1;

    while (!isEmpty(q))
    {
        int currentvertex = dequeue(q);
        printf("%d ", currentvertex);

        for (int i = 0; i < vertices; i++)
        {
            if (graph[currentvertex][i] == 1 && visited[i] == 0)
            {
                visited[i] = 1;
                enqueue(q, i);
            }
        }
    }

    freequeue(q);
    return 0;
}

int main()
{
    int start, vertices;
    printf("enter the no. of vertices: ");
    scanf("%d", &vertices);
    printf("enter the starting vertex: ");
    scanf("%d", &start);
    int graph[vertices][vertices];
    printf("enter the adjacency matrix:\n");
    for (int i = 0; i < vertices; i++)
        for (int j = 0; j < vertices; j++)
            scanf("%d", &graph[i][j]);

    
    BFS(start, vertices, graph);
    return 0;
}
