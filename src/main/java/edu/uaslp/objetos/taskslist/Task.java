package edu.uaslp.objetos.taskslist;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean done;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDueDate(LocalDateTime dueDate) {
        LocalDateTime now = LocalDateTime.now();

        if(dueDate.isBefore(now)){
            throw new TaskListException("Due date is set in the past");
        }

        this.dueDate = dueDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
