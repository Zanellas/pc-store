package com.zanell.pcstore.entity.products;

public class RamMemory extends Product {

    private String capacity;
    private String type;
    private String speed;
    private String latency;

    public RamMemory(String code, Double price, Integer amount, String branch, String model, String capacity, String type, String speed, String latency) {
        super(code, branch, model);
        this.capacity = capacity;
        this.type = type;
        this.speed = speed;
        this.latency = latency;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RamMemory {\n");
        sb.append("\tcapacity: ").append(capacity).append(",\n");
        sb.append("\ttype: ").append(type).append(",\n");
        sb.append("\tspeed: ").append(speed).append(",\n");
        sb.append("\tlatency: ").append(latency).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
