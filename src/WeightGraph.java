import java.util.*;
public class WeightGraph <T> {
    private final List <T> vertices;
    private int[][] matrix;

    public WeightGraph() {
        vertices = new ArrayList<>();
        matrix = new int[10][10];

        for (int [] row : matrix) {
            Arrays.fill(row, -1);
        }
    }
    public void addVertex(T vertex) {
        if (vertices.contains(vertex)) {
            return;
        }
        if (vertices.size() == matrix.length) {
            int oldSize = matrix.length;
            int newSize = oldSize * 2;
            int[][] newMatrix = new int[newSize][newSize];

            for (int [] row : newMatrix) {
                Arrays.fill(row, -1);
            }
            for (int i = 0; i < oldSize; i++) {
                System.arraycopy(matrix[i], 0, newMatrix[i], 0, oldSize);
            }
            matrix = newMatrix;
        }
        vertices.add(vertex);
    }
    public void addEdge(T from, T to, int weight) {
        int i =  vertices.indexOf(from);
        int j = vertices.indexOf(to);

        if (i == -1 || j == -1) {
            throw new IllegalArgumentException("Both cities must exist.");
        }
        if(weight<0){
            throw new IllegalArgumentException("Fuel cost cannot be negative.");
        }
        matrix[i][j] = weight;
        matrix[j][i] = weight;
    }
    public boolean bfs(T start, T end) {
        int startIndex = vertices.indexOf(start);
        int endIndex = vertices.indexOf(end);

        if (startIndex == -1 || endIndex == -1) {
            return false;
        }
        boolean[] visited = new boolean[vertices.size()];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startIndex);
        visited[startIndex] = true;

        while (!queue.isEmpty()) {
            int current =  queue.poll();

            if (current == endIndex) {
                return true;
            }
            for (int i = 0; i < vertices.size(); i++) {
                if (matrix[current][i] !=-1
                        && !visited[i]){

                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        return false;
    }
}

