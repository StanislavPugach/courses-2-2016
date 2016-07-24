package com.courses.spalah.inheritance.zoo;

import com.courses.spalah.inheritance.Animal;
import com.courses.spalah.inheritance.Ape;
import com.courses.spalah.inheritance.Cat;
import com.courses.spalah.inheritance.Gibbon;

/**
 * @author Ievgen Tararaka
 */
public class Zoo {
    public static void main(String[] args) {
    }

    public static void toParent() {
        Gibbon barry = new Gibbon("Barry");
        System.out.println(barry.hasLongTail);
        System.out.println(barry.canClimbOnTrees);
        System.out.println(barry.canMove);

        Ape barryApe = barry; // любой гиббон это примат, по этому такая конструкция допустима
        System.out.println(barryApe.canClimbOnTrees);
        System.out.println(barryApe.canMove);

        Animal barryAnimal = barry; // любой примат это животное
        System.out.println(barryAnimal.canMove);
    }

    public static void toChild() {
        Animal animal = new Cat();

        Gibbon barry = (Gibbon) animal; // вот тут вы словите ClassCastException
    }
}
