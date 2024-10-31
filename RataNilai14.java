import java.util.Scanner;
public class RataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        float Nilai, TotalNilai, rataNilai;

        while (i <= 5) { 
            TotalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (int j = 1; j <= 5; j++) { 
                System.out.print("Nilai ke-" + j + " = ");
                Nilai = sc.nextInt();
                TotalNilai += Nilai;
            }
            rataNilai = TotalNilai / 5; 
            System.out.println("Rata Rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}