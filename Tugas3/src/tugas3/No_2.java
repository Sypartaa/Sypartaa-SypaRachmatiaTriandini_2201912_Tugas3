/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        scanner.close();

        double bobotUTS = 0.35;
        double bobotUAS = 0.45;
        double bobotTugas = 0.20;

        double nilaiAkhir = (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS) + (nilaiTugas * bobotTugas);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai indeks: A");
        } else if (nilaiAkhir >= 70 && nilaiAkhir < 80) {
            System.out.println("Nilai indeks: B");
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 70) {
            System.out.println("Nilai indeks: C");
        } else {
            System.out.println("Nilai indeks: E");
        }
    }
}