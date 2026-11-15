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
        

        System.out.println("Delivery network created!");
    }
}
