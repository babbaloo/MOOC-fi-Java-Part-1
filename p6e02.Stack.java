/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maris
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public String take() {
        String last = this.stack.get(this.stack.size() - 1);
        this.stack.remove(this.stack.size() -1);
        return last;
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
}
