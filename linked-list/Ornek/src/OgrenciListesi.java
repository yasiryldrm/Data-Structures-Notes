import java.util.Scanner;

// Düğüm (Node) sınıfı
class Ogrenci {
    String ad, soyad;
    int numara;
    Ogrenci onceki;
    Ogrenci sonraki;

    public Ogrenci(String ad, String soyad, int numara) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        this.onceki = null;
        this.sonraki = null;
    }
}

// Çift yönlü bağlı liste sınıfı
class CiftYonluListe {
    Ogrenci bas;      // Listenin başı
    Ogrenci son;      // Listenin sonu
    Ogrenci suanki;   // Şu an gösterilen öğrenci

    public CiftYonluListe() {
        bas = null;
        son = null;
        suanki = null;
    }

    // Yeni öğrenci ekleme
    public void ekle(String ad, String soyad, int numara) {
        Ogrenci yeniOgrenci = new Ogrenci(ad, soyad, numara);

        if (bas == null) {
            // Liste boşsa
            bas = yeniOgrenci;
            son = yeniOgrenci;
            suanki = yeniOgrenci;
        } else {
            // Liste doluysa sona ekle
            son.sonraki = yeniOgrenci;
            yeniOgrenci.onceki = son;
            son = yeniOgrenci;
        }
    }

    // Sonraki öğrenciye geç
    public boolean sonrakineGec() {
        if (suanki != null && suanki.sonraki != null) {
            suanki = suanki.sonraki;
            return true;
        }
        return false;
    }

    // Önceki öğrenciye geç
    public boolean oncekineGec() {
        if (suanki != null && suanki.onceki != null) {
            suanki = suanki.onceki;
            return true;
        }
        return false;
    }

    // Şuanki öğrenciyi göster
    public void suankiOgrenciyiGoster() {
        if (suanki != null) {
            System.out.println("\nÖğrenci Bilgileri:");
            System.out.println("Ad: " + suanki.ad);
            System.out.println("Soyad: " + suanki.soyad);
            System.out.println("Numara: " + suanki.numara);
        } else {
            System.out.println("Listede öğrenci yok!");
        }
    }
}

public class OgrenciListesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CiftYonluListe liste = new CiftYonluListe();

        while (true) {
            System.out.println("\n1- Yeni Öğrenci Ekle");
            System.out.println("2- Sonraki Öğrenci");
            System.out.println("3- Önceki Öğrenci");
            System.out.println("4- Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Ad: ");
                    String ad = scanner.next();
                    System.out.print("Soyad: ");
                    String soyad = scanner.next();
                    System.out.print("Numara: ");
                    int numara = scanner.nextInt();
                    liste.ekle(ad, soyad, numara);
                    liste.suankiOgrenciyiGoster();
                    break;

                case 2:
                    if (!liste.sonrakineGec()) {
                        System.out.println("Son öğrencidasiniz!");
                    }
                    liste.suankiOgrenciyiGoster();
                    break;

                case 3:
                    if (!liste.oncekineGec()) {
                        System.out.println("İlk öğrencidasiniz!");
                    }
                    liste.suankiOgrenciyiGoster();
                    break;

                case 4:
                    System.out.println("Program sonlandiriliyor...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}