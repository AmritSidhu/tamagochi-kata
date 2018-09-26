import java.util.Timer;
import java.util.TimerTask;

public class Tamagochi {
    private int hunger = 0;
    private int happiness = 0;
    private int tiredness = 0;

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public void feed() {
        if (getHunger() < 100){
            setHunger(getHunger() + 25);
        }
    }

    public void play() {
        if (getHappiness() < 100){
            setHappiness(getHappiness() + 25);
            setTiredness(getTiredness() + 25);
        }
    }

    public void bed() {
        setTiredness(0);
    }

    public void poop() {
        if (getHunger() >= 25){
            setHunger(getHunger() - 25);
        }
    }

    public void time(){
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                setTiredness(getTiredness() + 25);
                setHunger(getHunger() + 25);
                setHappiness(getHappiness() - 25);
            }
        }, 10000, 10000);
    }

}
