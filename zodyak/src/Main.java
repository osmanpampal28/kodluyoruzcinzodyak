import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int yil;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        yil=scanner.nextInt();
        while(yil<0){
            System.out.println("hatalı! Lütfen yılı tekrar giriniz : ");
            yil=scanner.nextInt();
        }
        if(yil%12==0)
            System.out.println("Çin zodyağı burcunuz : Maymun");
        if(yil%12==1)
            System.out.println("Çin zodyağı burcunuz : Horoz");
        if(yil%12==2)
            System.out.println("Çin zodyağı burcunuz : Köpek");
        if(yil%12==3)
            System.out.println("Çin zodyağı burcunuz : Domuz");
        if(yil%12==4)
            System.out.println("Çin zodyağı burcunuz : Fare");
        if(yil%12==5)
            System.out.println("Çin zodyağı burcunuz : Öküz");
        if(yil%12==6)
            System.out.println("Çin zodyağı burcunuz : Kaplan");
        if(yil%12==7)
            System.out.println("Çin zodyağı burcunuz : Tavşan");
        if(yil%12==8)
            System.out.println("Çin zodyağı burcunuz : Ejderha");
        if(yil%12==9)
            System.out.println("Çin zodyağı burcunuz : Yılan");
        if(yil%12==10)
            System.out.println("Çin zodyağı burcunuz : At");
        if(yil%12==11)
            System.out.println("Çin zodyağı burcunuz : Koyun");



    }
}
