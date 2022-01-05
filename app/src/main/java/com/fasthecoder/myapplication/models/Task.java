package com.fasthecoder.myapplication.models;

public class Task {

    private String title;
    private String label;
    private String task_time;
    private String task_day;

    public Task(String title, String label, String task_time, String task_day) {
        this.title = title;
        this.label = label;
        this.task_time = task_time;
        this.task_day = task_day;
    }

    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTask_time() {
        return task_time;
    }

    public void setTask_time(String task_time) {
        this.task_time = task_time;
    }

    public String getTask_day() {
        return task_day;
    }

    public void setTask_day(String task_day) {
        this.task_day = task_day;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", label='" + label + '\'' +
                ", task_time='" + task_time + '\'' +
                ", task_day='" + task_day + '\'' +
                '}';
    }
}
