import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */


    class Operators{
        public static void main(String[] args){
            int a = 17;
            int b = 4;
            int c = a + b; //=21
    System.out.println(c);
    c = a - b;         //=13
    System.out.println(c);
    c = a * b;        //=68
    System.out.println(c);
    c = a / b;        //=4 ponieważ 4*4=16 i zostaje reszty 1
    System.out.println(c);
    c = a % b;         //=1 reszta z dzielenia
    System.out.println(c);


    /* operatory logiczne:
    */
            boolean result = a == b;
            System.out.println(result);     //false, bo jest różne od b
            System.out.println(a >= 0);     //true, bo a jest większe od 0
            System.out.println(b != 10);    //false, bo 10 jest równe 10




