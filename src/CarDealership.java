import java.util.ArrayList;
import java.util.List;

public class CarDealership{
    private CarPartFactory partFactory;

    public CarDealership(CarPartFactory partFactory){
        this.partFactory = partFactory;
    }

    public Car order(Color carColor, Color seatColor){
        Engine engine = partFactory.buildEngine();
        List<Seat> seats = new ArrayList<>();
        seats.add(partFactory.buildSeat(seatColor));
        seats.add(partFactory.buildSeat(seatColor));
        return new Car(engine, seats, carColor);
    }


}
