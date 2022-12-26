package chapter2_3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private List<Bark> allowedBarks;

    public DogDoor() {
        allowedBarks = new ArrayList<>();
    }
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBarks(List<Bark> allowedBarks) {
        this.allowedBarks = allowedBarks;
    }
    public void addAllowedBark(Bark bark) {
        allowedBarks.add(bark);
    }
    public void open() {
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 2000);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }
}
