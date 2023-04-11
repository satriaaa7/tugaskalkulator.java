package tugaspbo;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di tugaspbo.kalkulator sederhana!");

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = bil1 + bil2;
                break;
            case '-':
                hasil = bil1 - bil2;
                break;
            case '*':
                hasil = bil1 * bil2;
                break;
            case '/':
                hasil = bil1 / bil2;
                break;
            default:
                System.out.println("Operator yang anda masukkan salah!");
                break;
        }

        System.out.println("Hasil perhitungan: " + hasil);

        input.close();
    }
}