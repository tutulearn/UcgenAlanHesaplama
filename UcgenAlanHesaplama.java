import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,ucgeninAlani,ucgeninCevresi;
        System.out.println("Üçgenin 1.Kenarını Giriniz: ");
        a = input.nextDouble();
        System.out.println("Üçgenin 2.Kenarını Giriniz: ");
        b=input.nextDouble();
        System.out.println("Üçgenin 3.Kenarını Giriniz: ");
        c=input.nextDouble();

        ucgeninCevresi=a+b+c;
        ucgeninAlani=ucgeninCevresi/2*(ucgeninCevresi/2-a)*(ucgeninCevresi/2-b)*(ucgeninCevresi/2-c);

        System.out.println("Kenarlarını girdiğiniz üçgenin Alanı: "+ucgeninAlani);

    }
}
