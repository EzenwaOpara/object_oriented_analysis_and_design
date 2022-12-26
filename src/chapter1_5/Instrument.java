package chapter1_5;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;
    public Instrument(String serialNumber, double price,
                      InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }
    public InstrumentSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSpec(InstrumentSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", spec=" + spec +
                '}';
    }
}
