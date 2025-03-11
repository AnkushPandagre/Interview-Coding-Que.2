import java.util.Scanner;

public class sumOfdigit {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int r ,sum = 0 ;
          int num = sc.nextInt();
        while ( num!=0) {
             r =  num %10;
             sum = sum +r;
            num = num /10;
        }
        System.out.println(sum);
    }
}
