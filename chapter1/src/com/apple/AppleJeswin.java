package com.apple;

public class AppleJeswin {
    private String model;
    private int ram;
    private int rom;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public AppleJeswin(String model, int ram, int rom) {
        this.model = model;
        this.ram = ram;
        this.rom = rom;
    }
}
