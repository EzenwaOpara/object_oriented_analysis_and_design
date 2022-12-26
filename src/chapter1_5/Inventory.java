package chapter1_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
    Instrument instrument = new Instrument(serialNumber, price, spec);
        inventory.add(instrument);
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec) {
        System.out.println(inventory);
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument.getSpec().matches(searchSpec))
                matchingInstruments.add(instrument);
        }
        return matchingInstruments;
    }
}
