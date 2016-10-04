package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Mateusz Czyż\n" +"Gr. B\n" +
                "Wypisać na ekran sumę ciągu arytmetycznego o N elemntach, rozpoczynającego się od elemetu A1 i rosnącego o losową wartość");

        System.out.println("podaj liczbe elementów");
        Scanner scanner = new Scanner(System.in);

        String n="";

        int n1=0;
        while(true) {
            try {
                n=scanner.nextLine();
                Integer.parseInt(n);
                n1 = Integer.parseInt(n);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Podałeś złą liczbę, podaj znowu:");
            }
        }

        Random random = new Random();
        int r = random.nextInt(50)+1;
        int a = random.nextInt(50);
        System.out.println("r="+r);
        int suma = 0;
        for (int i = 0; i < n1; i++) {
            System.out.println("A"+(i+1)+"="+a);
            suma=suma+a;
            a=a+r;
        }
        System.out.println("Suma ciagu arytmetycznego wynosi: "+suma);
    }
}
