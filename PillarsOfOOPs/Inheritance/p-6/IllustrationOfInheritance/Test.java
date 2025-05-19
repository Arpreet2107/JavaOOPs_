//Java programs to illustrate the concept of Inheritance

//Base class
class Bicycle{
    //the bucycle class has two fields
    public int gear;
    public int speed;

    //the bicycle class has one constructor
    public Bicycle(int gear, int speed){
        this.gear= gear;
        this.speed= speed;
    }
    //the bicycle class has 3 methods
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed+= increment;
    }
    //toString() method to print info of bicycle
    @Override
    public String toString(){
        return ("Number if gears are "+ gear + "\nSpeed of bicycle is " + speed);
    }
}
//derived class
class MountainBike extends Bicycle{
    //the mountainbike subclass andds one more field
    public int seatHeight;
    //the mountainbike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight){
        //invoking base-class(Bicycle) constructor
        super(gear,speed);
        seatHeight = startHeight;
    }
    //the MOuntainBike subclass adds one more method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    //overriding the toString() method of Bicycle to print more info
    @Override
    public String toString(){
        return (super.toString() + "\nSeat height is " + seatHeight);
    }
}

//Druver class
public class Test{
    public static void main(String args[]){
        MountainBike mb = new MountainBike(3,100,230);
        System.out.println(mb.toString());
        mb.applyBrake(10);
        mb.speedUp(20);
        System.out.println(mb.toString());
        mb.setHeight(300);
        System.out.println(mb.toString());
        mb.applyBrake(20);
        mb.speedUp(30);
        System.out.println(mb.toString()); 
    }
}