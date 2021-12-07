package main.java.six;

public class Lanternfish {
    private int timer;

    public Lanternfish(int timer) {
        this.timer = timer;
    }

    public Lanternfish countDownAndReproduce() {
        int prevTimer = this.timer;

        if(this.timer == 0) {
            this.timer = 7;
        }

        this.timer = this.timer - 1;
        if(prevTimer == 0 && this.timer == 6) {
            return new Lanternfish(8);
        } else {
            return null;
        }
    }

    public int getTimer() {
        return timer;
    }
}
