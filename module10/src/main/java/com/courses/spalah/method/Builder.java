package com.courses.spalah.method;

/**
 * @author Ievgen Tararaka
 */
public class Builder {
    public void putBrick(Brick brick) {
        brick.color = BrickColor.RED; // мы имеем доступ к копии ссылки, которая казывает на оригинальный объект
                                      // по этому мы можем поменять содержимое объекта
        brick = new Brick(BrickColor.RED); // так как это копия ссылки, то мы не можем поменять оригинальный объект
        System.out.println("Кладу кирпич. Цвет кирпича:" + brick.color);
    }
}
