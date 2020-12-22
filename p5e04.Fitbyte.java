/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maris
 */
public class Fitbyte {
    
    private int age;
    private int restRate;
    
    public Fitbyte(int age, int restRate) {
        this.age = age;
        this.restRate = restRate;
    }
        
    public double targetHeartRate(double percentageOfMaximum) {
            return this.restRate + percentageOfMaximum * (206.3 - (0.711 * this.age) - this.restRate);
    }
    
            
    
}
