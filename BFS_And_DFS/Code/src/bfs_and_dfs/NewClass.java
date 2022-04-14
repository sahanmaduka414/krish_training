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
public class NewClass {
      private int in;
    private LinkedList<Vertex> link;

  

    void addEdge(Vertex start, Vertex end) {
        start.addEdge(end);
        
    }

  

    void DFS(Vertex s) {
      

        Stack<Vertex> stack = new Stack<Vertex>();
        
        
        stack.add(s);
        while (!stack.isEmpty()) {
            s = stack.pop();
            System.out.println(s.data +" ");

            for (Vertex edge : s.getEdges()) {
                if(!edge.visited){
                    s.visited = true;
                    stack.add(edge);
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



        NewClass g=new NewClass();
        
        g.addEdge(v, v1);
        g.addEdge(v, v2);
        g.addEdge(v2, v);
        g.addEdge(v1, v4);
        g.addEdge(v2, v3);
        g.addEdge(v3, v5);
        g.addEdge(v4, v6);
       

        System.out.println("DFS");
        g.DFS(v);
    }
}
