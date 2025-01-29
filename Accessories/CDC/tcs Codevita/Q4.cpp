#include <iostream>
#include <unordered_map>
#include <unordered_set>
#include <queue>
#include <sstream>
#include <vector>
using namespace std;

unordered_map<string, int> calculateNodeLevels(unordered_map<string, vector<string>>& adjacencyList, const string& rootNode) {
    unordered_map<string, int> nodeLevels;
    queue<pair<string, int>> nodeQueue;
    nodeQueue.push(make_pair(rootNode, 1));

    while (!nodeQueue.empty()) {
        pair<string, int> currentNode = nodeQueue.front();
        nodeQueue.pop();
        string nodeName = currentNode.first;
        int nodeLevel = currentNode.second;
        nodeLevels[nodeName] = nodeLevel;

        for (const string& childNode : adjacencyList[nodeName]) {
            nodeQueue.push(make_pair(childNode, nodeLevel + 1));
        }
    }

    return nodeLevels;
}

int main() {
    int numberOfEdges;
    cin >> numberOfEdges;

    unordered_map<string, vector<string>> adjacencyList;
    unordered_set<string> childNodes;
    unordered_set<string> allNodes;

    for (int i = 0; i < numberOfEdges; ++i) {
        string parentNode, childNode;
        cin >> parentNode >> childNode;
        adjacencyList[parentNode].push_back(childNode);
        childNodes.insert(childNode);
        allNodes.insert(parentNode);
        allNodes.insert(childNode);
    }

    string rootNode;
    for (const string& node : allNodes) {
        if (childNodes.find(node) == childNodes.end()) {
            rootNode = node;
            break;
        }
    }

    unordered_map<string, int> nodeLevels = calculateNodeLevels(adjacencyList, rootNode);

    cin.ignore();
    string inputLine, word;
    getline(cin, inputLine);
    stringstream inputStream(inputLine);

    int totalLevelValue = 0;

    while (inputStream >> word) {
        if (nodeLevels.find(word) != nodeLevels.end()) {
            totalLevelValue += nodeLevels[word];
        } else {
            totalLevelValue += -1;
        }
    }
    cout << totalLevelValue << endl;

    return 0;
}