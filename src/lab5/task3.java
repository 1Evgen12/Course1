package lab5;

class Int {
     int a;
     int b;

     Int () {
         a = 0;
         b = 0;
     }
     Int (int n){
         a =n;
         b =n;
     }
     Int (int a, int b){
         this.a = a;
         this.b = b;}
}
public class task3 {
    public static void main(String[] args) {
        Int numbers = new Int(2,5);
        System.out.println("a = " + numbers.a);
        System.out.println("b = " + numbers.b);}
}
