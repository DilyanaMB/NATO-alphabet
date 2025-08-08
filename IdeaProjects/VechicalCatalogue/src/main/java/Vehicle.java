public class Vehicle {
    private String model;
    private String colour;
    private int horsepower;
    private String type;

    public Vehicle(String model, String colour, int horsepower, String type){
        this.model = model;
        this.colour = colour;
        this.horsepower = horsepower;
        this.type = type;
    }

    public String toString(){
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %s", type,model,colour,horsepower);
    }

    public String getModel(){
        return model;
    }

    public int getHorsepower(){
        return horsepower;
    }
}
