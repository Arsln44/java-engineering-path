# 📚 Modül 01: First Code (İlk Kod)

Java'da kod yazmaya başlıyoruz! Bu modülde programlamanın temel yapı taşlarını öğreniyoruz.

---

## 📋 İçindekiler

1. [Hello World](#1-hello-world)
2. [Variables (Değişkenler)](#2-variables-değişkenler)
3. [Reference Types](#3-reference-types-referans-tipleri)
4. [Operators (Operatörler)](#4-operators-operatörler)
5. [Console I/O (Konsol Giriş/Çıkış)](#5-console-io-konsol-girişçıkış)

---

## 1. Hello World

**Ne öğrendik?**
- İlk Java programını yazdık
- Program yapısını anladık (class, main metodu)
- Ekrana yazı yazdırmayı öğrendik

**Temel Kavramlar:**
- `public class` - Her Java programı bir class içinde
- `main` metodu - Programın başlangıç noktası
- `System.out.println()` - Ekrana yazdırma

**Neden önemli?**
> Her Java programı bu temel yapıyla başlar. Fundament (temel) budur.

---

## 2. Variables (Değişkenler)

**Ne öğrendik?**
- Değişken nedir ve nasıl kullanılır
- Veri tipleri (int, double, boolean, char, vb.)
- Değişken isimlendirme kuralları

**8 Primitive (İlkel) Tip:**
- **int** - Tam sayılar (yaş, adet, skor)
- **double** - Ondalıklı sayılar (fiyat, boy, sıcaklık)
- **boolean** - true/false (açık/kapalı, var/yok)
- **char** - Tek karakter (not: 'A', cinsiyet: 'E')
- **long** - Çok büyük tam sayılar
- **float** - Ondalıklı sayılar (daha az hassas)
- **byte** - Çok küçük sayılar (-128 ile 127)
- **short** - Küçük sayılar (-32,768 ile 32,767)

**Naming Conventions (İsimlendirme):**
- Küçük harfle başla: `yas`, `ogrenciSayisi`
- CamelCase kullan: `ogrenciSayisi`, `toplamFiyat`
- Anlamlı isimler: `fiyat`, `yas` (a, b, x yerine)

**Neden önemli?**
> Değişkenler, programın belleğidir. Her şeyi değişkenlerde saklarız.

---

## 3. Reference Types (Referans Tipleri)

**Ne öğrendik?**
- Reference type nedir
- String kullanımı
- Primitive vs Reference farkı

**String - En Önemli Reference Type:**
- Metin saklar (birden fazla karakter)
- Çift tırnak kullanılır: `"Merhaba"`
- Hazır metodları var: `length()`, `toUpperCase()`, `charAt()`

**Primitive vs Reference - Temel Fark:**

| Özellik | Primitive | Reference |
|---------|-----------|-----------|
| **Değer tutar** | Direkt değer | Adres (referans) |
| **Örnekler** | int, double, boolean | String, Array, Object |
| **null olabilir mi?** | Hayır | Evet |
| **Başlangıç** | Küçük harf | Büyük harf |

**Kritik Bilgi:**
- Primitive: Değer kopyalanır (bağımsız)
- Reference: Adres kopyalanır (aynı yeri gösterir)

**String Karşılaştırma:**
- ❌ `==` kullanma (adres karşılaştırır)
- ✅ `.equals()` kullan (içerik karşılaştırır)

**Neden önemli?**
> String her yerde kullanılır. Primitive vs Reference farkını bilmek kritik!

---

## 4. Operators (Operatörler)

**Ne öğrendik?**
- Matematiksel işlemler
- Karşılaştırmalar
- Mantıksal işlemler
- Değer atama kısayolları

### Aritmetik Operatörler
- `+` Toplama
- `-` Çıkarma
- `*` Çarpma
- `/` Bölme
- `%` Mod (kalan)
- `++` Bir artır
- `--` Bir azalt

### Karşılaştırma Operatörleri
- `==` Eşit mi?
- `!=` Eşit değil mi?
- `>` Büyük mü?
- `<` Küçük mü?
- `>=` Büyük veya eşit mi?
- `<=` Küçük veya eşit mi?

### Mantıksal Operatörler
- `&&` VE (AND) - İkisi de true olmalı
- `||` VEYA (OR) - Biri true olmalı
- `!` DEĞİL (NOT) - true ↔ false

### Atama Operatörleri
- `=` Ata
- `+=` Topla ve ata
- `-=` Çıkar ve ata
- `*=` Çarp ve ata
- `/=` Böl ve ata
- `%=` Mod al ve ata

**Önemli Hatalar:**
- `=` atama, `==` karşılaştırma (karıştırma!)
- `10 / 3` = 3 (int bölme, ondalığı atar)
- `10.0 / 3.0` = 3.333... (double bölme, doğru)

**Neden önemli?**
> Tüm hesaplamalar ve karşılaştırmalar operatörlerle yapılır.

---

## 5. Console I/O (Konsol Giriş/Çıkış)

**Ne öğrendik?**
- Ekrana yazı yazdırma
- Kullanıcıdan veri alma
- Scanner sınıfı kullanımı

### Output (Çıkış)
- `System.out.println()` - Yazdır ve alt satıra geç
- `System.out.print()` - Yazdır (alt satır yok)
- `System.out.printf()` - Formatlanmış yazdır

**Özel Karakterler:**
- `\n` - Yeni satır
- `\t` - Tab
- `\"` - Çift tırnak
- `\\` - Ters slash

### Input (Giriş)
**Scanner Kullanımı:**
1. Import et: `import java.util.Scanner;`
2. Oluştur: `Scanner scanner = new Scanner(System.in);`
3. Oku: `scanner.nextLine()`, `scanner.nextInt()`, vb.
4. Kapat: `scanner.close();`

**Scanner Metodları:**
- `nextLine()` - String (tüm satır)
- `next()` - String (ilk kelime)
- `nextInt()` - int
- `nextDouble()` - double
- `nextBoolean()` - boolean

**Kritik Problem:**
```
nextInt() veya nextDouble() sonrası nextLine() kullanırsan
→ Enter tuşunu temizle!
→ scanner.nextLine(); ekle
```

**printf() Format:**
- `%s` - String
- `%d` - int
- `%f` - double
- `%.2f` - 2 ondalık basamaklı

**Neden önemli?**
> Kullanıcıyla etkileşim burada başlar. Program giriş alıp çıktı verir.

---

## 🎯 Modül Özeti

Bu modülde Java'nın temel yapı taşlarını öğrendik:

✅ **Program Yapısı** - class ve main metodu  
✅ **Değişkenler** - Veri saklama  
✅ **Veri Tipleri** - Primitive ve Reference  
✅ **Operatörler** - Hesaplama ve karşılaştırma  
✅ **I/O** - Kullanıcıyla iletişim  

**Artık yapabilirsin:**
- Basit programlar yaz
- Kullanıcıdan veri al
- Hesaplamalar yap
- Sonuçları ekrana yazdır

---