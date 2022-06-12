class CarEngine extends Car {
    private int power;
    private String description;
    public CarEngine(String name, int power) {
        super(name);
        this.power = power;
    }
    @Override
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public void display() {
        System.out.printf("Car engine with power %d hp for car %s \n", power, super.getName());
    }
}