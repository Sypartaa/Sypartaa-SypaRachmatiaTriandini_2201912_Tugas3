/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

import java.util.Scanner;

public class No_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();

        scanner.close();

        if (bilangan1 % 2 == 0 && bilangan2 % 2 == 0) {
            int hasilPenjumlahan = bilangan1 + bilangan2;
            System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        } else if (bilangan1 % 2 != 0 && bilangan2 % 2 != 0) {
            int hasilPerkalian = bilangan1 * bilangan2;
            System.out.println("Hasil perkalian: " + hasilPerkalian);
        } else {
            System.out.println("Bilangan yang kamu masukkan tidak sejenis" );
        }
    }
}