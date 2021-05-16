package mp3;

import java.time.LocalDate;

public abstract class PowerPlant { // abstract?
    private String name;
    private String address;
    private LocalDate createDate;
    private int powerGeneratedElectricityPerDay;

    public PowerPlant(String name, String address, LocalDate createDate, int powerGeneratedElectricityPerDay) {
        this.name = name;
        this.address = address;
        this.createDate = createDate;
        this.powerGeneratedElectricityPerDay = powerGeneratedElectricityPerDay;
    }
    public abstract void showMonthElectricictyGeneration();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public int getPowerGeneratedElectricityPerDay() {
        return powerGeneratedElectricityPerDay;
    }

    public void setPowerGeneratedElectricityPerDay(int powerGeneratedElectricityPerDay) {
        this.powerGeneratedElectricityPerDay = powerGeneratedElectricityPerDay;
    }
}
