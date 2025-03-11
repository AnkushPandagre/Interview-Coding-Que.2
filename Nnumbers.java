import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

             int nat = 1;
             for( nat = 1; nat<=n; nat++){
                System.out.println(nat);
                nat++;
            }
    }
}
