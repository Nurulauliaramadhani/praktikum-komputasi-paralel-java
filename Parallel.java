
public class Parallel {

    static final int JUMLAH_THREAD = 4;
    static final long N = 1000000;

    static long[] hasil = new long[JUMLAH_THREAD];

    static class Worker extends Thread {
        private int nomor;
        private long awal;
        private long akhir;

        Worker(int nomor, long awal, long akhir) {
            this.nomor = nomor;
            this.awal = awal;
            this.akhir = akhir;
        }

        public void run() {
            long total = 0;

            for (long i = awal; i <= akhir; i++) {
                total += i * i;
            }

            hasil[nomor] = total;
        }
    }

    public static void main(String[] args)
            throws InterruptedException {

        Thread[] threads = new Thread[JUMLAH_THREAD];

        long ukuranBagian = N / JUMLAH_THREAD;

        long waktuMulai = System.nanoTime();

        for (int i = 0; i < JUMLAH_THREAD; i++) {
            long awal = i * ukuranBagian + 1;
            long akhir = (i == JUMLAH_THREAD - 1)
                    ? N : (i + 1) * ukuranBagian;

            threads[i] = new Worker(i, awal, akhir);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long total = 0;

        for (long nilai : hasil) {
            total += nilai;
        }

        long waktuSelesai = System.nanoTime();

        double waktuDetik =
                (waktuSelesai - waktuMulai) / 1_000_000_000.0;

        System.out.println("=== HASIL PERHITUNGAN PARALEL ===");
        System.out.println("Jumlah data : " + N);
        System.out.println("Jumlah thread : " + JUMLAH_THREAD);
        System.out.println("Total       : " + total);
        System.out.println("Waktu       : " + waktuDetik + " detik");
    }
}
