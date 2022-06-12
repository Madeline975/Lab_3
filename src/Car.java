class Car {
    private String name;
    private String description;
    public Car(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public void display() {
        System.out.printf("Car %s; description %s \n", name, description);
    }
}