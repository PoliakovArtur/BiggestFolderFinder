package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    private Cpu cpu;
    private Ram ram;
    private DataStorage dataStorage;
    private Monitor monitor;
    private Keyboard keyboard;

    public Computer(String vendor, String name, Cpu cpu, Ram ram, DataStorage dataStorage, Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.dataStorage = dataStorage;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public int getComputerWeight() {
        return cpu.getWeight() + ram.getWeight() +
                dataStorage.getWeight() +
                monitor.getWeight() +
                keyboard.getWeight();
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setDataStorage(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendorAndName() {
        return vendor + name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public DataStorage getDataStorage() {
        return dataStorage;
    }

    public Monitor getScreen() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String toString() {
        return "\nКомпьютер " + vendor + " " + name + "\n" +
                "Процессор\n" + cpu.toString() + "\n" +
                "\nОперативная память\n" + ram.toString() + "\n" +
                "\nНакопитель информации\n" + dataStorage.toString() + "\n" +
                "\nЭкран\n" + monitor.toString() + "\n" +
                "\nКлавиатура\n" + keyboard.toString() + "\n" +
                "\nОбщий Вес Компьютера:" + getComputerWeight() + "\n";
    }
}
