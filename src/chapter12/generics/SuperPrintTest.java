package chapter12.generics;

public class SuperPrintTest {
    public static void main(String[] args) {
        SuperPrinter<Plastic> plasticSuperPrinter = new SuperPrinter<>();
        plasticSuperPrinter.setMaterial(new Plastic());
        plasticSuperPrinter.printing();
        Plastic material = plasticSuperPrinter.getMaterial();
        System.out.println("material = " + material);
        System.out.println("plasticSuperPrinter = " + plasticSuperPrinter.getMaterial());


        SuperPrinter<Powder> materialSuperPrinter = new SuperPrinter<>();
        materialSuperPrinter.setMaterial(new Powder());
        materialSuperPrinter.printing();
        Material material1 = materialSuperPrinter.getMaterial();
        System.out.println("material = " + material1);
        System.out.println("plasticSuperPrinter = " + materialSuperPrinter.getMaterial());
    }
}
