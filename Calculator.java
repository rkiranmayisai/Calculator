import java.util.*;
public class Calculator {
  public static void main(String[] args) {
    char op;
    Double num1, num2, res;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *,/:");
    op = sc.next().charAt(0);
    System.out.println("Enter first number");
    num1 = sc.nextDouble();
    System.out.println("Enter second number");
    num2 = sc.nextDouble();
    switch (op) {
      case '+':
        res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
        break;
      case '-':
        res = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + res);
        break;
      case '*':
        res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res);
        break;
      case '/':
        res = num1/ num2;
        System.out.println(num1 + " / " + num2 + " = " + res);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
    System.out.println("Calculator Completed");
  }
}
