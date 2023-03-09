package ru.boxes;

import ru.boxes.Box;
import ru.boxes.ComplexBox;

public class Generics {
    public static void main(String[] args) {
        Box<Wood> woodenBox = new Box<>(new Wood());
        Box<Paper> paperBox = new Box<>(new Paper());

        System.out.println(woodenBox.getMaterial());
        System.out.println(paperBox.getMaterial());

        ComplexBox<Wood, Paper> box = new ComplexBox<>(new Wood(), new Paper());
        System.out.println(box.getMainMaterial());
        System.out.println(box.getSubMaterial());
    }
}