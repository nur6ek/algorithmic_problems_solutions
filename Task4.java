//Problem https://hyperskill.org/learn/step/2187
import java.util.Scanner;
class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int s=0;
        for(int i=a; i<=b; ++i){
            s+=i;
        }
        System.out.println(s);
    }
}