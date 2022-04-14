/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs_and_dfs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sahan maduka
 */
public class Vertex {

    /**
     * @return the data
     */
    boolean visited;
    
    String data;
  
    ArrayList<Vertex> al;
  

    public String getData() {
        return data;
    }

    public Vertex(String data) {
        this.data = data;
        this.al = new ArrayList<>();
      
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    
     public ArrayList<Vertex> getEdges() {
        return al;
    }

    public void addEdge(Vertex edge) {
        this.al.add(edge);
    }
    
}
