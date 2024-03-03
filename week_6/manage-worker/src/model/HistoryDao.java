package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistoryDao {

    private List<History> histories;

    public HistoryDao() {
        histories = new ArrayList<>();
    }

    public List<History> getHistories() {
        return histories;
    }

    public void addHistory(Worker w, String status) {
        History h = new History(w, status, LocalDate.now());
        histories.add(h);
    }
}
