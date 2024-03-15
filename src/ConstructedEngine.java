public class ConstructedEngine implements Engine {
    @Override
    public int getNumberOfPistons() {
        return 8;
    }

    @Override
    public int getSize() {
        return 500;
    }

    @Override
    public int getFuelConsumption() {
        return 50;
    }
}
