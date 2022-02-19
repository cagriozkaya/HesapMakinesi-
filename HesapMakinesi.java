package com.company;

import java.util.Scanner;

public class Main{


    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();


        if (select == 1) {
            System.out.println("Toplam : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("çıkarma : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("çarpma : " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0){
            System.out.println("bölme : " + (n1 / n2));
        } else {
                System.out.println("Bir sayı sıfıra bölünemez!");
            }
        } else {
            System.out.println("Yanlış seçim yaptınız.Tekrar Deneyiniz!");
        }

}
  }
