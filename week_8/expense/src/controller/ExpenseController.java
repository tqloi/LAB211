package controller;

import model.Expense;
import model.ExpenseList;

public class ExpenseController {

    private ExpenseList expenseList;

    public ExpenseController(ExpenseList expenseList) {
        this.expenseList = expenseList;
    }

    public void addExpense(String date, double amount, String content) throws Exception {

        if (expenseList.addExpense(date, amount, content)) {
            System.out.println("Successful");
        } else {
            System.out.println("Failed");
        }
    }

    public void displayExpenses() {
        double totalAmount = 0;
        for (Expense expense : expenseList.getExpenses()) {
            System.out.println(expense.toString());
            totalAmount += expense.getAmount();
        }
        System.out.println("Total: " + totalAmount);
    }

    public void removeExpense(int id) {
        boolean removed = false;
        for (Expense expense : expenseList.getExpenses()) {
            if (expense.getId() == id && expenseList.deleteExpense(expenseList.getExpenses(), expense)) {
                System.out.println("Successful");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Expense with ID " + id + " not found.");
        }
    }
}
