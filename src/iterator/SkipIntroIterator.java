package iterator;

import model.Episode;
import java.util.Iterator;

public class SkipIntroIterator implements Iterator<Episode> {
    private Iterator<Episode> originalIterator;
    private int skipSeconds;

    public SkipIntroIterator(Iterator<Episode> iterator, int skipSeconds) {
        this.originalIterator = iterator;
        this.skipSeconds = skipSeconds;
    }

    @Override
    public boolean hasNext() {
        return originalIterator.hasNext();
    }

    @Override
    public Episode next() {
        Episode episode = originalIterator.next();
        // Пропускаем начало эпизода
        System.out.println("Skipping intro for: " + episode.getTitle() + " by " + skipSeconds + " seconds.");
        return episode; // Возвращаем эпизод с учетом пропуска
    }
}
