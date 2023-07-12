import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p1 = new Person();
        p1.age = 24;
        p1.Name = "Divyam";
        p1.color = "white";


        Person p2 = new Person();
        p2.age = 12;
        p2.Name = "Sirswal";
        p2.color = "black";

//        System.out.println(p1.age + " " +p1.Name);
////        System.out.println(p2.age + " " +p2.Name);
////
////        p1.eat();
//        p2.walk(12);
//        p1.printColor();
//        p2.printColor();

        Pen pen1 = new Pen();
        pen1.name ="apsara";
        pen1.type = "black ball pen";


//        Pen pen2 = new Pen();
//        pen2.name = "eball";
//        pen2.type = "gel pen ";
//
//        Pen pen3 = new Pen();
//        pen2.name = "";
//        pen2.type = "";

        Pen pen2 = new Pen(pen1);
        pen2.printInfo();
    }

   static class Person{
        String Name;
        int age;
        String color;

        void walk(){
            System.out.println(Name + " is walking");
        }

        void eat(){
            System.out.println(Name + " is eating");
        }

        void walk(int steps){
            System.out.println(Name + " walked "+ steps +" times");
        }
        void printColor(){
            System.out.println(this.color);
        }
    }

    static class Pen {
        String type;
        String name;

        void printInfo(){
            System.out.println(this.type);
            System.out.println(this.name);
        }

        Pen( Pen pen1){
            this.name = pen1.name;
            this.type = pen1.type;
        }


    }
}