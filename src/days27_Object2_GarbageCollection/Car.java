package days27_Object2_GarbageCollection;

public class Car {

    String make;
    String model;
    int currentspeed;
    String color;
     double price;


    public void drive() {

        System.out.println(make + " " + model + " diriving");
    }

    public void showCurrentSpeed(int speedLimit) {

        if (currentspeed <= speedLimit) {
            System.out.println(make + " is driving at " + currentspeed + " kmph, following the speed limit " + speedLimit);
        } else {
            System.out.println(make + " " + currentspeed + " kmph, over the speed limit " + speedLimit);
        }

    }

    public void accelerate(int kmph) {

        currentspeed += kmph;

    }

    public void gearChange(int gear) {

        switch (gear) {
            case 1:
                System.out.println("Gear 1");
                currentspeed = 20;
                break;
            case 2:
                System.out.println("Gear 2");
                currentspeed = 35;
                break;
            case 3:
                System.out.println("Gear 3");
                currentspeed = 50;
                break;
            case 4:
                System.out.println("Gear 4");
                currentspeed = 70;
                break;
            case 5:
                System.out.println("Gear 5");
                currentspeed = 90;
                break;
            case 6:
                System.out.println("Gear 6");
                currentspeed = 120;
            default:
                System.out.println("Invalid gear");


        }

    }

    public void gearChange(String gear) {

        switch (gear) {

            case "R", "r":
                currentspeed = -10;
                System.out.println("Gear R");
                break;
            default:
                System.out.println("Invalid gear");
        }

    }

    public void showPrice() {

        switch (make) {

            case "Bmw":
                price = 50000;
                break;

            case "Mecedes":
                price = 60000;
                break;

            case "Ferrari":
                price = 150000;
                break;

            case "Ford":
                price = 35000;
                break;

            case "Sahin":
                price = 45000;
                break;
            default:
                System.out.println("Invalid Car make");

        }
    }

    public void printCarInfo() {

        System.out.println("Car make[" + make + "],model[" + model + "],color[" + color + "],current speed[" + currentspeed + "]");
    }

}
