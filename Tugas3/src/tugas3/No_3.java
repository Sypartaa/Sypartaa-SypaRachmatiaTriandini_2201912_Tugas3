/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.util.Scanner;

public class No_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        scanner.close();

        int jumlahMobil = (jumlahPeserta / 7) + (jumlahPeserta % 7 > 0 ? 1 : 0);

        System.out.println("Mobil yang diperlukan: " + jumlahMobil);
    }
}