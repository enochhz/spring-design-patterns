package designpattern.factory;

public class Dog implements Pet{
    private String name;
    private boolean hungry;

    public Dog(){
        super();
        this.hungry = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return "DOG";
    }

    public boolean isHungry() {
        return this.hungry;
    }

    public void feed() {
        this.hungry=false;
    }
}

