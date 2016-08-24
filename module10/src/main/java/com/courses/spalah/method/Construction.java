package com.courses.spalah.method;

/**
 * @author Ievgen Tararaka
 */
public class Construction {
    public Builder b1 = new Builder();

    public void build() {
        int bricksCount = 10;

        for (int i = 0; i < bricksCount; i++) {
            Brick brick = new Brick();

            System.out.println("Даю кирпич строителю. Цвет кирпича:" + brick.color);
            b1.putBrick(brick);
            System.out.println("Строитель положил кирпич " + brick.color + " цвета");
            System.out.println();
        }
    }
}
