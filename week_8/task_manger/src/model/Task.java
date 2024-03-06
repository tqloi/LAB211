package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private int id;
    private int taskTypeID;
    private String requirementName;
    private Date date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    public Task(int id, int taskTypeID, String requirementName, String date, double planFrom, double planTo, String assignee, String reviewer) throws ParseException {
        this.id = id;
        this.taskTypeID = taskTypeID;
        this.requirementName = requirementName;
        this.date = validDate(date);
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskTypeID() {
        return taskTypeID;
    }

    public void setTaskTypeID(int taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getTaskTypeName() {
        switch (taskTypeID) {
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";
            default:
                return "";
        }
    }

    public Date validDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.parse(date);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-5s %-19s %-12s %-12s %-12s %-12s %-12s",
                id, requirementName, getTaskTypeName(), dateFormat.format(date), planTo - planFrom, assignee, reviewer);

    }

}
