public class Main {
    private DayOne dayOne;

    public Main(DayOne dayOne) {
        this.dayOne = dayOne;
    }

    public static void main(String[] args)  //static method
    {
        System.out.println("Count of all increases: " + DayOne.countAllMeasurementIncreases());
    }
}

