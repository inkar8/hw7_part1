package iterator;

import model.Episode;
import model.Season;
import java.util.List;
import java.util.Iterator;

public class BingeIterator implements Iterator<Episode> {
    private List<Season> seasons;
    private int seasonIndex = 0;
    private Iterator<Episode> currentIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        if (!seasons.isEmpty()) {
            currentIterator = seasons.get(0).iterator(); // Получаем итератор для первого сезона
        }
    }

    @Override
    public boolean hasNext() {
        if (currentIterator == null) return false;
        if (currentIterator.hasNext()) return true;
        while (++seasonIndex < seasons.size()) {
            currentIterator = seasons.get(seasonIndex).iterator(); // Получаем итератор для следующего сезона
            if (currentIterator.hasNext()) return true;
        }
        return false;
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            return currentIterator.next();
        }
        return null;
    }
}
