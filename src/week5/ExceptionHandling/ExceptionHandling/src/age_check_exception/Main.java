package week5.ExceptionHandling.ExceptionHandling.src.age_check_exception;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("Yaş Hatası!!");
        }
        System.out.println("Yaşınız Uygundur");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı Giriniz: ");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
