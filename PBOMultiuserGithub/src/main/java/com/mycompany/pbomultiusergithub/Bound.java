package com.mycompany.pbomultiusergithub;

public class Bound {
    public static void main(String[] args) {
        int matriks[] = new int [2];
        for (int i=0;i<matriks.length;i++){
            matriks[i] = i+1;
        }
        
        try {
            System.out.println(matriks[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
