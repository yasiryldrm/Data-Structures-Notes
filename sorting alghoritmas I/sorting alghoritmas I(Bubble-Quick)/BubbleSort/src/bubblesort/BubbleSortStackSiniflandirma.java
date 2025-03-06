import java.util.*;

public class BubbleSortStackSiniflandirma {
    // Bubble Sort metodu
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Artan sıralama için karşılaştırma
                    // Swap işlemi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Örnek dizi
        int[] sayilar = {12, 45, 7, 23, 56, 89, 34, 11, 5};

        // Diziyi Bubble Sort ile sırala (artan sırada)
        sayilar = bubbleSort(sayilar);

        // Çift ve tek sayılar için stack'ler
        Stack<Integer> ciftStack = new Stack<>();
        Stack<Integer> tekStack = new Stack<>();

        // Sıralanmış dizideki her elemanı kontrol et
        for (int sayi : sayilar) {
            // Sayının çift mi tek mi olduğunu kontrol et
            if (sayi % 2 == 0) {
                ciftStack.push(sayi);
            } else {
                tekStack.push(sayi);
            }
        }

        // Sonuçları yazdır
        System.out.println("Bubble Sort ile Sıralanmış Dizi (Artan Sıra):");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }

        System.out.println("\n\nÇift Sayılar Stacki:");
        while (!ciftStack.isEmpty()) {
            System.out.print(ciftStack.pop() + " ");
        }

        System.out.println("\n\nTek Sayılar Stacki:");
        while (!tekStack.isEmpty()) {
            System.out.print(tekStack.pop() + " ");
        }
    }
}
