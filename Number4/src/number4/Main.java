package number4;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float total;
        String tp1, tp2, tk1, tk2, kuis1, kuis2, uas;
        Scanner inputTp1 = new Scanner(System.in);
        Scanner inputTp2 = new Scanner(System.in);
        Scanner inputTk1 = new Scanner(System.in);
        Scanner inputTk2 = new Scanner(System.in);
        Scanner inputKuis1 = new Scanner(System.in);
        Scanner inputKuis2 = new Scanner(System.in);
        Scanner inputUas = new Scanner(System.in);

        System.out.print("Masukan nilai Tugas Pribadi 1 (TP1) ...");
        tp1 = inputTp1.nextLine();
        while ( !isNumeric(tp1) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Pribadi 1 (TP1) kembali ...");
            tp1 = inputTp1.nextLine();
        }

        System.out.print("Masukan nilai Tugas Pribadi 2 (TP2) ...");
        tp2 = inputTp2.nextLine();
        while ( !isNumeric(tp2) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Pribadi 2 (TP2) kembali ...");
            tp2 = inputTp2.nextLine();
        }

        System.out.print("Masukan nilai Tugas Kelompok 1 (TK1) ...");
        tk1 = inputTk1.nextLine();
        while ( !isNumeric(tk1) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Kelompok 1 (TK1) kembali ...");
            tk1 = inputTk1.nextLine();
        }

        System.out.print("Masukan nilai Tugas Kelompok 2 (TK2) ...");
        tk2 = inputTk2.nextLine();
        while ( !isNumeric(tk2) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Tugas Kelompok 2 (TK2) kembali ...");
            tk2 = inputTk2.nextLine();
        }

        System.out.print("Masukan nilai Kuis 1 ...");
        kuis1 = inputKuis1.nextLine();
        while ( !isNumeric(kuis1) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Kuis 1 kembali ...");
            kuis1 = inputKuis1.nextLine();
        }

        System.out.print("Masukan nilai Kuis 2 ...");
        kuis2 = inputKuis2.nextLine();
        while ( !isNumeric(kuis2) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai Kuis 2 kembali ...");
            kuis2 = inputKuis2.nextLine();
        }

        System.out.print("Masukan nilai UAS ...");
        uas = inputUas.nextLine();
        while ( !isNumeric(uas) )
        {
            System.out.print("Nilai mengandung huruf, harap masukkan nilai UAS kembali ...");
            uas = inputUas.nextLine();
        }

        total = calculateScore(15, Float.parseFloat(tp1)) + calculateScore(15, Float.parseFloat(tp2)) + calculateScore(10, Float.parseFloat(tk1)) +
                calculateScore(10, Float.parseFloat(tk2)) + calculateScore(10, Float.parseFloat(kuis1)) + calculateScore(10, Float.parseFloat(kuis2)) + calculateScore(30, Float.parseFloat(uas));

       if (total >= 85)
       {
           System.out.println("Mahasiswa mendapat grade A");
       }
       else if (total >= 75 & total < 85)
       {
           System.out.println("Mahasiswa mendapat grade B");
       }
       else if (total >= 65 & total < 75)
       {
           System.out.println("Mahasiswa mendapat grade C");
       }
       else if (total >= 50 & total < 65)
       {
           System.out.println("Mahasiswa mendapat grade D");
       }
       else
       {
           System.out.println("Mahasiswa mendapat grade E");
       }
        System.out.println("Nilai Mahasiswa ... " + String.format("%.02f", total));
    }
    public static boolean isNumeric(String strNum)
    {
        if (strNum == null)
        {
            return false;
        }
        try
        {
            Double.parseDouble(strNum);
        }
        catch (NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
    public static float calculateScore(int counter, float score)
    {
        float d = 0;
        try
        {
            d = (score * (float)(counter/100.0));
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Error saat menghitung nilai");
        }
        return d;
    }
}
