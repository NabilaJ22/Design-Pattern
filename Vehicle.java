interface Vehicle {
    void setPrice(double price);

    interface Movable {
        void start();

        void stop();
    }

    interface Flyable {
        void fly();
    }

    class Car implements Vehicle, Movable {
        double price;

        @Override
        public void start() {
            System.out.println("Car is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopping...");
        }

        @Override
        public void setPrice(double price) {
            this.price = price;
            System.out.println("Car price is " + price);
        }
    }

    class Aeroplane implements Vehicle, Movable, Flyable {
        double price;

        @Override
        public void setPrice(double price) {
            this.price = price;
            System.out.println("Plane price is " + price);
        }

        @Override
        public void fly() {
            System.out.println("Plane is flying...");

        }

        @Override
        public void start() {
            System.out.println("Engine is starting...");
        }

        @Override
        public void stop() {
            System.out.println("Engine is stopping...");
        }
    }
}

//main function
public class Main {
    public static void main(String[] args) {

        Vehicle.Car car = new Vehicle.Car();
        car.setPrice(15.00);
        car.start();
        car.stop();

        Vehicle.Aeroplane aeroplane = new Vehicle.Aeroplane();
        aeroplane.setPrice(1000);
        aeroplane.start();
        aeroplane.fly();
        aeroplane.stop();
    }
}
