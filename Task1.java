//Problem https://hyperskill.org/learn/step/2229

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long s= scanner.nextLong();
        long k=1; long i=0;
        while(s>=k){
            i++;
            k*=i;
        }
        System.out.println(i);
    }
}