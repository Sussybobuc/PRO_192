/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Sussybobuc
 */
public class Car {

    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car() {
        Colour = "";
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }

    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean getConvertible() {
        return Convertible;
    }

    public boolean getParkingBrake() {
        return ParkingBrake;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the accelerator button");
    }

    public void output() {
        System.out.println(" >> Colour: " + this.Colour);
        System.out.println(" >> Engine Power: " + this.EnginePower);
        System.out.println(" >> Convertible: " + this.Convertible);
        System.out.println(" >> Parking Brake: " +this.ParkingBrake);

    }
}
