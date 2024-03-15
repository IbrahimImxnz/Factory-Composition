public class UniquelyFancyCarPartFactory implements CarPartFactory {
    private static UniquelyFancyCarPartFactory instance;

    private UniquelyFancyCarPartFactory(){}

    public static UniquelyFancyCarPartFactory getInstance(){
        if(instance == null){
            synchronized (UniquelyFancyCarPartFactory.class){
                if(instance == null){
                    instance = new UniquelyFancyCarPartFactory();
                }
            }
        }
        return instance;
    }

    @Override
    public synchronized Engine buildEngine() {
        return new ConstructedEngine();
    }

    @Override
    public synchronized Seat buildSeat(Color color) {
        return new ConstructedSeat();
    }

}
