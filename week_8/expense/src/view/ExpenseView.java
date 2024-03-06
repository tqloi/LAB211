/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.ExpenseController;
import java.util.logging.Level;
import java.util.logging.Logger;
import Llibrary.Input;

/**
 *
 * @author admin
 */
public class ExpenseView extends Menu<Object> {

    private ExpenseController expenseController;
    private Input ip;

    public ExpenseView(ExpenseController expenseController) {
        super("=======Handy Expense program======", new String[]{"Add an expense", "Display all expenses", "Delete an expense", "Quit"});
        this.expenseController = expenseController;
        this.ip = new Input();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("-------- Add an expense--------");
                String date = ip.getString("Enter Date");
                double amount = ip.getDouble("Enter Amount");
                String content = ip.getString("Enter Content");
                 {
                    try {
                        expenseController.addExpense(date, amount, content);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
                break;

            case 2:
                System.out.println("---------Display all expenses------------");
                 System.out.println(String.format("%-5s %-20s %-5s %-30s", "ID", "Date", "Amount", "Content"));
                expenseController.displayExpenses();
                break;
            case 3:
                System.out.println("--------Delete an expense------");
                int id = ip.getInt("Enter ID");
                expenseController.removeExpense(id);
                break;
            case 4:
                exitMenu();
                break;
        }
    }

}
