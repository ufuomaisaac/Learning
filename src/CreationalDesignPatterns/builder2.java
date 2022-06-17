package DesignPatterns;
class Phone {
    private String os;
    private int rom;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone (String os, int rom, String processor, double screenSize, int battery) {
        this.os = os;
        this.battery = battery;
        this.processor = processor;
        this.screenSize = screenSize;
        this.rom = rom;
    }

    public String toString() {
        return "Phone [ os = " + os + " rom = " + rom + " processor = " + processor + " screenSize " + screenSize + " battery " + battery + " ] ";
    }
}
class PhoneBuilder{
    private String os;
    private int rom;
    private String processor;
    private double screenSize;
    private int battery;

    public PhoneBuilder setOs(String os){
        this.os = os;
        return this;
    }
    public PhoneBuilder setRam(int rom ){
        this.rom = rom;
        return this;
    }
    public PhoneBuilder setProcessor(String processor){
        this.processor = processor;
        return this;
    }
    public PhoneBuilder setScreenSize(double screenSize){
        this.screenSize = screenSize;
        return this;
    }
    public  PhoneBuilder setBattery(int battery){
        this.battery = battery;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os, rom, processor, screenSize, battery);
    }

}

public class builder2 {

    public static void main (String [] args) {
        Phone p = new PhoneBuilder().setOs(" andriod ").getPhone();
        System.out.println(p);
    }

}
