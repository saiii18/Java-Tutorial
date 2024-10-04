import java.util.LinkedList;
import java.util.List;
class adjacencylist {
    private List<List<Integer>> adjacencylist;
    private int numVertices;
    public adjacencylist(int numVertices) {
        this.numVertices = numVertices;
        adjacencylist = new LinkedList<>();
        for (int i = 0; i < numVertices; i++) {
            adjacencylist.add(new LinkedList<>());
        }
    }
    public void addEdge(int source, int destination) {
        adjacencylist.get(source).add(destination);
        adjacencylist.get(destination).add(source);
    }
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer vertex : adjacencylist.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        adjacencylist graph = new adjacencylist(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.printGraph();
    }
}