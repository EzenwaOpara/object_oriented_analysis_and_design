package chapter2_3_4;

import java.util.Objects;

public class Bark {

    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bark bark = (Bark) o;
        return sound.equalsIgnoreCase(bark.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}
