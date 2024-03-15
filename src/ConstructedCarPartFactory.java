public class ConstructedCarPartFactory implements CarPartFactory {
    @Override
    public Engine buildEngine() {
        return new ConstructedEngine();
    }

    @Override
    public Seat buildSeat(Color color) {
        return new ConstructedSeat();
    }
}
