public class Main {
    public static void main(String[] args) {
        WeightGraph<String> graph = new WeightGraph<>();

        graph.addVertex("New York");
        graph.addVertex("Chicago");
        graph.addVertex("Denver");
        graph.addVertex("Los Angeles");
        graph.addVertex("Seattle");
        graph.addVertex("Miami");

        graph.addEdge("New York", "Chicago", 100);
        graph.addEdge("Chicago", "Denver", 150);
        graph.addEdge("Denver", "Los Angeles", 200);
        graph.addEdge("Denver", "Seattle", 180);
        graph.addEdge("Los Angeles", "Seattle", 120);
        System.out.println("\nBFS Connectivity");
        System.out.println("New York to Los Angeles:" + graph.bfs("New York", "Los Angeles"));
        System.out.println("New York to Miami:" + graph.bfs("New York", "Miami"));

        System.out.println("Delivery network created!");
    }
}
