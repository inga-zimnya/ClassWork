package ru.boxes;

public class ComplexBox<T, S> {
    private T mainMaterial;
    private S subMaterial;

    public T getMainMaterial() {
        return mainMaterial;
    }

    public S getSubMaterial() {
        return subMaterial;
    }

    public ComplexBox(T firstMaterial, S secondMaterial) {
        mainMaterial = firstMaterial;
        subMaterial = secondMaterial;
    }
}