/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maris
 */
public class Multiplier {
    private int multiplierNumber;
    
    public Multiplier(int number) {
        this.multiplierNumber = number;
    }
    
    public int multiply(int number) {
        return this.multiplierNumber * number;
    }
}
