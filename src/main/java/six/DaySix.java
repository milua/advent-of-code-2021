package main.java.six;

import java.util.ArrayList;
import java.util.List;

public class DaySix {
    private String input = "2,5,3,4,4,5,3,2,3,3,2,2,4,2,5,4,1,1,4,4,5,1,2,1,5,2,1,5,1,1,1,2,4,3,3,1,4,2,3,4,5,1,2,5,1,2,2,5,2,4,4,1,4,5,4,2,1,5,5,3,2,1,3,2,1,4,2,5,5,5,2,3,3,5,1,1,5,3,4,2,1,4,4,5,4,5,3,1,4,5,1,5,3,5,4,4,4,1,4,2,2,2,5,4,3,1,4,4,3,4,2,1,1,5,3,3,2,5,3,1,2,2,4,1,4,1,5,1,1,2,5,2,2,5,2,4,4,3,4,1,3,3,5,4,5,4,5,5,5,5,5,4,4,5,3,4,3,3,1,1,5,2,4,5,5,1,5,2,4,5,4,2,4,4,4,2,2,2,2,2,3,5,3,1,1,2,1,1,5,1,4,3,4,2,5,3,4,4,3,5,5,5,4,1,3,4,4,2,2,1,4,1,2,1,2,1,5,5,3,4,1,3,2,1,4,5,1,5,5,1,2,3,4,2,1,4,1,4,2,3,3,2,4,1,4,1,4,4,1,5,3,1,5,2,1,1,2,3,3,2,4,1,2,1,5,1,1,2,1,2,1,2,4,5,3,5,5,1,3,4,1,1,3,3,2,2,4,3,1,1,2,4,1,1,1,5,4,2,4,3";
    private List<Lanternfish> allLanternfish = new ArrayList<>();

    public DaySix() {
    }

    public void run() {
        System.out.println("========================");
        System.out.println("Day 6 running...");
        System.out.println("========================");

        String[] temp = input.split(",");
        for (String timer : temp) {
            allLanternfish.add(new Lanternfish(Integer.parseInt(timer)));
        }
        System.out.println("Starting population: " + allLanternfish.size());

        List<Lanternfish> lanternfish = calculateAllLanternfishInDays(allLanternfish, 80);
        System.out.println("All fishies: " + lanternfish.size());
    }

    public List<Lanternfish> calculateAllLanternfishInDays(List<Lanternfish> fishies, int days) {
        for (int j = 0; j < days; j++) {
            int counterForNewFish = 0;
            for (int i = 0; i < fishies.size(); i++) {
                Lanternfish newFish = fishies.get(i).countDownAndReproduce();

                if (newFish != null) {
                    counterForNewFish = counterForNewFish + 1;
                }
            }
            for(int k = 0; k < counterForNewFish; k++){
                fishies.add(new Lanternfish(8));
            }
        }
        return fishies;
    }
}
