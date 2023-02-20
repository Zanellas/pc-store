package com.zanell.pcstore.entity.products;

public class GraphicCard extends Product {

    private String chipset;
    private String memoryCapacity;
    private String memoryType;

    public GraphicCard(String code, Double price, Integer amount, String branch, String model, String chipset, String memoryCapacity, String memoryType) {
        super(code, branch, model);
        this.chipset = chipset;
        this.memoryCapacity = memoryCapacity;
        this.memoryType = memoryType;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(String memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GraphicCard {\n");
        sb.append("\tchipset: ").append(chipset).append(",\n");
        sb.append("\tmemoryCapacity: ").append(memoryCapacity).append(",\n");
        sb.append("\tmemoryType: ").append(memoryType).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
