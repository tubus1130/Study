import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        num1 = num2 = num3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
/*
30
30
30
*/
