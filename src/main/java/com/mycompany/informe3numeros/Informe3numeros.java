/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informe3numeros;

import java.util.Scanner;
public class Informe3numeros {

    public static void main(String[] args) {
Scanner valor=new Scanner(System.in);

    int num1,num2, num3 ;
        System.out.println("Indira 3 numeros;");
        num1= valor.nextInt();
        num2 = valor.nextInt();
        num3 = valor.nextInt();
        if(num1 < num2 && num1 < num3){
            System.out.println(num1+ "E o menor");
        }else if (num2 < num1 && num2 < num3){
            System.out.println(num2 + "E o menor");
        }else{
        System.out.println(num3 + "E o menor");

    }

    }
}
