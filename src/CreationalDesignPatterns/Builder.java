package DesignPatterns;

interface IComputerBuilder {
    void SetMonitor();
    void SetMouse();
    void SetKeyboard();
    void SetTower();
    void SetPrinter();
    Computer GetComputer();
}
class Computer {
    public String Monitor;
    public String Mouse;
    public String Keyboard;
    public String Tower;
    public String Printer;
}

class ComputerABuilder implements IComputerBuilder {
    Computer computer = new Computer();

    public void SetMonitor() {
        computer.Monitor = "single";
    }
    public void SetMouse() {
        computer.Mouse = "Regular";
    }
    public void SetKeyboard() {
        computer.Keyboard = "Standard";
    }
    public void SetTower() {
        computer.Tower = "16 GB RAM";
    }
    public void SetPrinter() {
        computer.Printer = "HP laserjet 5000";
    }
    public Computer GetComputer() {
        return computer;
    }
}

class ComputerCreator {
    private IComputerBuilder computerBuilder;

    public ComputerCreator(IComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void CreateComputer() {
        computerBuilder.SetMonitor();
        computerBuilder.SetMouse();
        computerBuilder.SetKeyboard();
        computerBuilder.SetTower();
        computerBuilder.SetPrinter();
    }
    public Computer GetComputer() {
        return computerBuilder.GetComputer();
    }
}

public class Builder {
    public static void main(String []args) {
        ComputerCreator computerACreator = new ComputerCreator(new ComputerABuilder());
        computerACreator.CreateComputer();

        System.out.println("Computer A: ");
        System.out.println(computerACreator.GetComputer().Monitor);
        System.out.println(computerACreator.GetComputer().Mouse);
        System.out.println(computerACreator.GetComputer().Keyboard);
        System.out.println(computerACreator.GetComputer().Tower);
        System.out.println(computerACreator.GetComputer().Printer);

        System.out.println('\n');


    }
}
