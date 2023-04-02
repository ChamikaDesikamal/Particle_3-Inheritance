public class Vehicle {
    void drive(){
        System.out.println("Driving");
    }
    void  vehicleBreak(){
        System.out.println("Break");
    }
    void  reverse(){
        System.out.println("Revers!");
    }
}
class Car extends Vehicle{
    void moterracing(){
        System.out.println("Racing!");
    }
}
class Moderncar extends Car{
    void fly(){
        System.out.println("Flying!");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("Serfing!");
    }
}
class ModernBoat extends Boat{
    void landRidding(){
        System.out.println("Ridding!");
    }
}
class Test{
    public static void main(String[] args) {
        Moderncar mc = new Moderncar();
        ModernBoat mb = new ModernBoat();


        mc.drive();
        mc.vehicleBreak();
        mc.reverse();
        mc.moterracing();
        mc.fly();
        System.out.println();
        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.landRidding();
    }
}