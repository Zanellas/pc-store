package com.zanell.pcstore.entity.products;

public class Motherboard extends Product {

    private String size;
    private String socket;
    private String chipset;
    private String expansionSlots;
    private String memorySlot;
    private String storageConnectors;

    public Motherboard(String code, Double price, Integer amount, String branch, String model, String socket, String chipset, String expansionSlots, String memorySlot, String storageConnectors) {
        super(code, branch, model);
        this.socket = socket;
        this.chipset = chipset;
        this.expansionSlots = expansionSlots;
        this.memorySlot = memorySlot;
        this.storageConnectors = storageConnectors;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getExpansionSlots() {
        return expansionSlots;
    }

    public void setExpansionSlots(String expansionSlots) {
        this.expansionSlots = expansionSlots;
    }

    public String getMemorySlot() {
        return memorySlot;
    }

    public void setMemorySlot(String memorySlot) {
        this.memorySlot = memorySlot;
    }

    public String getStorageConnectors() {
        return storageConnectors;
    }

    public void setStorageConnectors(String storageConnectors) {
        this.storageConnectors = storageConnectors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motherboard {\n");
        sb.append("\tsocket: ").append(socket).append(",\n");
        sb.append("\tchipset: ").append(chipset).append(",\n");
        sb.append("\texpansionSlots: ").append(expansionSlots).append(",\n");
        sb.append("\tmemorySlot: ").append(memorySlot).append(",\n");
        sb.append("\tstorageConnectors: ").append(storageConnectors).append(",\n");
        sb.append("}");
        return sb.toString();
    }
}
