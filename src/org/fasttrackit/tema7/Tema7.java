package org.fasttrackit.tema7;

public class Tema7 {

    public static void main(String[] args) {


        //Ex 1 - 2
        Person boy = new Person("George", 20, false);
        Person girl = new Person("Alexis", 18, false);
        Person adult = new Person("Camelia", 53, true);

        System.out.println(boy.toString());
        System.out.println(girl.toString());
        System.out.println(adult.toString());

        System.out.println("-------------------------------------------");

        //Ex 3 - 4
        Product productOne = new Product("Laptop", 3000.99, 30, "PC");
        Product productSecond = new Product("Blender", 296.98, 14, "Electrocasnice");
        Product productThird = new Product("FPGA", 12000, 0, "Productive");

        System.out.println(String.format("Produsul %s costa %.2f lei, cantitatea sa este %s de bucati si face parte din categoria %s", productOne.getName(), productOne.getPrice(), productOne.getQuantity(), productOne.getCategory()));
        System.out.println(String.format("Produsul %s costa %.2f lei, cantitatea sa este %s de bucati si face parte din categoria %s",
                productSecond.getName(), productSecond.getPrice(),
                productSecond.getQuantity(), productSecond.getCategory()));
        System.out.println(String.format("Produsul %s costa %.2f lei, cantitatea sa este %s de bucati si face parte din categoria %s",
                productThird.getName(), productThird.getPrice(),
                productThird.getQuantity(), productThird.getCategory()));

        System.out.println("-----------------------------------------------------------------");

        System.out.println(String.format("Produsul %s are cantite mai mare ca 0? ", productOne.getName()) + productOne.hasStock() + " /" + String.format(" Face parte din categoria %s? ", "Bauturi") + productOne.isCategory("Bauturi"));
        System.out.println(String.format("Produsul %s are cantite mai mare ca 0? ", productSecond.getName())
                + productSecond.hasStock() + " /" + String.format(" Face parte din categoria %s? ", "Electrocasnice") + productSecond.isCategory("Electrocasnice"));
        System.out.println(String.format("Produsul %s are cantite mai mare ca 0? ", productThird.getName()) + productThird.hasStock() + " /"
                + String.format(" Face parte din categoria %s? ", "PC") + productThird.isCategory("PC"));

        System.out.println("-------------------------------------------------------------------------------------");

        //Ex 5

        Bottle water = new Bottle(500, 400, false);
        Bottle juice = new Bottle(1.5, 1, true);
        Bottle milk = new Bottle(2, 0.5, true);

        System.out.println("Empty space: " + juice.getEmptySpace());
        water.drinkAmount(100);
        water.openBottle();
        water.drinkAmount(100);
        water.closeBottle();
        water.openBottle();
        water.drinkAmount(700);
    }
}
