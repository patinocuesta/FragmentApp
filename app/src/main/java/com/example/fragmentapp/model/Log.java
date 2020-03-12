package com.example.fragmentapp.model;

public class Log {
    private int id;
    private String cycleLog;

    public Log(int id, String cycleLog) {
        this.id = id;
        this.cycleLog = cycleLog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCycleLog() {
        return cycleLog;
    }

    public void setCycleLog(String cycleLog) {
        this.cycleLog = cycleLog;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", cycleLog='" + cycleLog + '\'' +
                '}';
    }
}
