public enum PlaneType {
    BOEING747(850);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
