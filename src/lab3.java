import java.util.Random;

public class lab3 {

    static int N = 10;
    static String[] carnames = new String[] { "Audi", "BMW", "Chevrolet", "Ford", "Honda", "Hyundai", "Kia", "Lexus", "Mazda", "Mercedes", "Mitsubishi", "Nissan", "Renault", "Skoda", "Subaru", "Suzuki", "Toyota", "Volkswagen" };

    static private String getRandomCarName() {
        int rnd = new Random().nextInt(carnames.length);
        return carnames[rnd];
    }

    static private String getRandomDescription() {
        String description = "";
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 7; i++) {
            description += alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return description;
    }

    public static void main(String[] args) {
        Car[] cars = new Car[N];
        CarEngine[] carEngines = new CarEngine[N];
        CarWheel[] carWheels = new CarWheel[N];
        for (int i = 0; i < N; i++) {
            Car car = new Car(getRandomCarName());
            car.setDescription(getRandomDescription());
            CarEngine carEngine = new CarEngine(car.getName(), new Random().nextInt(500));
            carEngine.setDescription(getRandomDescription());
            CarWheel carWheel = new CarWheel(car.getName(), new Random().nextDouble()*25.0);
            carWheel.setDescription(getRandomDescription());
            cars[i] = car;
            carEngines[i] = carEngine;
            carWheels[i] = carWheel;
        }
        for (int j = 0; j < N; j++) {
            cars[j].display();
            carEngines[j].display();
            carWheels[j].display();
        }
    }

}