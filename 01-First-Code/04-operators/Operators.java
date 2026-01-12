/**
 * Operators (Operatörler)
 * 
 * Operatör nedir?
 * - İşlem yapmak için kullanılan semboller (+, -, *, /, ==, vb.)
 * 
 * Operatör Türleri:
 * 1. Aritmetik Operatörler (Matematiksel işlemler)
 * 2. Karşılaştırma Operatörleri (İki değeri karşılaştır)
 * 3. Mantıksal Operatörler (true/false işlemleri)
 * 4. Atama Operatörleri (Değer atama)
 */

public class Operators {
    public static void main(String[] args) {
        
        // ============================================
        // 1. ARİTMETİK OPERATÖRLER
        // ============================================
        
        System.out.println("=== ARİTMETİK OPERATÖRLER ===\n");
        
        int a = 10;
        int b = 3;
        
        // Toplama (+)
        int toplam = a + b;
        System.out.println("10 + 3 = " + toplam);  // 13
        
        // Çıkarma (-)
        int fark = a - b;
        System.out.println("10 - 3 = " + fark);    // 7
        
        // Çarpma (*)
        int carpim = a * b;
        System.out.println("10 * 3 = " + carpim);  // 30
        
        // Bölme (/)
        int bolum = a / b;
        System.out.println("10 / 3 = " + bolum);   // 3 (tam kısım)
        
        // Mod - Kalan (%)
        int kalan = a % b;
        System.out.println("10 % 3 = " + kalan);   // 1 (kalan)
        
        
        // Ondalıklı bölme (double kullan!)
        double ondalikliBolum = 10.0 / 3.0;
        System.out.println("10.0 / 3.0 = " + ondalikliBolum);  // 3.333...
        
        
        // Artırma/Azaltma Operatörleri
        int sayi = 5;
        
        sayi++;  // sayi = sayi + 1
        System.out.println("\nsayi++ sonrası: " + sayi);  // 6
        
        sayi--;  // sayi = sayi - 1
        System.out.println("sayi-- sonrası: " + sayi);    // 5
        
        
        // ++ ve -- farkı (önce/sonra)
        int x = 5;
        int y = x++;  // Önce ata, sonra artır
        System.out.println("\nx++ → y: " + y + ", x: " + x);  // y=5, x=6
        
        int m = 5;
        int n = ++m;  // Önce artır, sonra ata
        System.out.println("++m → n: " + n + ", m: " + m);    // n=6, m=6
        
        
        // ============================================
        // 2. KARŞILAŞTIRMA OPERATÖRLERİ
        // ============================================
        
        System.out.println("\n=== KARŞILAŞTIRMA OPERATÖRLERİ ===\n");
        
        int num1 = 10;
        int num2 = 20;
        
        // Eşit mi? (==)
        boolean esitMi = (num1 == num2);
        System.out.println("10 == 20 → " + esitMi);  // false
        
        // Eşit değil mi? (!=)
        boolean esitDegilMi = (num1 != num2);
        System.out.println("10 != 20 → " + esitDegilMi);  // true
        
        // Büyük mü? (>)
        boolean buyukMu = (num1 > num2);
        System.out.println("10 > 20 → " + buyukMu);  // false
        
        // Küçük mü? (<)
        boolean kucukMu = (num1 < num2);
        System.out.println("10 < 20 → " + kucukMu);  // true
        
        // Büyük veya eşit mi? (>=)
        boolean buyukEsitMi = (num1 >= 10);
        System.out.println("10 >= 10 → " + buyukEsitMi);  // true
        
        // Küçük veya eşit mi? (<=)
        boolean kucukEsitMi = (num1 <= 5);
        System.out.println("10 <= 5 → " + kucukEsitMi);  // false
        
        
        // ============================================
        // 3. MANTIKSAL OPERATÖRLER
        // ============================================
        
        System.out.println("\n=== MANTIKSAL OPERATÖRLER ===\n");
        
        boolean dogruMu = true;
        boolean yanlisMi = false;
        
        // VE - AND (&&)
        // İkisi de true ise sonuç true
        boolean veIslemi = dogruMu && yanlisMi;
        System.out.println("true && false → " + veIslemi);  // false
        
        boolean veIslemi2 = dogruMu && dogruMu;
        System.out.println("true && true → " + veIslemi2);  // true
        
        
        // VEYA - OR (||)
        // Birisi true ise sonuç true
        boolean veyaIslemi = dogruMu || yanlisMi;
        System.out.println("true || false → " + veyaIslemi);  // true
        
        boolean veyaIslemi2 = yanlisMi || yanlisMi;
        System.out.println("false || false → " + veyaIslemi2);  // false
        
        
        // DEĞİL - NOT (!)
        // true'yu false, false'u true yapar
        boolean degilIslemi = !dogruMu;
        System.out.println("!true → " + degilIslemi);  // false
        
        boolean degilIslemi2 = !yanlisMi;
        System.out.println("!false → " + degilIslemi2);  // true
        
        
        // Gerçek hayat örneği
        int yas = 20;
        boolean ogrenciMi = true;
        
        // Yaşı 18'den büyük VE öğrenci mi?
        boolean indirimHakki = (yas > 18) && ogrenciMi;
        System.out.println("\nİndirim hakkı var mı? " + indirimHakki);  // true
        
        
        // ============================================
        // 4. ATAMA OPERATÖRLERİ
        // ============================================
        
        System.out.println("\n=== ATAMA OPERATÖRLERİ ===\n");
        
        int puan = 50;
        
        // Basit atama (=)
        puan = 100;
        System.out.println("puan = 100 → " + puan);  // 100
        
        
        // Topla ve ata (+=)
        puan += 20;  // puan = puan + 20
        System.out.println("puan += 20 → " + puan);  // 120
        
        
        // Çıkar ve ata (-=)
        puan -= 10;  // puan = puan - 10
        System.out.println("puan -= 10 → " + puan);  // 110
        
        
        // Çarp ve ata (*=)
        puan *= 2;   // puan = puan * 2
        System.out.println("puan *= 2 → " + puan);   // 220
        
        
        // Böl ve ata (/=)
        puan /= 4;   // puan = puan / 4
        System.out.println("puan /= 4 → " + puan);   // 55
        
        
        // Mod ve ata (%=)
        puan %= 10;  // puan = puan % 10
        System.out.println("puan %= 10 → " + puan);  // 5
        
        
        // ============================================
        // 5. OPERATÖR ÖNCELİĞİ (İşlem Sırası)
        // ============================================
        
        System.out.println("\n=== OPERATÖR ÖNCELİĞİ ===\n");
        
        // Matematikteki gibi: Önce çarpma/bölme, sonra toplama/çıkarma
        int sonuc1 = 5 + 3 * 2;
        System.out.println("5 + 3 * 2 = " + sonuc1);  // 11 (önce 3*2, sonra +5)
        
        // Parantez en yüksek önceliğe sahip
        int sonuc2 = (5 + 3) * 2;
        System.out.println("(5 + 3) * 2 = " + sonuc2);  // 16
        
        
        /*
         * Operatör Öncelik Sırası (yüksekten düşüğe):
         * 1. () - Parantez
         * 2. ++, -- - Artırma/Azaltma
         * 3. *, /, % - Çarpma, Bölme, Mod
         * 4. +, - - Toplama, Çıkarma
         * 5. <, >, <=, >= - Karşılaştırma
         * 6. ==, != - Eşitlik kontrolü
         * 7. && - VE
         * 8. || - VEYA
         * 9. =, +=, -=, *=, /= - Atama
         */
        
        
        // ============================================
        // 6. Gerçek Hayat Örnekleri
        // ============================================
        
        System.out.println("\n=== GERÇEK HAYAT ÖRNEKLERİ ===\n");
        
        // Örnek 1: Toplam Fiyat Hesaplama
        double urunFiyati = 100.0;
        int adet = 3;
        double kdvOrani = 0.20;  // %20
        
        double araTop = urunFiyati * adet;
        double kdv = araTop * kdvOrani;
        double toplamFiyat = araTop + kdv;
        
        System.out.println("Ürün Fiyatı: " + urunFiyati + " TL");
        System.out.println("Adet: " + adet);
        System.out.println("KDV: " + kdv + " TL");
        System.out.println("Toplam: " + toplamFiyat + " TL");
        
        
        // Örnek 2: Yaş Kontrolü
        int kullaniciYasi = 17;
        boolean ehliyetVarMi = false;
        
        boolean arabaKullanabilirMi = (kullaniciYasi >= 18) && ehliyetVarMi;
        System.out.println("\nAraba kullanabilir mi? " + arabaKullanabilirMi);  // false
        
        
        // Örnek 3: İndirim Hesaplama
        double fiyat = 1000.0;
        boolean uyelikVarMi = true;
        
        if (uyelikVarMi) {
            fiyat *= 0.90;  // %10 indirim (fiyat = fiyat * 0.90)
        }
        
        System.out.println("İndirimli fiyat: " + fiyat + " TL");
        
        
        // ============================================
        // 7. Özet ve Önemli Notlar
        // ============================================
        
        System.out.println("\n✅ Operatörler konusu tamamlandı!");
        
        /*
         * HIZLI ÖZET:
         * 
         * Aritmetik: +, -, *, /, %, ++, --
         * Karşılaştırma: ==, !=, >, <, >=, <=
         * Mantıksal: &&, ||, !
         * Atama: =, +=, -=, *=, /=, %=
         */
        
        /*
         * YAYGIN HATALAR:
         * 
         * ❌ if (x = 5)  → Yanlış! (atama)
         * ✅ if (x == 5) → Doğru! (karşılaştırma)
         * 
         * ❌ 10 / 3 → 3 (int bölme)
         * ✅ 10.0 / 3.0 → 3.333... (double bölme)
         * 
         * ❌ x++ vs ++x farkını bilmemek
         * ✅ Hangisinin önce/sonra olduğunu öğren!
         */
        
        /*
         * İPUÇLARI:
         * 
         * - Karmaşık işlemlerde parantez kullan: (a + b) * c
         * - Kod okunabilirliği için boşluk bırak: a + b (a+b yerine)
         * - Öncelik emin değilsen parantez kullan
         */
        
    }
}