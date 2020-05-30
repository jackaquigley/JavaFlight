public class Plane {

    private ModelType model;

    public Plane(ModelType model){
        this.model = model;
    }

    public ModelType getModel(){
        return this.model;
    }

    public int getCapacityPlane(){
        return this.model.getCapacity();
    }

    public int getTotalWeightPlane(){
        return this.model.getTotalWeight();
    }
}
