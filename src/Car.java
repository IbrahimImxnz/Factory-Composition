import java.util.List;

public class Car {
    private Engine engine;
    private List<Seat> seats;
    private Color color;

    public Car(Engine engine, List<Seat> seats, Color color){
        this.engine = engine;
        this.seats = seats;
        this.color = color;
    }

    public Engine getEngine(){
        return engine;
    }

    public List<Seat> getSeats(){
        return seats;
    }

    public Color getColor(){
        return color;
    }
}
