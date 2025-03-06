import java.util.Scanner;  // Scanner sınıfını import ettik

class Node {
    int vizeNotu;
    Node next;

    public Node(int vizeNotu) {
        this.vizeNotu = vizeNotu;
        this.next = null;
    }
}

class TekYonluListe {
    Node head;

    public TekYonluListe() {
        head = null;
    }

    public void notEkle(int not) {
        Node yeniNode = new Node(not);

        if (head == null) {
            head = yeniNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = yeniNode;
    }

    public void notlariGoster() {
        Node temp = head;
        int sayac = 1;

        if (temp == null) {
            System.out.println("Liste boş!");
            return;
        }

        System.out.println("\nVize Notları:");
        while (temp != null) {
            System.out.println(sayac + ". not: " + temp.vizeNotu);
            temp = temp.next;
            sayac++;
        }
    }
}

public class VizeNotlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TekYonluListe liste = new TekYonluListe();

        while (true) {
            System.out.println("\n1- Not Ekle");
            System.out.println("2- Notları Göster");
            System.out.println("3- Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Vize notunu giriniz: ");
                    int not = scanner.nextInt();

                    if (not >= 0 && not <= 100) {
                        liste.notEkle(not);
                        System.out.println("Not eklendi!");
                    } else {
                        System.out.println("Geçersiz not! (0-100 arası giriniz)");
                    }
                    break;

                case 2:
                    liste.notlariGoster();
                    break;

                case 3:
                    System.out.println("Program sonlandırılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
    }
}