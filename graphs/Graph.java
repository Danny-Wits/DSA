package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {

    List<List<Integer>> adjacencyMatrix = new ArrayList<>();
    List<Node> nodes = new ArrayList<>();
    int size = 0;

    // The `Graph(int size)` constructor in the `Graph` class is initializing the
    // adjacency matrix for the
    // graph. It takes the size of the graph as a parameter and creates an adjacency
    // matrix with dimensions
    // `size x size`.
    Graph(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                temp.add(0);
            }
            adjacencyMatrix.add(temp);
        }
    }

    /**
     * The function `addEdge` adds a directed edge from one vertex to another in an
     * adjacency matrix
     * representation of a graph.
     * 
     * @param from The `from` parameter represents the starting vertex of the edge
     *             to be added in the
     *             adjacency matrix.
     * @param to   The `to` parameter in the `addEdge` method represents the
     *             destination vertex to which an
     *             edge will be added from the source vertex specified by the `from`
     *             parameter.
     */
    void addEdge(int from, int to) {
        adjacencyMatrix.get(from).set(to, 1);
    }

    /**
     * The function `checkEdge` checks if there is an edge between two vertices in a
     * graph represented by
     * an adjacency matrix.
     * 
     * @param from The `from` parameter in the `checkEdge` method represents the
     *             starting vertex of the
     *             edge that you want to check in the adjacency matrix.
     * @param to   The `to` parameter in the `checkEdge` method represents the
     *             destination vertex of the edge
     *             being checked.
     * @return The `checkEdge` method is returning a boolean value. It returns
     *         `true` if there is an edge
     *         from the vertex `from` to the vertex `to` in the adjacency matrix,
     *         and `false` otherwise.
     */
    boolean checkEdge(int from, int to) {
        return adjacencyMatrix.get(from).set(to, 1) == 1;
    }

    /**
     * The `addNode` function adds a `Node` object to a collection called `nodes`.
     * 
     * @param node The parameter `node` is an object of type `Node` that is being
     *             passed to the `addNode`
     *             method.
     */
    void addNode(Node node) {
        nodes.add(node);
    }

    /**
     * The `getNode` function in Java returns the node at a specified index from a
     * list of nodes.
     * 
     * @param index The `index` parameter in the `getNode` method represents the
     *              position of the node that
     *              you want to retrieve from the list of nodes. It is used to
     *              specify which node you are interested in
     *              accessing based on its position in the list.
     * @return The `Node` at the specified `index` is being returned from the
     *         `nodes` list.
     */
    Node getNode(int index) {
        return nodes.get(index);
    }

    /**
     * The `print` function displays a graph represented by an adjacency matrix
     * along with node data.
     */
    void print() {

        // first line
        System.out.print("  |");
        for (Node node : nodes) {
            System.out.printf(" %c |", node.data);
        }

        System.out.println("");
        int i = 0;
        // graph
        for (List<Integer> list : adjacencyMatrix) {

            System.out.print((i++) + " | ");
            for (Integer integer : list) {
                System.out.print(integer + " | ");
            }
            System.out.println("");
        }
    }

    void depthFirstSearch(int src) {
        boolean[] visited = new boolean[size];
        DFS(src, visited);
    }

    private void DFS(int src, boolean[] visited) {

        if (visited[src]) {
            return;
        }
        System.out.println("visited : " + nodes.get(src).data);
        visited[src] = true;

        for (int i = 0; i < adjacencyMatrix.get(src).size(); i++) {
            if (adjacencyMatrix.get(src).get(i) == 1) {
                DFS(i, visited);
            }
        }
        return;
    }

    void breathFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size];
        queue.offer(src);
        visited[src]=true;
        while (queue.size() != 0) {
            int current = queue.poll();
            System.out.println("visited : " + nodes.get(current).data);
            for (int i = 0; i < adjacencyMatrix.get(current).size(); i++) {
                if (adjacencyMatrix.get(current).get(i) == 1 && !visited[i]) {
                    visited[i]=true;
                    queue.offer(i);
                }
            }
        }

    }
}

/**
 * Node
 */
class Node {

    char data;

    public Node(char data) {
        this.data = data;
    }

}