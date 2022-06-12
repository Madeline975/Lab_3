class CarWheel extends Car {
    private double diameter;
    private String description;
    public CarWheel(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }
    @Override
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public void display() {
        System.out.printf("Car wheel with diameter %.1f for car %s \n", diameter, super.getName());
    }
}