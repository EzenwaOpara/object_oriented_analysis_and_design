package chapter6_7_8_9.board;

import chapter6_7_8_9.units.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {
    private List<Unit> units;
    public Tile() {
        units = new LinkedList();
    }
    protected void addUnit(Unit unit) {
        units.add(unit);
    }
    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    public void removeUnits() {

    }

    public List<Unit> getUnits() {
        return null;
    }
}