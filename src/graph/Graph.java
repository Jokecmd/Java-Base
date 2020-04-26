package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Graph<E> {
	private ArrayList<String> vertexList;
	private int[][] edges;
	private int numOfEdges;
	private boolean[] isVisited;

	public static void main(String[] args) {
		int n = 5;
		String vertexValue[] = {"a","b","c","d","e"};
		Graph graph = new Graph(n);
		for (String value : vertexValue) {
			graph.insertVertx(value);
		}
		graph.insertEdge(0, 1, 1);
		graph.insertEdge(0, 2, 1);
		graph.insertEdge(1, 2, 1);
		graph.insertEdge(1, 3, 1);
		graph.insertEdge(1, 4, 1);
		
		graph.show();
		//graph.dfs();
		graph.bfs();
	}
	//初始化
	public Graph(int n) {
		edges = new int[n][n];
		vertexList = new ArrayList<String>(n);
		numOfEdges = 0;
		isVisited = new boolean[5];
	}
	//得到第一个邻接顶点下标
	public int getFirstNeighbor(int index) {
		for(int j = 0; j < vertexList.size(); j++) {
			if(edges[index][j] > 0) {
				return j;
			}
		}
		return -1;
	}
	//根据前一个邻接顶点下标来获取下一个邻接节点
	public int getNextNeighbor(int v1,int v2) {
		for(int j = v2 + 1; j < vertexList.size(); j++) {
			if(edges[v1][j] > 0) {
				return j;
			}
		}
		return -1;
	}
	//深度遍历
	private void dfs(boolean[] isVisited,int i) {
		System.out.print(getValue(i));
		isVisited[i] = true;
		int w = getFirstNeighbor(i);
		while (w != -1) {
			if(!isVisited[w]) {
				dfs(isVisited, w);
			}
			w = getNextNeighbor(i, w);
		}
	}
	//重载dfs，遍历所有节点
	public void dfs() {
		for(int i = 0; i < getnumOfVertex(); i++) {
			if(!isVisited[i]) {
				dfs(isVisited,i);
			}
		}
	}
	//bfs单个
	private void bfs(boolean[] isVisited,int i) {
		int u;
		int w;
		LinkedList queue = new LinkedList();
		System.out.print(getValue(i));
		isVisited[i] = true;
		queue.addLast(i);
		while(!queue.isEmpty()) {
			u = (int) queue.removeFirst();
			w = getFirstNeighbor(u);
			while(w != -1) {
				if(!isVisited[w]) {
					System.out.print(getValue(w));
					isVisited[w] = true;
					queue.addLast(w);
				}
				w = getNextNeighbor(u, w);
			}
		}
	}
	//所有bfs
	public void bfs() {
		for(int i = 0; i < getnumOfVertex(); i++) {
			if(!isVisited[i]) {
				bfs(isVisited,i);
			}
		}
	}
	//插入顶点
	public void insertVertx(String vertex) {
		vertexList.add(vertex);
	}
	//插入边
	public void insertEdge(int v1,int v2,int weight) {
		edges[v1][v2] = weight;
		edges[v2][v1] = weight;
		numOfEdges++;
	}
	//返回节点个数
	public int getnumOfVertex() {
		return vertexList.size();
	}
	//得到边的数目
	public int getnumOfEdges() {
		return numOfEdges;
	}
	//得到对应下标的值
	public String getValue(int i) {
		return vertexList.get(i);
	}
	//得到权值
	public int getWeight(int v1,int v2) {
		return edges[v1][v2];
	}
	//打印图数组
	public void show() {
		for (int[] is : edges) {
			System.out.println(Arrays.toString(is));
		}
	}
}
