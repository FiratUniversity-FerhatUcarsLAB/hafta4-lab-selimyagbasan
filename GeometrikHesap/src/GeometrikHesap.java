/*
 * Ad Soyad: [Selim Yağbasan]
 * Ogrenci No: [250541111]
 * Tarih: [24.10.2025]
 * Aciklama: Geometrik hesaplama sistemi
 * Bu sistem tanımlanan matematik terimlerini kullanarak geometrik hesaplar yapar
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Şeklin ne olduğunu sor
        System.out.print("Hesaplama yapmak istediğiniz şekil nedir? (Küre veya Daire): ");
        String sekil = input.nextLine(); // önce şekli al

        // PI
        double PI = 3.14159;

        // Yarıçapı sor
        System.out.print("Yarıçap: ");
        double r = input.nextDouble();

        // Hesaplamalar
        // Küre hacmi
        double hacim = (4.0 / 3.0) * PI * Math.pow(r, 3);
        // Küre yüzey alanı
        double yuzeyAlani = 4.0 * PI * Math.pow(r, 2);
        // Daire alanı
        double alan = PI * Math.pow(r, 2);
        // Daire çevresi
        double cevre = 2.0 * PI * r;


        // Yazdırma
        System.out.println("\n=== GEOMETRİK HESAPLAYICI ===");

        if (sekil.equalsIgnoreCase("Küre")) {
            System.out.printf("Hacim: %.2f\n", hacim);
            System.out.printf("Yüzey Alanı: %.2f\n", yuzeyAlani);
        } else if (sekil.equalsIgnoreCase("Daire")) {
            System.out.printf("Alan: %.2f\n", alan);
            System.out.printf("Çevre: %.2f\n", cevre);
        } else {
            System.out.println("Geçersiz şekil girdiniz. Lütfen 'Küre' veya 'Daire' yazın.");
        }

        input.close();
    }
}