#include <iostream>
#include <vector>
#include <queue>
#include <climits>

using namespace std;

class Pair {
public:
    int node, distance;

    Pair(int distance, int node) {
        this->node = node;
        this->distance = distance;
    }
};

// Comparator for priority queue
struct Compare {
    bool operator()(Pair const &a, Pair const &b) {
        return a.distance > b.distance;
    }
};

int spanningTree(int V, vector<vector<pair<int, int>>> &adj, vector<int> &parent) {
    priority_queue<Pair, vector<Pair>, Compare> pq;

    vector<int> key(V, INT_MAX);
    vector<int> vis(V, 0);
    parent.assign(V, -1);

    key[0] = 0;
    pq.push(Pair(0, 0)); // (distance, node)

    int sum = 0;

    while (!pq.empty()) {
        int wt = pq.top().distance;
        int node = pq.top().node;
        pq.pop();

        if (vis[node]) continue; // Skip already visited nodes
        vis[node] = 1;
        sum += wt;

        for (auto &edge : adj[node]) {
            int adjNode = edge.first;
            int edW = edge.second;

            if (!vis[adjNode] && edW < key[adjNode]) {
                key[adjNode] = edW;
                parent[adjNode] = node; // Update parent
                pq.push(Pair(edW, adjNode));
            }
        }
    }

    return sum;
}

void printMST(const vector<int> &parent, const vector<vector<pair<int, int>>> &adj) {
    cout << "Edges in the MST:" << endl;
    for (int i = 1; i < parent.size(); i++) {
        for (auto &edge : adj[i]) {
            if (edge.first == parent[i]) {
                cout << "Node " << parent[i] << " - Node " << i << " with weight " << edge.second << endl;
                break;
            }
        }
    }
}

int main() {
    int V = 5; // Number of vertices
    vector<vector<pair<int, int>>> adj(V);

    vector<vector<int>> edges = {
        {0, 1, 2}, {0, 2, 1}, {1, 2, 1}, {2, 3, 2}, {3, 4, 1}, {4, 2, 2}
    };

    // Initialize adjacency list
    for (auto &edge : edges) {
        int u = edge[0], v = edge[1], w = edge[2];
        adj[u].emplace_back(v, w);
        adj[v].emplace_back(u, w);
    }

    vector<int> parent(V);
    int sum = spanningTree(V, adj, parent);
    cout << "The sum of all the edge weights: " << sum << endl;
    printMST(parent, adj);

    return 0;
}
