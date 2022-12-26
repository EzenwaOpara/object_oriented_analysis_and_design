package chapter6_7_8_9.units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unit {

    int id;
    String type;
    String name;
    List<Weapon> weapons;
    Map<String, Object> properties;

    public Unit(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void addWeapon(Weapon weapon) {
        if (weapons == null) {
            weapons = new ArrayList<>();
        }
        weapons.add(weapon);
    }

    public Object getProperty(String property) {
        if (properties == null) {
            throw new RuntimeException("No properties!");
        }

        Object value = properties.get(property);
        if (value == null) {
            throw new RuntimeException("The value you're accessing is null");
        }
        return value;
    }

    public void setProperty(String property, Object value) {
        if (properties == null) {
            properties = new HashMap<>();
        }
        properties.put(property, value);
    }

}
