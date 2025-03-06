

import java.util.Stack;

public class ParantezK {
    public static boolean parantezKontrolEt(String ifade) {
        Stack<Character> stack = new Stack<>();

        // İfadeyi karakter karakter kontrol et
        for(int i = 0; i < ifade.length(); i++) {
            char karakter = ifade.charAt(i);

            // Eğer açma parantezi ise stack'e ekle
            if(karakter == '(') {
                stack.push(karakter);
            }
            // Eğer kapama parantezi ise
            else if(karakter == ')') {
                // Stack boşsa veya eşleşme yoksa hatalı
                if(stack.isEmpty()) {
                    return false;
                }
                // Açma parantezini stack'ten çıkar
                stack.pop();
            }
        }

        // Stack boş ise tüm parantezler eşleşmiştir
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test ifadeleri
        String[] ifadeler = {
                "(a+b)",            // Doğru
                "((a+b)-(c-3))",    // Doğru
                "(a+b)-(c-3/(a+x)", // Yanlış
                "((()))",           // Doğru
                "())",              // Yanlış
                "(()(",             // Yanlış
                ""                  // Doğru (boş ifade)
        };

        // Test ifadelerini kontrol et
        for(String ifade : ifadeler) {
            if(parantezKontrolEt(ifade)) {
                System.out.println(ifade + " --> Parantezler doğru kullanılmış");
            } else {
                System.out.println(ifade + " --> Parantezler hatalı kullanılmış");
            }
        }
    }
}