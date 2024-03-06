package model;

import java.util.ArrayList;
import java.util.List;

public class ExpenseList {

    private List<Expense> expenses;

    public ExpenseList() {
        expenses = new ArrayList<>();
    }

    public boolean addExpense(String date, double amount, String content) throws Exception {

        int newId = expenses.size() + 1;
        Expense newExpense = new Expense(newId, date, amount, content);
        return expenses.add(newExpense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

     public boolean deleteExpense(List<Expense> list, Expense exp) {
        return list.remove(exp); 
    }
}
