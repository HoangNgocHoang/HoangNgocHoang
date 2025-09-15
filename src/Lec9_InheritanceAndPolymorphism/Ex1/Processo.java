package Lec9_InheritanceAndPolymorphism.Ex1;

public class Processo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("Cat's ID : " + cat.catID);
        cat.catchMouse();
        System.out.println(cat.source);
    }
}
