public class Main {
    private DayOne dayOne;

    public Main(DayOne dayOne) {
        this.dayOne = dayOne;
    }

    public static void main(String[] args)  //static method
    {
        // System.out.println("Count of all increases: " + DayOne.countAllMeasurementIncreases());

        var dayTwo = DayTwo.calculatePosition();
        System.out.println("Position X: " + dayTwo[0] + ", Position Y: " + dayTwo[1]);
        System.out.println("Multiplied together: " + dayTwo[0] * dayTwo[1]);

    }
}

