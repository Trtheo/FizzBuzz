import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
         int input=sc.nextInt();
                    if (input % 3 == 0 && input % 5 == 0) {
                        System.out.println("FizzBuzz"); // divisible by both 3 and 5
                    } else if (input % 3 == 0) {
                        System.out.println("Fizz"); // divisible by 3
                    } else if (input % 5 == 0) {
                        System.out.println("Buzz"); // divisible by 5
                    } else {
                        System.out.println(input); // neither divisible by 3 nor 5
                    }
                }
            }



