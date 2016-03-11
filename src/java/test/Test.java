/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.DataGenerator;

/**
 *
 * @author Kristian
 */
public class Test {
    
    public static void main(String[] args) {
        DataGenerator dg = new DataGenerator();
        System.out.println(dg.getData(5,"fname,lname,street,city"));
    }
}
