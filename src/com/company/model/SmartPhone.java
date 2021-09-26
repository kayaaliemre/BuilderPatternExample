package com.company.model;

import java.math.BigDecimal;

public class SmartPhone {

    private final String cpu; // required
    private final String gpu; // required
    private final Integer ram; // required
    private String color; // optional
    private BigDecimal price; // optional
    private Integer camera; // optional
    private Integer batteryCapacity; // optional
    private boolean nfc;
    private String description; // optional

    public SmartPhone(SmartPhoneBuilder smartPhoneBuilder) {
        this.cpu = smartPhoneBuilder.cpu;
        this.gpu =  smartPhoneBuilder.gpu;
        this.ram =  smartPhoneBuilder.ram;
        this.color =  smartPhoneBuilder.color;
        this.price =  smartPhoneBuilder.price;
        this.camera =  smartPhoneBuilder.camera;
        this.batteryCapacity =  smartPhoneBuilder.batteryCapacity;
        this.nfc =  smartPhoneBuilder.nfc;
        this.description =  smartPhoneBuilder.description;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        this.camera = camera;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", camera=" + camera +
                ", batteryCapacity=" + batteryCapacity +
                ", nfc=" + nfc +
                ", description='" + description + '\'' +
                '}';
    }

    public static class SmartPhoneBuilder {
        private final String cpu; // required
        private final String gpu; // required
        private final Integer ram; // required
        private String color; // optional
        private BigDecimal price; // optional
        private Integer camera; // optional
        private Integer batteryCapacity; // optional
        private boolean nfc;
        private String description; // optional

        public SmartPhoneBuilder(String cpu, String gpu, Integer ram) {
            this.cpu = cpu;
            this.gpu = gpu;
            this.ram = ram;
        }

        public SmartPhoneBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public SmartPhoneBuilder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public SmartPhoneBuilder withCamera(Integer camera) {
            this.camera = camera;
            return this;
        }

        public SmartPhoneBuilder withBatteryCapacity(Integer batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public SmartPhoneBuilder withNfc(boolean nfc) {
            this.nfc = nfc;
            return this;
        }

        public SmartPhoneBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public SmartPhone build() {
            return new SmartPhone(this);
        }
    }
}