package iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Repository bikeRepo = new Repository();
        bikeRepo.addBike("Fuji");
        bikeRepo.addBike("Scott");
        bikeRepo.addBike("Cervelo");

        Iterator<String> it = bikeRepo.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String bike : bikeRepo) {
            System.out.println(bike);
        }
    }
}
