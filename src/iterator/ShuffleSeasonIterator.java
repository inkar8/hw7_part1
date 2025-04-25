package iterator;

import model.Episode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Random;

public class ShuffleSeasonIterator implements Iterator<Episode> {
    private List<Episode> shuffledEpisodes;
    private int position = 0;

    public ShuffleSeasonIterator(List<Episode> episodes) {
        shuffledEpisodes = new ArrayList<>(episodes);
        Collections.shuffle(shuffledEpisodes, new Random(42)); // фиксированное зерно
    }

    @Override
    public boolean hasNext() {
        return position < shuffledEpisodes.size();
    }

    @Override
    public Episode next() {
        return shuffledEpisodes.get(position++);
    }
}
