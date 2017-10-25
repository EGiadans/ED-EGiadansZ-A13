/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.nolineales;

/**
 *
 * @author Eduardo
 */
public class Leaf {
    private int data;
    public Leaf right;
    public Leaf left;
    
    Leaf(){
        left = right = null;
        data = 0;
    }
    
    Leaf(int d){
        left = right = null;
        data = 1;
    }
    
    public void print(){
        System.out.println(""+data+"");
    }
    
    public int getData(){
        return data;
    }
    
    public void setData(int d) {
        data = d;
    }
}
