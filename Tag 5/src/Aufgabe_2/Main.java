package Aufgabe_2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Operate op;
    public static void main(String[] args) {
        double a = 0, b = 0;
        char operation;
        System.out.println("Verfügbare Operationen: -, +, *, /");
        System.out.print("Wähle eine Operation: ");
        operation = new Scanner(System.in).next().charAt(0);
        try{
            System.out.print("1. Zahl eingeben: ");
            a = Double.parseDouble(sc.nextLine());
            System.out.print("2. Zahl eingeben: ");
            b = Double.parseDouble(sc.nextLine());
        }catch(NumberFormatException e){
            System.out.println("Falsches Zahlenformat");
        }
        switch(operation){
            case '+' -> op = new Addition();
            case '-' -> op = new Substraction();
            case '*' -> op = new Multiplication();
            case '/' -> op = new Division();
        }
        System.out.println(a + " " + operation + " " + b + " = " + op.operationResult(a, b));
    }
}
