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
        System.out.println("\nDFS Connectivity");
        System.out.println("New York to Los Angeles:" + graph.dfs("New York", "Los Angeles"));
        System.out.println("New York to Miami:" + graph.dfs("New York", "Miami"));

        System.out.println("Delivery network created!");

        System.out.println("\nPhase 4:Testing");
        //Test 1: Connected cities
        System.out.println("Chicago to Seattle:");
        System.out.println("BFS:" + graph.bfs("Chicago", "Seattle"));
        System.out.println("DFS:" + graph.dfs("Chicago", "Seattle"));

        //Test 2: Unreachable city
        System.out.println("\nMiami to Denver:");
        System.out.println("BFS:" + graph.bfs("Miami", "Denver"));
        System.out.println("DFS:" + graph.dfs("Miami", "Denver"));

        //Test 3: Two connected cities
        WeightGraph<String> smallGraph = new WeightGraph<>();

        smallGraph.addVertex("City A");
        smallGraph.addVertex("City B");
        smallGraph.addEdge("City A", "City B", 50);

        System.out.println("\nTwo-City Graph:");
        System.out.println("BFS:" + smallGraph.bfs("City A", "City B"));
        System.out.println("DFS:" + smallGraph.dfs("City A", "City B"));

        //Test 4 Different traversal paths
        WeightGraph<String> pathGraph = new WeightGraph<>();

        pathGraph.addVertex("A");
        pathGraph.addVertex("B");
        pathGraph.addVertex("C");
        pathGraph.addVertex("D");
        pathGraph.addVertex("E");

        pathGraph.addEdge("A", "B", 10);
        pathGraph.addEdge("B", "C", 10);
        pathGraph.addEdge("C", "D", 10);
        pathGraph.addEdge("A", "E", 10);
        pathGraph.addEdge("E", "D", 10);

        System.out.println("\nAlternative Paths:");
        System.out.println("BFS:" + pathGraph.bfs("A", "D"));
        System.out.println("DFS:" + pathGraph.dfs("A", "D"));

    }
}
