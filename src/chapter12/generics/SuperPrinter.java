package chapter12.generics;

public class SuperPrinter<T extends Material>{

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public void printing() {
        material.doPrinting();
    }

    @Override
    public String toString() {
        return material.toString();
    }
}
