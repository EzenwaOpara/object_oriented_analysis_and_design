package chapter1_5;

public enum WoodType {
    INDIAN_ROSEWOOD("Indian Rosewood"),
    BRAZILIAN_ROSEWOOD("Brazilian Rosewood"),
    MAHOGANY("Mahogany"),
    MAPLE("Maple"),
    COCOBOLO("Cocobolo"),
    CEDAR("Cedar"),
    ADIRONDACK("Adirondack"),
    ALDER("Alder"),
    SITKA("Sitka");

    private final String name;

    WoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
