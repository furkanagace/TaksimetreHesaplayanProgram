import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //perKm= km başına
        //total=toplam
        //startPrice=başlangıç ucreti
        int km;
        double perKm = 2.20, total = 0, startPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = total + (km * perKm);
        total +=startPrice;

        total=(total<20) ? 20 : total;
        System.out.println("Toplam tutar : "+total);


    }
}

