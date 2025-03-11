public class last_num {
    public static void main(String[] args) {
        int n = 10899;
        while (n!=0) {
            int lastNum = n%10;
            n  = n/10;
            System.out.println(lastNum);
        }
    }
}
