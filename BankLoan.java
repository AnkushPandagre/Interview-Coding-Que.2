import java.util.Scanner;

public class BankLoan{
    void interset(int p , int t){
        System.out.println("personal lone");
        Scanner sc = new Scanner(System.in);
        // int p, t, i;
        System.out.println("enter the priciple amoount");
        p = sc.nextInt();
        System.out.println("Enter the time");
        t = sc.nextInt();
        System.out.println("Enter Interset rate");

        int i = 10;
         int ploan = (p*t*i)/100;
        System.out.println(ploan);
    }
    void interset(int p , int t, int i ){
        System.out.println("Home lone");
        Scanner sc = new Scanner(System.in);
        // int p, t, i;
        System.out.println("enter the priciple amoount");
        p = sc.nextInt();
        System.out.println("Enter the time");
        t = sc.nextInt();
        System.out.println("Enter Interset rate");
        i = sc.nextInt();
        int hloan = (p*t*i)/100;
        System.out.println(hloan);
    }
    void interset(int p , int t, int i , int d){
        System.out.println("Home lone");
        Scanner sc = new Scanner(System.in);
        // int p, t, i;
        System.out.println("enter the priciple amoount");
        p = sc.nextInt();
        System.out.println("Enter the time");
        t = sc.nextInt();
        System.out.println("Enter Interset rate");
        i = sc.nextInt();
        int loan = (p*t*i)/100;
        System.out.println();
        System.out.println("personal loan"+loan);
        System.out.println("enter the discount value");
         d= sc.nextInt();
         int cloan = loan -d;
         System.out.println("car  load is " + cloan);
    }
}
class loanCalcuator{
public static void main(String[] args) {
    BankLoan b = new BankLoan();
    int p=0 ,t=0,i=0,d=0;
    
b.interset(p,t);
    b.interset(p,t,i);
    b.interset(p,t,i,d);
// b.interset(0, 0);
}
}