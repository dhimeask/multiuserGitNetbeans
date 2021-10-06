/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbomultiusergithub;

/**
 *
 * @author d
 */
public class Trycatch {
    public static void main(String[] args) {
        int a=3;
        int b=0;
        //int hasil = a/b;
        try {
            System.out.println(""+a/b);
        } catch (Exception e) {
            System.out.println("Nilai b tidak boleh = 0");
        }
    }
}
