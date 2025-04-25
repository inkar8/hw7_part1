package model;

import iterator.BingeIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Series {
    private List<Season> seasons = new ArrayList<>();

    public void addSeason(Season season) {
        seasons.add(season);
    }

    public Iterator<Episode> createBingeIterator() {
        return new BingeIterator(seasons);  // Теперь возвращаем Iterator<Episode>
    }
}
