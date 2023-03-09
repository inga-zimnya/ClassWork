package ru.boxes;

public class Box <T>{
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public Box(T object){
        material = object;
    }
}
