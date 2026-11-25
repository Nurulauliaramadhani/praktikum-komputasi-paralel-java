
# Praktikum Komputasi Paralel Menggunakan Java

## Identitas
- Nama: Nurul Aulia Ramadhani
- NIM: D0224032
- Kelas: D 2024

## Deskripsi
Proyek ini merupakan praktikum Komputasi Paralel yang membandingkan kinerja pemrosesan data secara serial dan paralel menggunakan bahasa pemrograman Java.

## Tujuan
1. Memahami konsep pemrosesan serial dan paralel.
2. Mengimplementasikan Thread pada Java.
3. Membandingkan waktu eksekusi kedua metode.

## Permasalahan
Menghitung jumlah kuadrat bilangan dari 1 sampai 1.000.000.

Rumus:
1² + 2² + 3² + ... + 1.000.000²

## Implementasi
- Main.java: program awal untuk memastikan Java berjalan.
- Serial.java: menghitung seluruh data secara berurutan menggunakan satu alur pemrosesan.
- Parallel.java: membagi perhitungan menjadi empat bagian menggunakan empat Thread.

## Hasil Pengujian

Pengujian dilakukan sebanyak lima kali untuk setiap metode.

### Serial

| Percobaan | Waktu (detik) |
|---|---:|
| 1 | 0.013417 |
| 2 | 0.0106015 |
| 3 | 0.0119962 |
| 4 | 0.0084917 |
| 5 | 0.0154895 |
| Rata-rata | 0.01199918 |

### Parallel

| Percobaan | Waktu (detik) |
|---|---:|
| 1 | 0.0403071 |
| 2 | 0.0290519 |
| 3 | 0.0151749 |
| 4 | 0.0391645 |
| 5 | 0.0328424 |
| Rata-rata | 0.03130816 |

## Kesimpulan
Kedua metode menghasilkan total perhitungan yang sama, yaitu 333333833333500000.

Berdasarkan hasil pengujian, metode serial memiliki waktu rata-rata lebih cepat dibandingkan metode paralel pada jumlah data yang digunakan. Hal ini menunjukkan bahwa penggunaan Thread memiliki biaya tambahan sehingga tidak selalu menghasilkan waktu eksekusi yang lebih singkat.
