package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
   public static void main(String[] args) {

        // ==========================================
        // Soal 1: ArrayList Daftar Belanja
        // ==========================================
        System.out.println("=== Jawaban Soal 1 ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Tambah 4 item
        daftarBelanja.add("Minyak Goreng"); // indeks 0
        daftarBelanja.add("Beras");         // indeks 1 (item ke-2)
        daftarBelanja.add("Gula");          // indeks 2
        daftarBelanja.add("Telur");         // indeks 3
        
        // Hapus item ke-2 (berada di indeks 1 karena indeks ArrayList mulai dari 0)
        daftarBelanja.remove(1);
        
        // Tampilkan isi list
        System.out.println("Isi daftar belanja setelah dihapus: " + daftarBelanja);
        // Tampilkan jumlah akhirnya menggunakan .size()
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println();


        // ==========================================
        // Soal 2: Nilai Terbesar di ArrayList
        // ==========================================
        System.out.println("=== Jawaban Soal 2 ===");
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        daftarAngka.add(24);
        daftarAngka.add(87);
        daftarAngka.add(53);
        daftarAngka.add(91);
        daftarAngka.add(12);
        
        // Inisialisasi nilai terbesar dengan elemen pertama (indeks 0)
        int nilaiTerbesar = daftarAngka.get(0);
        
        // Menelusuri seluruh elemen dengan for-each loop
        for (int angka : daftarAngka) {
            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka;
            }
        }
        System.out.println("Daftar angka   : " + daftarAngka);
        System.out.println("Nilai terbesar : " + nilaiTerbesar);
        System.out.println();


        // ==========================================
        // Soal 3: Filter Nama Diawali Huruf 'A'
        // ==========================================
        System.out.println("=== Jawaban Soal 3 ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dewi");
        
        System.out.println("Nama yang diawali dengan huruf A:");
        for (String nama : daftarNama) {
            // Menggunakan method .startsWith() untuk mengecek awalan string
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    } 
    
}
