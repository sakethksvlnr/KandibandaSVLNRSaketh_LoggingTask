/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
package com.mycompany.log;
import java.lang.Math.*;
public class Compound {
    double calCompound(double amount,double rate,double time)
    {
        return amount*Math.pow((1+rate/12),time);
    }
    
}
