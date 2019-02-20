/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author DAW115
 */
public class FizzBuzz {
    public String getFizzBuzz(int i){
        if (i%3== 0 && i%5==0) return "FizzBuzz";
        if (i%3==0) return "Fizz";
        if (i%5==0) return "Buzz";
        return i+"";
    }
    
}
