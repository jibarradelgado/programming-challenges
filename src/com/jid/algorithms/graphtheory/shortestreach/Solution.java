package com.jid.algorithms.graphtheory.shortestreach;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        Graph graph;
        Map<Integer, Node> nodes;
        int T = in.nextInt();
        int N, M, x, y, s;

        for (int i = 0; i < T; i++) {
            N = in.nextInt();
            nodes = new HashMap<Integer, Node>();
            for (int j = 1; j <= N; j++) {
                nodes.put(j, new Node(j));
            }
            M = in.nextInt();
            for (int j = 0; j < M; j++) {
                x = in.nextInt();
                y = in.nextInt();
                Node node1 = nodes.get(x);
                Node node2 = nodes.get(y);
                Edge edge = new Edge(node1, node2);
                node1.addEdge(edge);
                node2.addEdge(edge);
            }
            graph = new Graph();
            s = in.nextInt();

            bfs(graph, nodes.get(s));

            for (int j = 1; j <= N; j++) {
                if(j != s)
                    System.out.print(nodes.get(j).getDistanceToStart() + " ");
            }
            System.out.println();
        }
    }

    private static void bfs(Graph graph, Node startNode){

        Queue<Node> q = new LinkedList<Node>();
        startNode.setDistanceToStart(0);
        startNode.visit();
        q.add(startNode);

        while(!q.isEmpty()) {
            Node currentNode = q.remove();
            for(Node node : graph.adj(currentNode)) {
                if(!node.isVisited()){
                    node.setDistanceToStart(0);
                    node.addDistanceToStart(currentNode.getDistanceToStart() + 6);
                    node.visit();
                    q.add(node);
                }
            }
        }
    }
}

class Graph {

    public List<Node> adj(Node node){
        List<Node> nodes = new ArrayList<Node>();
        for(Edge edge : node.getEdges()){
            nodes.add(edge.getOpposite(node));
        }
        return nodes;
    }
}

class Node {
    private int value;
    boolean visited;
    private int distanceToStart = -1;

    List<Edge> edges = new ArrayList<Edge>();

    public Node(int value){
        this.value = value;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public List<Edge> getEdges(){
        return edges;
    }

    public void visit(){
        this.visited = true;
    }

    public boolean isVisited(){
        return this.visited;
    }

    public int getValue() {
        return value;
    }

    public int getDistanceToStart() {
        return distanceToStart;
    }

    public void setDistanceToStart(int distanceToStart) {
        this.distanceToStart = distanceToStart;
    }

    public void addDistanceToStart(int distanceToStart){
        this.distanceToStart += distanceToStart;
    }
}

class Edge {
    Set<Node> nodes = new HashSet<Node>();

    public Edge(Node node1, Node node2) {
        nodes.add(node1);
        nodes.add(node2);
    }

    public Node getOpposite(Node node){
        for(Node node1 : nodes){
            if(node1.getValue() != node.getValue()){
                return node1;
            }
        }
        return null;
    }
}
