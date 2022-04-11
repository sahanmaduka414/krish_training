/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs_and_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author sahan maduka
 */
public class Graph {

    private int in;
    private LinkedList<Integer> link[];

    Graph(int v) {
        in = v;
        link = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            link[i] = new LinkedList();
        }
    }

    void addEdge(int start, int end) {
        link[start].add(end);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[in];

        int a = 0;

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;

        queue.add(s);

        while (queue.size() != 0) {

            s = queue.poll();
            System.out.print("BFS :"+s + " ");

            for (int i = 0; i < link[s].size(); i++) {
                a = link[s].get(i);
                if (!visited[a]) {
                    visited[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    void DFS(int root) {
        boolean visited[] = new boolean[in];

        int a = 0;
        visited[root] = true;
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            System.out.println("DFS :"+root +" ");

            for (int i = 0; i < link[root].size(); i++) {
                a = link[root].get(i);
                if (!visited[a]) {
                    visited[a] = true;
                    stack.add(a);
                }
            }

        }
    }

    public static void main(String args[]) {

        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);

        graph.BFS(0);
        System.out.println(" ");
        graph.DFS(0);
    }
}

