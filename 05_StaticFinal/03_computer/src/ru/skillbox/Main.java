package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Cpu cpu = new Cpu(2666, 6, "Intel", 45);
        Ram ram = new Ram(RamType.DDR3, 8, 32);
        DataStorage dataStorage = new DataStorage(DataStorageType.HDD, 1000, 450);
        Monitor monitor = new Monitor(23.8, MonitorType.IPS, 2500);
        Keyboard keyboard = new Keyboard(KeyboardType.ERGONOMIC, BacklightExistence.NO, 1020);

        Computer computer = new Computer("Dell", "Alienware Aurora", cpu, ram, dataStorage, monitor, keyboard);

        System.out.println(computer);

        DataStorage dataStorage1 = new DataStorage(DataStorageType.SSD, 242, 6);

        Computer computer1 = computer.setDataStorage(dataStorage1);

        System.out.println(computer1);
    }
}
