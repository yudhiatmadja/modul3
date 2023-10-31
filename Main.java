package org.example;


import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
  int number1, number2, pilih, result=0;
        System.out.println("Program Kalkulator Sederhana");



        System.out.println("input angka pertama : ");
        number1 = input.nextInt();
        System.out.println("input angka kedua : ");
        number2 = input.nextInt();

        System.out.println("1. Penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. pembagian");
        System.out.println("4. perkalian");
        System.out.println("5. sisa bagi");

        System.out.println("pilih operator : ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1 -> result = number1 + number2;
            case 2 -> result = number1 - number2;
            case 3 -> result = number1 / number2;
            case 4 -> result = number1 * number2;
            case 5 -> result = number1 % number2;
            default -> System.out.println("salah memasukan operator");
        }
        System.out.println("Hasil : " + result);
    }
}