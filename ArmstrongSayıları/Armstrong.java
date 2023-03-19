package ArmstrongSayıları;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean anahtar = true;

        while(anahtar){
            System.out.println("Sayı giriniz : ");
            int sayı = in.nextInt();
            int gecSayı = sayı;
            int gec2Sayı=sayı;
            int kalan = 0;
            int basSayı=0;
            int toplam=0;

            int sayıcı=0;
            // basamak sayısını hesaplar
            for(int i=1;gecSayı>0;i++){
                gecSayı /=10;  
                sayıcı++;
            } 
            System.out.println("basamak sayısı : "+ sayıcı);
            basSayı=sayıcı;

            for(int i =1;basSayı>=i;i++){
                kalan = gec2Sayı%10;
                System.out.println("basamağın değer :"+ kalan);
                int üsToplam=1;
                gec2Sayı=gec2Sayı/10;
                    for(int j=1;basSayı>=j;j++){
                        üsToplam *= kalan;
                        System.out.println("üsToplam"+üsToplam);
                    }

                    toplam+=üsToplam;
                }
                System.out.println("toplam : " + toplam);
                if(toplam==sayı){
                    System.out.println("girdiğiniz sayı bir Armstrong sayıdır");
                }            
                else 
                System.out.println("girdiğiniz sayı bir armstrong sayı değildir");

        }
    }
}
