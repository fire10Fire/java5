package DörtVeBesinKatı;
import java.util.Scanner;
public class DortVeBes {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    System.out.print("Sınır değeri yazınız : ");
    int ila = 0; 
    ila = in.nextInt();
    
    System.out.print("dördün katları : ");
    for(int a =1 ; ila>a*4; a++ ){
        System.out.print(a*4 + ", ");
    }
    System.out.print("\nBeşin katları : ");
    for(int a =1 ; ila>a*5; a++ ){
        System.out.print(a*5 + ", ");
    }
    }
}
