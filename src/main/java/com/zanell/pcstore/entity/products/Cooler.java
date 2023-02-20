package com.zanell.pcstore.entity.products;

public class Cooler extends Product {

    private String type;
    private String size;
    private String socket;

    public Cooler(String code, Double price, Integer amount, String branch, String model, String type, String size, String socket) {
        super(code, branch, model);
        this.type = type;
        this.size = size;
        this.socket = socket;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        sb.append("Cooler {\n");
        sb.append("\ttype: ").append(type).append(",\n");
        sb.append("\tsize: ").append(size).append(",\n");
        sb.append("\tsocket: ").append(socket).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
