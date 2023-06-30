//Problem https: //hyperskill.org/learn/step/2225
import java.util.Scanner;
class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0,n;
        do {
            i++;
            n= scanner.nextInt();
        }while(n!=0);
        System.out.println(--i);
    }
}
