package chapter1_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindInstrument {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);


        Map<String, Object> properties = new HashMap<>();
        properties.put("builder", InstrumentBuilder.GIBSON);
        properties.put("backWood", WoodType.MAPLE);

        InstrumentSpec clientSpec = new InstrumentSpec(properties);
        List<Instrument> matchingInstruments = inventory.search(clientSpec);

        if (!matchingInstruments.isEmpty()) {
            System.out.println("You might like these instruments:");
            for (Instrument instrument : matchingInstruments) {
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a " + spec.getProperty("instrumentType") +
                        " with the following properties:");
                for (String propertyName : spec.getProperties().keySet()) {
                    if (propertyName.equals("instrumentType"))
                        continue;
                    System.out.println(" " + propertyName + ": " +
                            spec.getProperty(propertyName));
                }
                System.out.println(" You can have this " + spec.getProperty("instrumentType") + " for $" +
                        instrument.getPrice() + "\n---");
            }
        } else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        Map<String, Object> properties = new HashMap<>();

        properties.put("instrumentType", InstrumentType.GUITAR);
        properties.put("builder", InstrumentBuilder.COLLINGS);
        properties.put("model", "CJ");
        properties.put("type", Type.ACOUSTIC);
        properties.put("numStrings", 6);
        properties.put("topWood", WoodType.INDIAN_ROSEWOOD);
        properties.put("backWood", WoodType.SITKA);
        inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

        properties.put("builder", InstrumentBuilder.MARTIN);
        properties.put("model", "D-18");
        properties.put("topWood", WoodType.MAHOGANY);
        properties.put("backWood", WoodType.ADIRONDACK);
        inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));


        properties.put("builder", InstrumentBuilder.FENDER);
        properties.put("model", "Stratocastor");
        properties.put("type", Type.ELECTRIC);
        properties.put("topWood", WoodType.ALDER);
        properties.put("backWood", WoodType.ALDER);
        inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
        inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));


        properties.put("builder", InstrumentBuilder.GIBSON);
        properties.put("model", "Les Paul");
        properties.put("topWood", WoodType.MAPLE);
        properties.put("backWood", WoodType.MAPLE);
        inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));


        properties.put("model", "SG ‘61 Reissue");
        properties.put("topWood", WoodType.MAHOGANY);
        properties.put("backWood", WoodType.MAHOGANY);
        inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));


        properties.put("instrumentType", InstrumentType.MANDOLIN);
        properties.put("type", Type.ACOUSTIC);
        properties.put("model", "F-5G");
        properties.put("backWood", WoodType.MAPLE);
        properties.put("topWood", WoodType.MAPLE);
        properties.remove("numStrings");
        inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));


        properties.put("instrumentType", InstrumentType.BANJO);
        properties.put("model", "RB-3 Wreath");
        properties.remove("topWood");
        properties.put("numStrings", 5);
        inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
        System.out.println("Done!");
    }
}
