import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz yılı giriniz : ");
        yil = input.nextInt();

        if (yil % 12 == 0) {
            System.out.println("Çin Zodyağına Göre Burcunuz Maymun");
        }
        if (yil % 12 == 1) {
            System.out.println("Çin Zodyağına Göre Burcunuz Horoz");
        }
        if (yil % 12 == 2) {
            System.out.println("Çin Zodyağına Göre Burcunuz Köpek");
        }
        if (yil % 12 == 3) {
            System.out.println("Çin Zodyağına Göre Burcunuz Domuz");
        }
        if (yil % 12 == 4) {
            System.out.println("Çin Zodyağına Göre Burcunuz Fare");
        }
        if (yil % 12 == 5) {
            System.out.println("Çin Zodyağına Göre Burcunuz Öküz");
        }
        if (yil % 12 == 6) {
            System.out.println("Çin Zodyağına Göre Burcunuz Kaplan");
        }
        if (yil % 12 == 7) {
            System.out.println("Çin Zodyağına Göre Burcunuz Tavşan");
        }
        if (yil % 12 == 8) {
            System.out.println("Çin Zodyağına Göre Burcunuz Ejderha");
        }
        if (yil % 12 == 9) {
            System.out.println("Çin Zodyağına Göre Burcunuz Yılan");
        }
        if (yil % 12 == 10) {
            System.out.println("Çin Zodyağına Göre Burcunuz At");
        }
        if (yil % 12 == 11) {
            System.out.println("Çin Zodyağına Göre Burcunuz Koyun");
        }

    }
}