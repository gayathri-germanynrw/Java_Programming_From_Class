package m25_class_and_object;

public class CarClient {
    public static void main(String[] args) {
       Car car= new Car();
        car.make="Toyota";
        car.model="Corella";
        car.color="Black";
        car.year=1990;
        car.price=30_0000;
        car.start();
        car.drive();
        car.stop();
        car.showCurrentSpeed(170,180);
        System.out.println(car);

        Car car2=new Car();
        System.out.println("car2 = " + car2);



        

    }
}
