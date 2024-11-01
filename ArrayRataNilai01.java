import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        
        
        int[] nilaiMhs = new int[jumlah];
        double totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;
        
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }
        
        
        if (countLulus > 0) {
            double rataLulus = totalLulus / countLulus;
            System.out.println("Rata-rata nilai lulus = " + rataLulus);
        }
        
        if (countTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / countTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        }
        
        sc.close();
    }
}
