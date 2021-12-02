package ru.skillbox;

public class Computer {
    private final String vendor;
    private final String name;
    private final Cpu cpu;
    private final Ram ram;
    private final DataStorage dataStorage;
    private final Monitor monitor;
    private final Keyboard keyboard;

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

    public Computer setCpu(Cpu cpu) {
        return new Computer(vendor, name, cpu, ram, dataStorage, monitor, keyboard);
    }

    public Computer setRam(Ram ram) {
        return new Computer(vendor, name, cpu, ram, dataStorage, monitor, keyboard);
    }

    public Computer setDataStorage(DataStorage dataStorage) {
        return new Computer(vendor, name, cpu, ram, dataStorage, monitor, keyboard);
    }

    public Computer setScreen(Monitor monitor) {
        return new Computer(vendor, name, cpu, ram, dataStorage, monitor, keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, dataStorage, monitor, keyboard);
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
