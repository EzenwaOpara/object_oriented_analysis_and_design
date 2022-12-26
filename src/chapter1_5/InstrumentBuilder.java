package chapter1_5;

public enum InstrumentBuilder {
    FENDER("Fender"),
    MARTIN("Martin"),
    GIBSON("Gibson"),
    COLLINGS("Collings"),
    OLSON("Olson"),
    RYAN("Ryan"),
    PRS("Prs"),
    ANY("Any");

    private final String name;

    InstrumentBuilder(String name) {
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
