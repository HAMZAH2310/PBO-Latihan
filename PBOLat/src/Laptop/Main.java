package Laptop;

public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(13000000, "ACER NITRO % ");

        CPU.Processor i5 = myKomputer.new Processor(5, "Intel", "i2");

        CPU.RAM rs32GB = myKomputer.new RAM(16, "Samsung");

        myKomputer.getCPUInfo();
        i5.getProcessorInfo();
        rs32GB.getInfoRAM();

        // bikin object harddisk, vga, motherboard, powersupply
    }
}