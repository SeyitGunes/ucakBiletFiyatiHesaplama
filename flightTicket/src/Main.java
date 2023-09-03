import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenlerimizi tanımlayalım
        int age, direction;
        double km, tutar;

        Scanner input = new Scanner(System.in);
        // kullanıcıdan isteklerimizi belirtelim
        System.out.print("Mesafeyi KM türünden giriniz: ");
        km = input.nextDouble();

        tutar = km * 0.10;

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (tek yön => 1  gidiş-dönüş => 2) : ");
        direction = input.nextInt();

        if (!(km > 0) || !(age > 0) || !(direction == 1 || direction == 2)) {
            System.out.println("Hatalı veri girdiniz!!");
        } else if (age < 12) {
            tutar = (tutar * 20) / 100;

        } else if (age >= 12 && age <= 24) {
            tutar = (tutar * 0.90) / 100;
        } else if (age > 65) {
            tutar = (tutar * 0.70) / 100;
        } else if (direction == 2) {
            tutar = (tutar * 0.20) /100;
        }

        System.out.println("Toplam ödemeniz gereken tutar: " + tutar);
    }
}
