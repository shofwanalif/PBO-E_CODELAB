package org.example;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        String nama;
        String tgllahir;
        String jeniskelamin;
        int umur;
        Scanner objInput = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = objInput.nextLine();

        System.out.print("Masukkan jenis kelamin: ");
        jeniskelamin = objInput.nextLine();

        System.out.print("Masukkan tanggal lahir (YYY-MM-DD): ");
        tgllahir = objInput.nextLine();

        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jeniskelamin);
    }
}