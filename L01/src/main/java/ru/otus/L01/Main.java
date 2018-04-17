package ru.otus.L01;

import com.google.common.graph.*;

public class Main {
    public static void main(String[] args) {

        final int NODE_COUNT = 100;

        MutableGraph<Integer> graph = GraphBuilder.directed().build();;

        for (int i = 0; i < NODE_COUNT; i++) {
            graph.addNode(i);
        }

        for (int i = 0; i < NODE_COUNT - 1; i++) {
            for (int j = i + 1; j < NODE_COUNT; j++) {
                graph.putEdge(i, j);
            }
        }

        int node = (int)(Math.random() * NODE_COUNT);

        System.out.println("Node N: " + node);

        StringBuilder sb = new StringBuilder();
        for (Integer aNode: graph.adjacentNodes(node)) {
            sb.append(aNode);
            sb.append(" ");
        }
        System.out.println(sb.toString());

        System.out.println(graph.inDegree(node));

        System.out.println(graph.outDegree(node));
    }
}
