package chapter6_7_8_9.units;

import java.util.*;

public class UnitGroup {
    private Map<Object, Object> units;

    public UnitGroup(List<Unit> unitList) {
        units = new HashMap<>();
        for (Unit unit : unitList) {
            units.put(unit.getId(), unit);
        }
    }

    public UnitGroup() {
        this(new LinkedList<>());
    }

    public void addUnit(Unit unit) {
        units.put(unit.getId(), unit);
    }

    public void removeUnit(int id) {
        units.remove(id);
    }

    public void removeUnit(Unit unit) {
        removeUnit(unit.getId());
    }

    public Unit getUnit(int id) {
        return (Unit) units.get(id);
    }

    public List<Unit> getUnits() {
        List<Unit> unitList = new LinkedList<>();
        for (Map.Entry<Object, Object> objectObjectEntry : units.entrySet()) {
            Unit unit = (Unit) objectObjectEntry;
            unitList.add(unit);
        }
        return unitList;
    }

    @Override
    public String toString() {
        return "UnitGroup{" +
                "units=" + units +
                '}';
    }
}