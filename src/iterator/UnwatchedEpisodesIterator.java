package iterator;

import model.Episode;
import java.util.Iterator;
import java.util.Set; // Добавлен импорт для Set

public class UnwatchedEpisodesIterator implements Iterator<Episode> {
    private Iterator<Episode> originalIterator;
    private Set<Episode> watchedEpisodes;

    public UnwatchedEpisodesIterator(Iterator<Episode> iterator, Set<Episode> watchedEpisodes) {
        this.originalIterator = iterator;
        this.watchedEpisodes = watchedEpisodes;
    }

    @Override
    public boolean hasNext() {
        while (originalIterator.hasNext()) {
            Episode episode = originalIterator.next();
            if (!watchedEpisodes.contains(episode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Episode next() {
        return originalIterator.next();
    }
}
