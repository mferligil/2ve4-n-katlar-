import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz:");
            n=scan.nextInt();
            if (n %4==0) {
                total=total+ n;
            }
            }while (n %2==0);

            System.out.println("Toplam"+total);
        }
    }

