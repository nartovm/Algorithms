import java.util.*;

class Solution {
    HashMap<Node, Node> mapOfClones = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (!mapOfClones.containsKey(node)) {
            Node clone = new Node(node.val);
            mapOfClones.put(node, clone);
            if (node.neighbors != null) {
                for (Node neighbor : node.neighbors) {
                    clone.neighbors.add(cloneGraph(neighbor));
                }
            }
        }
        return mapOfClones.get(node);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // --- Test Case 1 ---
        // Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
        // Ожидается граф из 4 узлов, соединенных в кольцо 1-2-3-4-1
        int[][] adjList1 = {{2, 4}, {1, 3}, {2, 4}, {1, 3}};
        Node graph1 = buildGraph(adjList1);
        System.out.println("Original Graph 1:");
        printGraph(graph1);

        Node cloned1 = solution.cloneGraph(graph1);
        System.out.println("\nCloned Graph 1:");
        printGraph(cloned1);

        System.out.println("\n-------------------\n");

        // --- Test Case 2 ---
        // Input: adjList = [[]]
        // Ожидается один узел со значением 1 и без соседей
        int[][] adjList2 = {{}};
        Node graph2 = buildGraph(adjList2);
        System.out.println("Original Graph 2:");
        printGraph(graph2);

        Node cloned2 = solution.cloneGraph(graph2);
        System.out.println("\nCloned Graph 2:");
        printGraph(cloned2);
    }

    // Метод для построения графа из формата LeetCode (списки смежности)
    private static Node buildGraph(int[][] adjList) {
        if (adjList.length == 0) return null;

        // 1. Создаем все узлы
        Node[] nodes = new Node[adjList.length + 1];
        for (int i = 0; i < adjList.length; i++) {
            nodes[i + 1] = new Node(i + 1);
        }

        // 2. Связываем их
        for (int i = 0; i < adjList.length; i++) {
            for (int neighborVal : adjList[i]) {
                nodes[i + 1].neighbors.add(nodes[neighborVal]);
            }
        }

        return nodes[1]; // Возвращаем первый узел
    }

    // Метод для печати графа (BFS), чтобы убедиться в структуре
    private static void printGraph(Node node) {
        if (node == null) {
            System.out.println("Graph is empty");
            return;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        visited.add(node.val);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("Node " + current.val + " neighbors: [");
            for (Node neighbor : current.neighbors) {
                System.out.print(neighbor.val + " ");
                if (!visited.contains(neighbor.val)) {
                    visited.add(neighbor.val);
                    queue.add(neighbor);
                }
            }
            System.out.println("]");
        }
    }
}