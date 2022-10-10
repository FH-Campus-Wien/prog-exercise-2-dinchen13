package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double n;
        double m;
        int counter =2;

        System.out.printf("Number 1: ");
        n= scanner.nextDouble();
        System.lineSeparator();

        if (n>0) {
            do {
                System.out.printf("Number %d: ",counter);
                m= scanner.nextDouble();
                System.lineSeparator();

                if (m>n) {
                    n = m;
                }
                counter++;
            } while (m > 0);

        //System.out.printf("The largest number is %.2f",n); passt nicht! (but why)
            // d// int i = (int) (n*100); n = (i/100); System.out.println("The largest number is "+n); passt nicht! (but why)
        System.out.println(String.format("The largest number is %,.2f", n)); // rundet
        }

        else {
            System.out.println("No number entered.");
        }
    }


    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int counter=1;
        int counter2=1;

        System.out.printf("n: ");
        n= scanner.nextInt();
        System.lineSeparator();

        if (n>0){
            for(; n>0; n--){
                for(int i =counter; i>0; i--){
                    System.out.print(counter2 + " ");
                    counter2++;
                }
                counter++;
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){

        int beginning = 0;
        int ending = 0;

        for (int i = 6; i > 0; i--) {
            for (int field = -5; field <= 5; field++) {

                if (beginning <= field && ending >= field) {
                    System.out.print("*");
                }
                else if(beginning>field){
                    System.out.print(" ");
                }
            }
            beginning--;
            ending++;
            System.out.println();
        }

        /*for (int i = 0; i < 6; i++) {
            for (int l =0; l<6-i-1; l++){
                System.out.print(" ");
            }
            for (int k = 0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        final int h;
        final char c;

        System.out.printf("h: ");
        h= scanner.nextInt();
        System.out.printf("c: ");
        c = scanner.next().charAt(0);

        if (h%2!=0) {

            for (int i = 0; i < (h - 1) / 2; i++) {
                char ch = (char) (c - h / 2);
                int counter = h;
                for (int l = 0; l < h / 2 - i; l++) {
                    System.out.print(" ");
                    ch++;
                    counter--;

                }
                for (int k = 0; k < i * 2 + 1; k++) {
                    System.out.print(ch);
                    counter--;
                    if (counter > h / 2) {
                        ch++;
                    } else {
                        ch--;
                    }

                }
                System.out.println();
            }


            for (int i = (h - 1) / 2; i >= 0; i--) {
                char ch = (char) (c - h / 2);
                int counter = h;
                for (int l = 0; l < h / 2 - i; l++) {
                    System.out.print(" ");
                    ch++;
                    counter--;
                }
                for (int k = 0; k < i * 2 + 1; k++) {
                    System.out.print(ch);
                    counter--;
                    if (counter > h / 2) {
                        ch++;
                    } else {
                        ch--;
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid number!");
        }

    }


    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int m;
        int sum =0;
        int number =2;
        int counter =0;
        int negative =0;
        double average;

        System.out.printf("Mark 1: ");
        m= scanner.nextInt();

        if (m>5){
            System.out.println("Invalid mark!");
        }
        else if ((m<=5)&&(m>0)){
            counter++;
            sum =m;
            if (m==5){
                negative++;
            }
        }

        while (m > 0) {
            System.out.printf("Mark %d: ", number);
            m = scanner.nextInt();
            if ((m<=5)&&(m>0)){
                sum = sum + m;
                counter++;
                number++;
                if (m==5){
                    negative++;
                }
            }
            else if (m>5){
                System.out.println("Invalid mark!");
            }
        }

        if (counter==0){average=0.00;}
        else {average =(double) sum / counter;}
        System.out.println(String.format("Average: %,.2f", average)); // rundet
        System.out.println("Negative marks: "+negative);
}

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum=0;

        System.out.printf("n: ");
        n= scanner.nextInt();

        do {
            int a = n%10;

            if (n!=0) {
                sum = a * a;
            }
            n = n/10;
            while (n!=0) {
                int b = n % 10;

                if (n != 0) {
                    sum = sum + b * b;
                }
                n = n / 10;
            }
            n=sum;
        }while ((sum!=1)&&(sum!=4));


        if (sum==1){
            System.out.println("Happy number!");
        }
        else if (sum==4) {
            System.out.println("Sad number!");
        }


    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}