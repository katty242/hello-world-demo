package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
myFirstMethod();
h(5);


        for (int i=0; i<=10;i+=2) {
            System.out.println(i);
        }

        String [] myArray = new String[5];
        myArray [0]= "Alex";
        myArray [1]= "Angela";
        myArray [2]= "Bob";
        myArray [3]= "Tom";
        myArray [4]= "John";

        System.out.println(myArray[0]);

        ArrayList <String> katearraylist = new ArrayList<>();
        katearraylist.add("John");
        katearraylist.add("Kate");
        katearraylist.add("Ron");
        katearraylist.add("Harry");
        katearraylist.remove(3);
        System.out.println(katearraylist.size());

    }

    public static void myFirstMethod (){
        System.out.println("Hello!");

    }

    public static int h (int num1 ){
        return num1;
    }
}
