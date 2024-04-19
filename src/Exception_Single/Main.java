package Exception_Single;

import Exception_Single.InvalidAgeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = scanner.nextInt();

        try{
            if(age < 0){
                throw new InvalidAgeException("Age is not invalid!");
            }
        }catch (InvalidAgeException invalidAgeException){
            System.out.println("An error detected : " + invalidAgeException.getMessage());
        }
    }
}