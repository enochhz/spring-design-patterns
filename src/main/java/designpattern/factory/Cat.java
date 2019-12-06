package designpattern.factory;

public class Cat implements Pet {
    private String name;
    private boolean hungry;

    public Cat(){
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
        return "CAT";
    }

    public boolean isHungry() {
        return this.hungry;
    }

    public void feed() {
        this.hungry = false;
    }
}

