package Semestr2.lab13;

public class Example7 {
    public static void main(String[] args) {
        try{System.out.println("0");
            throw new NullPointerException("Ошибка");
        }catch (NullPointerException e){
            System.out.println("1");
            try{throw new ArithmeticException();}
            catch (ArithmeticException e2) {System.out.println("2");}}
        System.out.println("3");}}
