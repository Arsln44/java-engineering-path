/**
 * Console Input/Output (Konsol Giriş/Çıkış)
 * 
 * Konsol nedir?
 * - Siyah ekran (Terminal/Command Prompt)
 * - Programın kullanıcıyla iletişim kurduğu yer
 * 
 * İşlemler:
 * 1. Output (Çıkış) - Ekrana yazı yazdırma
 * 2. Input (Giriş) - Kullanıcıdan veri alma
 */

// Scanner sınıfını kullanmak için import ediyoruz
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        
        // ============================================
        // 1. CONSOLE OUTPUT (Ekrana Yazdırma)
        // ============================================
        
        System.out.println("=== CONSOLE OUTPUT ===\n");
        
        // println - Yazdır ve alt satıra geç
        System.out.println("Merhaba Dünya!");
        System.out.println("Bu ikinci satır");
        
        
        // print - Yazdır ama alt satıra geçme
        System.out.print("Bu ");
        System.out.print("aynı ");
        System.out.print("satırda\n");  // \n = alt satıra geç
        
        
        // Değişkenleri yazdırma
        String isim = "Ahmet";
        int yas = 25;
        
        System.out.println("\nİsim: " + isim);
        System.out.println("Yaş: " + yas);
        
        
        // Birden fazla değişken birleştirme
        System.out.println("Benim adım " + isim + " ve " + yas + " yaşındayım.");
        
        
        // Özel karakterler (Escape Sequences)
        System.out.println("\n--- Özel Karakterler ---");
        System.out.println("Yeni satır: İlk satır\nİkinci satır");
        System.out.println("Tab: İsim\t\tYaş");
        System.out.println("Tırnak: \"Merhaba\" dedi");
        System.out.println("Ters slash: C:\\Users\\Desktop");
        
        
        // ============================================
        // 2. CONSOLE INPUT (Kullanıcıdan Veri Alma)
        // ============================================
        
        System.out.println("\n=== CONSOLE INPUT ===\n");
        
        // Scanner objesi oluştur (klavyeden okumak için)
        Scanner scanner = new Scanner(System.in);
        
        
        // String (Metin) Okuma
        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();  // Tüm satırı okur (boşluk dahil)
        System.out.println("Merhaba " + ad + "!");
        
        
        // int (Tam Sayı) Okuma
        System.out.print("\nYaşınızı girin: ");
        int kullaniciYasi = scanner.nextInt();
        System.out.println("Yaşınız: " + kullaniciYasi);
        
        
        // double (Ondalıklı Sayı) Okuma
        System.out.print("\nBoyunuzu girin (örn: 1.75): ");
        double boy = scanner.nextDouble();
        System.out.println("Boyunuz: " + boy + " metre");
        
        
        // ÖNEMLİ: nextInt/nextDouble sonrası nextLine kullanımı
        scanner.nextLine();  // Enter tuşunu temizle (önemli!)
        
        System.out.print("\nŞehrinizi girin: ");
        String sehir = scanner.nextLine();
        System.out.println("Şehir: " + sehir);
        
        
        // boolean Okuma
        System.out.print("\nÖğrenci misiniz? (true/false): ");
        boolean ogrenci = scanner.nextBoolean();
        System.out.println("Öğrenci mi? " + ogrenci);
        
        
        // ============================================
        // 3. Scanner Metodları
        // ============================================
        
        System.out.println("\n--- Scanner Metodları ---");
        
        /*
         * scanner.nextLine()    → String okur (tüm satır)
         * scanner.next()        → String okur (ilk kelime)
         * scanner.nextInt()     → int okur
         * scanner.nextDouble()  → double okur
         * scanner.nextBoolean() → boolean okur
         * scanner.nextLong()    → long okur
         * scanner.nextFloat()   → float okur
         */
        
        
        // ============================================
        // 4. Gerçek Hayat Örneği - Basit Hesap Makinesi
        // ============================================
        
        System.out.println("\n=== BASİT HESAP MAKİNESİ ===\n");
        
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        
        // Hesaplamalar
        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi1 / sayi2;
        
        System.out.println("\n--- Sonuçlar ---");
        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpım: " + carpim);
        System.out.println("Bölüm: " + bolum);
        
        
        // ============================================
        // 5. Gerçek Hayat Örneği - Kullanıcı Profili
        // ============================================
        
        scanner.nextLine();  // Temizlik
        
        System.out.println("\n=== KULLANICI PROFİLİ ===\n");
        
        System.out.print("Tam adınız: ");
        String tamAd = scanner.nextLine();
        
        System.out.print("Yaşınız: ");
        int profilYas = scanner.nextInt();
        
        System.out.print("Email: ");
        String email = scanner.next();
        
        scanner.nextLine();  // Temizlik
        
        System.out.print("Şehir: ");
        String profilSehir = scanner.nextLine();
        
        // Profil Özeti
        System.out.println("\n--- PROFİL ÖZETİ ---");
        System.out.println("Ad: " + tamAd);
        System.out.println("Yaş: " + profilYas);
        System.out.println("Email: " + email);
        System.out.println("Şehir: " + profilSehir);
        
        
        // ============================================
        // 6. printf() - Formatlanmış Yazdırma
        // ============================================
        
        System.out.println("\n=== FORMATLANMIŞ YAZDIRMA ===\n");
        
        String urun = "Laptop";
        double fiyat = 12999.99;
        int stok = 5;
        
        // printf ile formatlanmış çıktı
        System.out.printf("Ürün: %s\n", urun);           // %s = String
        System.out.printf("Fiyat: %.2f TL\n", fiyat);    // %.2f = 2 ondalık
        System.out.printf("Stok: %d adet\n", stok);      // %d = int
        
        // Hepsi bir arada
        System.out.printf("\n%s - %.2f TL (%d adet)\n", urun, fiyat, stok);
        
        
        // ============================================
        // 7. Scanner'ı Kapatma
        // ============================================
        
        // İşimiz bitince Scanner'ı kapat (iyi pratik)
        scanner.close();
        
        System.out.println("\n✅ Console I/O konusu tamamlandı!");
        
        
        // ============================================
        // 8. Özet ve Önemli Notlar
        // ============================================
        
        /*
         * OUTPUT (Yazdırma):
         * 
         * System.out.println("metin");  → Yazdır + alt satır
         * System.out.print("metin");    → Yazdır (alt satır yok)
         * System.out.printf("format");  → Formatlanmış yazdır
         * 
         * Özel Karakterler:
         * \n → Yeni satır
         * \t → Tab
         * \" → Çift tırnak
         * \\ → Ters slash
         */
        
        /*
         * INPUT (Okuma):
         * 
         * Scanner scanner = new Scanner(System.in);  → Oluştur
         * 
         * scanner.nextLine()    → String (tüm satır)
         * scanner.next()        → String (ilk kelime)
         * scanner.nextInt()     → int
         * scanner.nextDouble()  → double
         * scanner.nextBoolean() → boolean
         * 
         * scanner.close();      → Kapat
         */
        
        /*
         * ÖNEMLİ PROBLEM: nextInt/nextDouble sonrası nextLine
         * 
         * ❌ SORUN:
         * int yas = scanner.nextInt();
         * String isim = scanner.nextLine();  // Boş okur!
         * 
         * ✅ ÇÖZÜM:
         * int yas = scanner.nextInt();
         * scanner.nextLine();  // Enter'ı temizle
         * String isim = scanner.nextLine();  // Şimdi doğru okur
         */
        
        /*
         * printf() FORMAT BELİRTEÇLERİ:
         * 
         * %s  → String
         * %d  → int (decimal)
         * %f  → double (float)
         * %.2f → 2 ondalık basamaklı double
         * %n  → Yeni satır (platform bağımsız)
         * 
         * Örnek:
         * System.out.printf("Merhaba %s, yaşınız %d\n", "Ali", 25);
         */
        
        /*
         * İYİ PRATİKLER:
         * 
         * ✅ Scanner'ı kullan bitince kapat: scanner.close()
         * ✅ Kullanıcıya ne girmesi gerektiğini söyle
         * ✅ nextInt/nextDouble sonrası nextLine() çağır
         * ✅ Anlamlı isimler kullan: kullaniciAdi (input değil)
         */
        
        /*
         * YAYGIN HATALAR:
         * 
         * ❌ Scanner kapatmayı unutmak
         * ❌ nextLine() öncesi temizlik yapmamak
         * ❌ Yanlış tipte okumak (String beklerken int okumak)
         * ❌ InputMismatchException (kullanıcı sayı yerine harf girerse)
         */
        
    }
}