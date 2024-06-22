package graphs;
public class Main {
    
    public static void main(String[] args) {
        Graph g= new Graph(5);
        g.addNode(new Node('a'));
        g.addNode(new Node('b'));
        g.addNode(new Node('c'));
        g.addNode(new Node('d'));
        g.addNode(new Node('e'));
        g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(4, 0);
		g.addEdge(4, 2);
        g.print();
        g.breathFirstSearch(3);

    }
}
