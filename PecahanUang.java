import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Uang : ");
        double Jumlah = input.nextDouble();

        int SeratusRibu = (int)(Jumlah / 100000);
        int sisa = (int)(Jumlah % 100000);
        int LimaPuluhRibu = sisa / 50000;
        int sisa2 = (int)(Jumlah % 50000);
        int DuaPuluhRibu = sisa2 / 20000;
        int sisa3 = (int)(Jumlah % 20000);
        int SepuluhRibu = sisa3 / 10000;
        int sisa4 = (int)(Jumlah % 10000);
        int LimaRibu = sisa4 / 5000;
        int sisa5 = (int)(Jumlah % 5000);
        int DuaRibu = sisa5 / 2000;
        int sisa6 = (int)(Jumlah % 2000);
        int Seribu = sisa6 / 1000;
        int sisa7 = (int)(Jumlah % 1000);
        int Limaratus = sisa7 / 500;
        int sisa8 = (int)(Jumlah % 500);
        int DuaRatus = sisa8 / 200;
        int sisa9 = (int)(Jumlah % 200);
        int Seratus = sisa9 / 100;
        int sisa10 = (int)(Jumlah % 100);
        int LimaPuluh = sisa10 / 50;

        System.out.println(" Jumlah Seratus Ribuan = " + SeratusRibu);
        System.out.println(" Jumlah Lima Puluh Ribuan = " + LimaPuluhRibu);
        System.out.println(" Jumlah Dua Puluh Ribuan = " + DuaPuluhRibu);
        System.out.println(" Jumlah Sepuluh Ribuan = " + SepuluhRibu);
        System.out.println(" Jumlah Lima Ribuan = " + LimaRibu);
        System.out.println(" Jumlah Dua Ribuan = " + DuaRibu);
        System.out.println(" Jumlah Seribuan = " + Seribu);
        System.out.println(" Jumlah Lima Ratusan = " + Limaratus);
        System.out.println(" Jumlah Dua Ratusan = " + DuaRatus);
        System.out.println(" Jumlah Seratusan = " + Seratus);
        System.out.println(" Jumlah Lima Puluhan = " + LimaPuluh);

        input.close();
    }
}
