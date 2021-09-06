package Assignment2;
import java.util.*;
import java.net.SocketOption;
class Program2 {
    public static void main(String[] args) {

            char ch;
            Double number1, number2, result;


            Scanner input = new Scanner(System.in);


            System.out.println("Enter the sign you want to perform : +, -, *, / or %");
            ch = input.next().charAt(0);


            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            switch (ch) {

                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;


                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;


                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;


                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                case '%':
                    result = number1 % number2;
                    System.out.println(number1 + " % " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            input.close();
        }
    }