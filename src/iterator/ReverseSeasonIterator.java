package iterator;

import model.Episode;
import java.util.List;
import java.util.Iterator;

public class ReverseSeasonIterator implements Iterator<Episode> {
    private List<Episode> episodes;
    private int position;

    public ReverseSeasonIterator(List<Episode> episodes) {
        this.episodes = episodes;
        this.position = episodes.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Episode next() {
        return episodes.get(position--);
    }
}
