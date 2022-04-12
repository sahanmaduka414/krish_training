/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author sahan maduka
 */
public class NewClass {

    int depth;
    int low;
    private List<Vertex> List = new ArrayList<>();
    Stack<Vertex> stack = new Stack<>();
   

    private Vertex add() {
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");
        Vertex F = new Vertex("F");
        Vertex G = new Vertex("G");
        Vertex H = new Vertex("H");
        Vertex I = new Vertex("I");

        A.al.add(B);
        A.al.add(D);
        
        B.al.add(C);
        B.al.add(A);
        
        C.al.add(D);
        C.al.add(B);
        C.al.add(E);
        C.al.add(F);
        
        D.al.add(C);
        D.al.add(A);
        
        F.al.add(C);
        F.al.add(E);
        F.al.add(G);
        
        G.al.add(F);
        G.al.add(H);
        G.al.add(I);
        
        H.al.add(G);
      
        I.al.add(G);
     

        List.add(A);
        List.add(B);
        List.add(C);
        List.add(D);
        List.add(E);
        List.add(F);
        List.add(G);
        List.add(H);
        List.add(I);

        return A;
    }

    private void depth(Vertex node) {

        stack.push(node);
        depth = depth++;

        node.visited = true;
       
        for (Vertex next : node.al) {
            if (!next.visited) {
                next.next = node;
                node.cn.add(next);

                depth(next);
            } 
        }
        stack.pop();
        
    }

    private int law(Vertex node) {
        
        if (depth == 1) {
            return 1;
        } else {
           
             int li = depth;
            
            for (Vertex next : node.cn) {
                int index = law(next);
            
            }
            return li;
        }
    }

    public void print() {
        Vertex rootNode = add();

        depth(rootNode);

        for (Vertex node : List) {
            low = law(node);
            
        }

        for (Vertex node : List) {
//            System.out.println("node :"+node.data);
            if (node.next != null) {
                for (int i = 0; i < node.cn.size(); i++) {
                    if (low >= depth) {
                        System.out.println(node.data);
                        break;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        NewClass nc = new NewClass();
        nc.print();
    }
}
