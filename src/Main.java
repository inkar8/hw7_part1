import model.*;
import iterator.*;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Series series = new Series();

        // Создаем 2 сезона
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1", 1200));
        season1.addEpisode(new Episode("S1E2", 1300));
        season1.addEpisode(new Episode("S1E3", 1400));

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1", 1500));
        season2.addEpisode(new Episode("S2E2", 1600));

        series.addSeason(season1);
        series.addSeason(season2);

        // Обычный порядок
        System.out.println("Normal order:");
        Iterator<Episode> normalIterator = season1.iterator(); // Используем стандартный итератор
        while (normalIterator.hasNext()) {
            System.out.println(normalIterator.next().getTitle());
        }

        // Обратный порядок
        System.out.println("\nReverse order:");
        Iterator<Episode> reverseIterator = season1.createReverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next().getTitle());
        }

        // Перемешанный порядок
        System.out.println("\nShuffle order:");
        Iterator<Episode> shuffleIterator = season1.createShuffleIterator();
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }

        // Binge просмотр всей серии
        System.out.println("\nBinge watching the whole series:");
        Iterator<Episode> bingeIterator = series.createBingeIterator();
        while (bingeIterator.hasNext()) {
            System.out.println(bingeIterator.next().getTitle());
        }
    }
}
