#include <iostream>
#include <vector>
#include <set>
#include <cmath>
#include <map>
#include <algorithm>
using namespace std;


int calculateArea(const vector<pair<int, int>>& polygon) {
    int n = polygon.size();
    int area = 0;
    for (int i = 0; i < n; i++) {
        int j = (i + 1) % n;
        area += polygon[i].first * polygon[j].second;
        area -= polygon[j].first * polygon[i].second;
    }
    return abs(area) / 2;
}


bool areConnected(pair<int, int> a, pair<int, int> b, pair<int, int>& p1, pair<int, int>& p2) {
    return (p1 == a && p2 == b) || (p1 == b && p2 == a);
}

int main() {
    int N;
    cin >> N;

    vector<pair<int, int>> coordinates;
    vector<vector<pair<int, int>>> segments(N);
    set<pair<int, int>> points;


    for (int i = 0; i < N; i++) {
        int x1, y1, x2, y2;
        cin >> x1 >> y1 >> x2 >> y2;
        coordinates.push_back({x1, y1});
        coordinates.push_back({x2, y2});
        points.insert({x1, y1});
        points.insert({x2, y2});
    }

    vector<pair<int, int>> polygon;
    int placementlelo = 0;

    for (auto p1 = points.begin(); p1 != points.end(); ++p1) {
        for (auto p2 = next(p1); p2 != points.end(); ++p2) {
            polygon.push_back(*p1);
            polygon.push_back(*p2);
            placementlelo = max(placementlelo, calculateArea(polygon));
        }
    }

    cout << placementlelo << endl;
    return 0;
}

