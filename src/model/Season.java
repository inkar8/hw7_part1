package model;

import iterator.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Season implements Iterable<Episode> {
    private List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(episodes); // возвращаем стандартный итератор
    }

    public Iterator<Episode> createReverseIterator() {
        return new ReverseSeasonIterator(episodes); // используем стандартный Iterator
    }

    public Iterator<Episode> createShuffleIterator() {
        return new ShuffleSeasonIterator(episodes); // используем стандартный Iterator
    }
}
