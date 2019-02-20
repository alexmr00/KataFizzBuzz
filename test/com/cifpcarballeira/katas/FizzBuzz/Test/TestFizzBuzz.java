package com.cifpcarballeira.katas.FizzBuzz.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DAW115
 */
public class TestFizzBuzz {
    
    public TestFizzBuzz() {
    }
@Test //devuelve1
    public void test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(1);
        assertEquals("1", resultado);
    }
    @Test //2devuelve2
    public void test2devuelve1de2() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(2);
        assertEquals("2", resultado);
    }
    @Test //3devuelveFizz
    public void test3devuelvefizz() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(3);
        assertEquals("Fizz", resultado);
    }
     @Test //5devuelveBuzz
    public void test5devuelvebuzz() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(5);
        assertEquals("Buzz", resultado);
    }
     @Test //15devuelveFizzBuzz
    public void test15devuelvebuzz() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(15);
        assertEquals("FizzBuzz", resultado);
    }
}
