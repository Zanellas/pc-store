package com.zanell.pcstore.entity.products;

public class Font extends Product {

    private String power;
    private String efficiency;
    private String certifications;
    private String size;

    public Font(String code, Double price, Integer amount, String branch, String model, String power, String efficiency, String certifications, String size) {
        super(code, branch, model);
        this.power = power;
        this.efficiency = efficiency;
        this.certifications = certifications;
        this.size = size;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Font {\n");
        sb.append("\tpower: ").append(power).append(",\n");
        sb.append("\tefficiency: ").append(efficiency).append(",\n");
        sb.append("\tcertifications: ").append(certifications).append(",\n");
        sb.append("\tsize: ").append(size).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
