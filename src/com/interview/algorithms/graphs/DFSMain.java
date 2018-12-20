package com.interview.algorithms.graphs;

public class DFSMain {
	
	public static void main(String[] args){
		Graph graph = new Graph();
		
		graph.addVertex(new Vertex("A")); //0
		graph.addVertex(new Vertex("B"));//1
		graph.addVertex(new Vertex("C"));//2
		graph.addVertex(new Vertex("D"));//3
		graph.addVertex(new Vertex("E"));//4
		graph.addVertex(new Vertex("F"));//5
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.addEdge(2, 5);
		
		graph.dfs();
		
		
	}
}
