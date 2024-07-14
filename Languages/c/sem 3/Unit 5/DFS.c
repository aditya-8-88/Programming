#include <stdio.h>
#include <stdlib.h>

#define MAX_VERTICES 100

// Structure to represent a graph node
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Structure to represent a graph
typedef struct Graph {
    int numVertices;
    Node** adjLists; // Array of adjacency lists
    int* visited;
} Graph;

// Function to create a new node
Node* createNode(int data) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to create a graph
Graph* createGraph(int numVertices) {
    Graph* graph = (Graph*)malloc(sizeof(Graph));
    graph->numVertices = numVertices;

    // Create adjacency lists for all vertices
    graph->adjLists = (Node**)malloc(numVertices * sizeof(Node*));
    for (int i = 0; i < numVertices; ++i) {
        graph->adjLists[i] = NULL;
    }

    // Create an array to mark visited nodes
    graph->visited = (int*)malloc(numVertices * sizeof(int));
    for (int i = 0; i < numVertices; ++i) {
        graph->visited[i] = 0; // 0 represents false, not visited
    }

    return graph;
}

// Function to add an edge to the graph
void addEdge(Graph* graph, int src, int dest) {
    // Add edge from src to dest
    Node* newNode = createNode(dest);
    newNode->next = graph->adjLists[src];
    graph->adjLists[src] = newNode;

    // Add edge from dest to src (for undirected graph)
    newNode = createNode(src);
    newNode->next = graph->adjLists[dest];
    graph->adjLists[dest] = newNode;
}

// Function to perform DFS traversal from a given vertex
void DFS(Graph* graph, int vertex) {
    graph->visited[vertex] = 1; // 1 represents true, visited
    printf("%d ", vertex);

    // Recursively visit all unvisited neighbors
    Node* temp = graph->adjLists[vertex];
    while (temp) {
        if (!graph->visited[temp->data]) {
            DFS(graph, temp->data);
        }
        temp = temp->next;
    }
}

// Function to free the allocated memory for the graph
void freeGraph(Graph* graph) {
    for (int i = 0; i < graph->numVertices; ++i) {
        Node* current = graph->adjLists[i];
        while (current) {
            Node* temp = current;
            current = current->next;
            free(temp);
        }
    }

    free(graph->adjLists);
    free(graph->visited);
    free(graph);
}

int main() {
    int numVertices = 6;
    Graph* graph = createGraph(numVertices);
    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    addEdge(graph, 2, 3);
    addEdge(graph, 3, 4);
    addEdge(graph, 4, 5);
    addEdge(graph, 2, 5);

    printf("DFS traversal starting from vertex 0: ");
    DFS(graph, 0);

    // After DFS traversal
    freeGraph(graph);

    return 0;
}