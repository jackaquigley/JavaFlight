public enum ModelType {
    BOEING747(300,650);

    public final int capacity;
    private final int totalWeight;;

    ModelType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }
}
