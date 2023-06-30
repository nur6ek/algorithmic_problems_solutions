//Problem https://hyperskill.org/learn/step/2194
import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zero=0, one=0, minusone=0;
        int n= scanner.nextInt();
        for(int i=0; i<n; ++i){
            int a= scanner.nextInt();
            if(a==0) zero++;
            if(a==1) one++;
            if(a==-1) minusone++;
        }
        System.out.println(zero+" "+one+" "+minusone);
    }
}
