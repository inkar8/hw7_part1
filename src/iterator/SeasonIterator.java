package iterator;

import model.Episode;
import java.util.List;
import java.util.Iterator;

public class SeasonIterator implements Iterator<Episode> {
    private List<Episode> episodes;
    private int position = 0;

    public SeasonIterator(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public boolean hasNext() {
        return position < episodes.size();
    }

    @Override
    public Episode next() {
        return episodes.get(position++);
    }
}
