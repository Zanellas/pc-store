package com.zanell.pcstore.entity.products;

public class Drive extends Product {

    private String type;
    private String interfaceType;
    private String capacity;
    private String reading;
    private String recording;


    public Drive(String code, Double price, Integer amount, String branch, String model, String type, String interfaceType, String capacity, String reading, String recording) {
        super(code, branch, model);
        this.type = type;
        this.interfaceType = interfaceType;
        this.capacity = capacity;
        this.reading = reading;
        this.recording = recording;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getRecording() {
        return recording;
    }

    public void setRecording(String recording) {
        this.recording = recording;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Drive {\n");
        sb.append("\ttype: ").append(type).append(",\n");
        sb.append("\tinterfaceType: ").append(interfaceType).append(",\n");
        sb.append("\tcapacity: ").append(capacity).append(",\n");
        sb.append("\treading: ").append(reading).append(",\n");
        sb.append("\trecording: ").append(recording).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
