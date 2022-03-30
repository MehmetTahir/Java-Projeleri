// Not Ortalaması Hesaplayan Program

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik, not_ortalamasi;
        System.out.print("Matematik Notunu Giriniz : ");
        matematik = input.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();
        System.out.print("Turkce Notunu Giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunu Giriniz : ");
        tarih = input.nextInt();
        System.out.print("Muzik Notunu Giriniz : ");
        muzik = input.nextInt();
        not_ortalamasi = (turkce + matematik + fizik + kimya + tarih + muzik) / 6;
        System.out.println("Derslerin Not Ortalamasi : " + not_ortalamasi);
        String ortalama = (not_ortalamasi >= 60) ? "Sinifi Gectiniz..." : "Sinifta Kaldiniz...";
        System.out.println("Sonuc : " + ortalama);
    }
}
