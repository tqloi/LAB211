
package controller;

import model.HistoryDao;

public class HistoryController {

    private HistoryDao historyDao;
    
    public HistoryController(HistoryDao historyDao) {
        this.historyDao = historyDao;
    }
    
    public void displayHistory() {
        System.out.println("------------Display information salary----------");
        System.out.println(String.format("%-5s %-15s %-6s %-8s %-8s %-10s %-10s", 
                             "Code", "Name", "Age", "Salary", "Status", "Location", "Date"));
        historyDao.getHistories().forEach(h -> System.out.println(h));
    }
    
}
