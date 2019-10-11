package menghitungkecepatan;

import java.util.Scanner;

/**
 *
 * @author Nadila Handayani Putri
 */
public class MenghitungKecepatan {
    public static void main(String[] args) {
        Scanner hitung = new Scanner(System.in);
        
        int waktu;
        double jarak, kecepatan;
        
        System.out.println("MENGHITUNG KECEPATAN");
        System.out.print("jarak (km) = ");
        jarak = hitung.nextInt();
        System.out.print("waktu (jam) = ");
        waktu = hitung.nextInt();
        
        kecepatan = jarak / waktu;
        System.out.println("kecepatan = " + kecepatan + " km/jam");
        
        if (kecepatan >= 70) {
            System.out.println("Kurangi Kecepatan Anda");
        } else {
            System.out.println("Pertahankan Kecepatan Anda");
        }
    }
    
}
