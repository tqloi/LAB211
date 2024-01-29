
package view_controller;

public class Application {

 
    public static void main(String[] args) {
        // Số cần kiểm tra thành phần
        int input = 30;

        System.out.print(input + " = ");
        primeFactorization(input);
    }

    // Phương thức để tìm và in ra các thành phần nguyên tố
    public static void primeFactorization(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i);
                num /= i;
                if (num > 1) {
                    System.out.print(" x ");
                }
            }
        }
        System.out.println();
    }
}

