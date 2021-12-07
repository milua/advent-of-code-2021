package six;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import main.java.six.DaySix;
import main.java.six.Lanternfish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DaySixTest {
    private DaySix daySix;

    @BeforeEach
    void setup() {
        daySix = new DaySix();
    }

    @Test
    void calculateAllLanternfishInDays() {
        List<Lanternfish> lanternfish = new ArrayList<>();
        lanternfish.add(new Lanternfish(3));
        lanternfish.add(new Lanternfish(4));
        lanternfish.add(new Lanternfish(3));
        lanternfish.add(new Lanternfish(1));
        lanternfish.add(new Lanternfish(3));

        final var tempResult = daySix.calculateAllLanternfishInDays(lanternfish, 18);
        // final var result = daySix.calculateAllLanternfishInDays(lanternfish, 80);


        assertEquals(26, tempResult.size());
        // assertEquals(5934, result.size());
    }
}
