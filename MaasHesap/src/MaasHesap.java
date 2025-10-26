/*
 * Ad Soyad: [Selim Yağbasan]
 * Ogrenci No: [250541111]
 * Tarih: [24.10.2025]
 * Aciklama:Çalışan bilgilerini alıp detaylı maaş bordrosu oluşturan program.
 */

import java.util.Scanner;
public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bilgi Girişleri
        System.out.print("Adınızı Giriniz: ");
        String ad = input.nextLine();
        System.out.print("Soyadınızı Giriniz: ");
        String soyad = input.nextLine();
        System.out.print("Aylık brüt maaşınız nedir? :  ");
        double Brutmaas = input.nextDouble();
        System.out.print("Kaç saat mesai yaptınız? : ");
        double mesai = input.nextDouble();

        //Gelirler
        double mesaiucreti = (Brutmaas / 160) * mesai * 1.5;
        double toplamgelir = (Brutmaas + mesaiucreti);

        //Kesintiler
        double sgk = toplamgelir * 0.14;
        double gelirvergisi = toplamgelir * 0.15;
        double damgavergisi = toplamgelir *  0.00759 ;
        double toplamkesinti = sgk + gelirvergisi + damgavergisi;

        //Net Maaş
        double Netmaas = toplamgelir-toplamkesinti;

        //Hesaplanacak Kesintiler
        double kesintiorani = (toplamkesinti/toplamgelir) * 100;
        double saatliknetkazanc = Netmaas / 176 ;
        double gunluknetkazanc = Netmaas / 22 ;

        // Çıktılar
        System.out.println("\n" + "=".repeat(45));
        System.out.printf("%15s MAAS BORDROSU\n"," ");
        System.out.println("=".repeat(45));
        System.out.printf("Calisan: %s %s\n", ad, soyad);
        System.out.printf("   Brut Maas        : %.2f TL\n", Brutmaas);
        System.out.printf("   Mesai Ucreti     : %.2f TL\n", mesaiucreti);
        System.out.println("-".repeat(45));
        System.out.printf("   TOPLAM GELIR     : %.2f TL\n", toplamgelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("   SGK Kesintisi    : %.2f TL\n", sgk);
        System.out.printf("   Gelir Vergisi    : %.2f TL\n", gelirvergisi);
        System.out.printf("   Damga Vergisi    : %.2f TL\n", damgavergisi);
        System.out.println("-".repeat(45));
        System.out.printf("   TOPLAM KESINTI   : %.2f TL\n", toplamkesinti);
        System.out.printf("   NET MAAS         : %.2f TL\n", Netmaas);

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("   Kesinti Oranı        : %.2f %%\n", kesintiorani);
        System.out.printf("   Saatlik Net Kazanç   : %.2f TL\n", saatliknetkazanc);
        System.out.printf("   Günlük Net Kazanç    : %.2f TL\n", gunluknetkazanc);
    }
}