package Aufgabe_2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Operation op;
    public static void main(String[] args) {
        double a = 0, b = 0;
        System.out.println("Verfügbare Operationen: -, +, *, /");
        System.out.print("Wähle eine Operation: ");
        char operation = new Scanner(System.in).next().charAt(0);
        try{
            System.out.print("1. Zahl eingeben: ");
            a = Double.parseDouble(sc.nextLine());
            System.out.print("2. Zahl eingeben: ");
            b = Double.parseDouble(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Falsches Zahlenformat");
        }
        switch(operation){
            case '+' -> op = new Operation(new Addition());
            case '-' -> op = new Operation(new Substraction());
            case '*' -> op = new Operation(new Multiplication());
            case '/' -> op = new Operation(new Division());
        }
        System.out.println(a + " " + operation + " " + b + " = " + op.getOperation().operationResult(a, b));
    }
}
