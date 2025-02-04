package Demo.bankBranch;

import Demo.bank.*;
public class BankBranch extends Bank {
    public static void main(String[] args) {
        BankBranch.printPrimesLessThanN(19);
    }
    public static void printTriangle(int N) {
        for(int x = 1;x<=N;x++){
            for(int i = N-x;i>=0;i--){
                System.out.print(" ");
            }
            for(int j = 1;j<=(2*x-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPrimesLessThanN(int N) {
        if(N <= 2){
            System.out.println("No prime number");
            return;
        }

        for (int i = 2; i < N; i++) {
            if(isP(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static boolean isP(int num){
        for(int x = 2;x<num;x++){
            if(num % x == 0){
                return false;
            }
        }
        return true;
    }
}

