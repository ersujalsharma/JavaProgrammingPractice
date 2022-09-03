import java.util.ArrayList;

public class Graph {
    public static class Edge{
        int src;
        int nbr;
        int weight;
        public Edge(int src, int nbr, int weight) {
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int vertices = 10;
        ArrayList<Edge> graph[] = new ArrayList[10]; // graph array of arrayList
        graph[0].add(new Edge(0, 1, 2));
        graph[1].add(new Edge(6, 1, 10));
        graph[2].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(0, 4, 2));
        graph[4].add(new Edge(3, 1, 20));
        graph[5].add(new Edge(0, 1, 30));
        graph[6].add(new Edge(4, 4, 2));
        graph[7].add(new Edge(3, 1, 20));
        graph[8].add(new Edge(2, 2, 2));
        graph[9].add(new Edge(1, 1, 2));
        

    }

}
