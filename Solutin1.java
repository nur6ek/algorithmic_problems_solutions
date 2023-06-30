// Problem link https://acmp.ru/asp/do/index.asp?main=task&id_course=1&id_section=1&id_topic=28&id_problem=160

import java.util.Scanner;
class EndOfLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(9 + (n * 45 + (n / 2) * 5 + (n - 1) / 2 * 15) / 60 + " " + (n * 45 + (n / 2) * 5 + (n - 1) / 2 * 15) % 60);
    }
}


/* C++ solution
#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    cout<<9+(n*45+(n/2)*5+(n-1)/2*15)/60<<' '<<(n*45+(n/2)*5+(n-1)/2*15)%60;
    return 0;
}
*/
