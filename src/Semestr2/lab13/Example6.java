package Semestr2.lab13;

public class Example6 {
    public static void main(String[] args) {
        try{System.out.println("0");
            throw new NullPointerException("Ошибка");
        }catch (ArithmeticException e){
            System.out.println("1");
        }
        catch (RuntimeException e){
            System.out.println("2");
        }catch (Exception e){
        System.out.println("3");
    }
        System.out.println("4");}}
