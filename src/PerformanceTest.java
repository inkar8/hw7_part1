import model.*;
import iterator.*;
import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        // Создаем 10 000 эпизодов
        List<Episode> episodes = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            episodes.add(new Episode("Episode " + (i + 1), 1200 + (i % 10) * 100));
        }

        // Создаем сезон с этими эпизодами
        Season season = new Season();
        for (Episode e : episodes) {
            season.addEpisode(e);
        }

        // Производительность нормального итератора
        startTime = System.currentTimeMillis();
        Iterator<Episode> normalIterator = season.iterator();
        while (normalIterator.hasNext()) {
            normalIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Normal iterator time: " + (endTime - startTime) + "ms");

        // Производительность обратного итератора
        startTime = System.currentTimeMillis();
        Iterator<Episode> reverseIterator = season.createReverseIterator();
        while (reverseIterator.hasNext()) {
            reverseIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Reverse iterator time: " + (endTime - startTime) + "ms");

        // Производительность перемешанного итератора
        startTime = System.currentTimeMillis();
        Iterator<Episode> shuffleIterator = season.createShuffleIterator();
        while (shuffleIterator.hasNext()) {
            shuffleIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Shuffle iterator time: " + (endTime - startTime) + "ms");
    }
}
