
public class Serial {
    public static void main(String[] args) {

        long N = 1000000;
        long total = 0;

        long waktuMulai = System.nanoTime();

        for (long i = 1; i <= N; i++) {
            total += i * i;
        }

        long waktuSelesai = System.nanoTime();

        double waktuDetik =
            (waktuSelesai - waktuMulai) / 1_000_000_000.0;

        System.out.println("=== HASIL PERHITUNGAN SERIAL ===");
        System.out.println("Jumlah data : " + N);
        System.out.println("Total       : " + total);
        System.out.println("Waktu       : " + waktuDetik + " detik");
    }
}
