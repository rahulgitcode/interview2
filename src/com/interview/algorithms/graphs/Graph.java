package com.interview.algorithms.graphs;

public class Graph {
	private final int MAX_VERT = 20;
	private Vertex[] vertexList;
	private int[][] adjMat;
	private int nverts;
	private StackX stack;
	
	public Graph(){
		//Initialize list of vertices
		vertexList = new Vertex[MAX_VERT];
		
		//initialize vertex count
		nverts =0;
		
		//Initialize Adjacency matrix
		adjMat = new int[MAX_VERT][MAX_VERT];
		for(int i=0; i<MAX_VERT; i++){
			for(int j=0; j<MAX_VERT; j++){
				adjMat[i][j] = 0;
			}
		}
		
		//Initialize the stack for keeping track of nodes visited
		stack = new StackX();
	}
	
	public void addVertex(Vertex v){
		vertexList[nverts++] = v;
	}
	
	public void addEdge(int i, int j){
		adjMat[i][j] = 1;
		adjMat[j][i] = 1;
	}
	
	public int getAdjUnvisitedVertex(int v){
		for(int i=0; i<MAX_VERT; i++){
			if(adjMat[v][i]==1 && !vertexList[i].isVisited){
				return i;
			}
		}
		return -1;
	}
	
	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
	
	public void dfs(){
		stack.push(0);
		vertexList[0].isVisited = true;
		displayVertex(0);
		
		while(!stack.isEmpty()){
			int v = getAdjUnvisitedVertex(stack.peek());
			if(v == -1){
				stack.pop();
			}else{
				stack.push(v);
				vertexList[v].isVisited = true;
				displayVertex(v);
			}
			
		}
	}

}
