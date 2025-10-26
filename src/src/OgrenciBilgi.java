/*
 * Ad Soyad: [Selim Yağbasan]
 * Ogrenci No: [250541111]
 * Tarih: [25.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor
        Scanner input = new Scanner(System.in);
        //Bilgi girişleri
        // Ad
        System.out.print("Adınızı Giriniz: ");
        String ad = input.nextLine();
        //Soyad
        System.out.print("Soyadınızı Giriniz: ");
        String soyad = input.nextLine();
        // Öğrenci no
        System.out.print("Öğrenci Numaranızı Giriniz: ");
        int ogrencino = input.nextInt();
        // Yaş
        System.out.print("Yaşınızı Giriniz: ");
        int yas = input.nextInt();
        // GPA
        System.out.print("GPA'nızı Giriniz: ");
        double gpa = input.nextDouble();

        // Başarı durumu belirleniyor
        String basaridurumu = "";
        if (gpa >= 2.00 && gpa <= 4.00) {
            basaridurumu = "Başarılı";
        } else if (gpa >= 0.00 && gpa <= 1.99) {
            basaridurumu = "Vasat";
        } 
        else if (gpa >4.00) {
            basaridurumu = "Geçersiz GPA";
        }
        else  {
            basaridurumu ="Geçersiz GPA";
        }
        
        
        // Bilgiler ekrana yazdırılıyor
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad          : %s\n", ad);
        System.out.printf("Soyad       : %s\n", soyad);
        System.out.printf("Öğrenci No  : %d\n", ogrencino);
        System.out.printf("Yaş         : %d\n", yas);
        System.out.printf("GPA         : %.2f\n", gpa);
        System.out.printf("Durum       : %s\n", basaridurumu);
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        // Scanner kapatılıyor
        input.close();
    }
}