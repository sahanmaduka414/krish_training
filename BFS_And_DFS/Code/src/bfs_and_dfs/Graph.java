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

    private LinkedList<Vertex> link;

  

    void addEdge(Vertex start, Vertex end) {
        start.addEdge(end);
    }

    void BFS(Vertex s) {
     

        Queue<Vertex> queue = new LinkedList<Vertex>();

        s.visited= true;

        queue.add(s);

        while (!queue.isEmpty()) {

            s = queue.poll();
            System.out.print(s.data + " ");

            
            for (Vertex edge : s.getEdges()) {
                if(!edge.visited){
                    s.visited = true;
                    queue.add(edge);
                }
            }
            
           
        }
    }

    

    public static void main(String args[]) {

        Vertex v=new Vertex("A");
        Vertex v1=new Vertex("B");
        Vertex v2=new Vertex("C");
        Vertex v3=new Vertex("D");
        Vertex v4=new Vertex("E");
        Vertex v5=new Vertex("F");
        Vertex v6=new Vertex("G");



        Graph g=new Graph();
        
        g.addEdge(v, v1);
        g.addEdge(v, v2);
        g.addEdge(v2, v);
        g.addEdge(v1, v4);
        g.addEdge(v2, v3);
        g.addEdge(v3, v5);
        g.addEdge(v4, v6);
       

        System.out.println("BFS");
        g.BFS(v);
       
    }
}

