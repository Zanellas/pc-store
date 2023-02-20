package com.zanell.pcstore.entity.products;

public class Processor extends Product {

    private String clockSpeed;
    private String cache;
    private String cores;
    private String threads;
    private String socket;

    public Processor(String code, Double price, Integer amount, String branch, String model, String clockSpeed, String cache, String cores, String threads, String socket) {
        super(code, branch, model);
        this.clockSpeed = clockSpeed;
        this.cache = cache;
        this.cores = cores;
        this.threads = threads;
        this.socket = socket;
    }

    public String getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(String clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Processor {\n");
        sb.append("\tclockSpeed: ").append(clockSpeed).append(",\n");
        sb.append("\tcache: ").append(cache).append(",\n");
        sb.append("\tcores: ").append(cores).append(",\n");
        sb.append("\tthreads: ").append(threads).append(",\n");
        sb.append("\tsocket: ").append(socket).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
