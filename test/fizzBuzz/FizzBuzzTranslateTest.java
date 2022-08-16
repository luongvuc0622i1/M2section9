package fizzBuzz;

import java.util.Scanner;

class FizzBuzzTranslateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 số lớn hơn 0 nhỏ hơn 100:");
        int number = input.nextInt();

        FizzBuzzTranslate fizzBuzz = new FizzBuzzTranslate();
        System.out.println(fizzBuzz.getResult(number));
    }
}