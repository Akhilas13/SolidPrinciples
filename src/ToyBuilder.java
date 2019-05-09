public class ToyBuilder {

    public static void main(String[] args) {

        Train train = new Train("Shatabdi Express", "Blue", 100);
        Car car = new Car("Ertiga", "Red", 200);
        Plane plane = new Plane("Boeing", "White", 300);

        train.display();
        car.display();
        plane.display();

    }

}

interface Toy{

    public void move();

    public void display();

}

class ToyModel{

    String name;
    float cost;
    String colour;

}

class GroundMovable extends ToyModel implements Toy{

    @Override
    public void move(){

        System.out.println("Moves on ground");

    }

    @Override
    public void display(){

        move();
        System.out.println("Displaying ground movable");

    }

}

class AirMovable extends ToyModel implements Toy{

    @Override
    public void move(){

        System.out.println("Flies");

    }

    @Override
    public void display(){

        move();
        System.out.println("Displaying air movable");

    }

}

class Train extends GroundMovable{

    Train(String name, String colour, int cost){

        this.name = name;
        this.colour = colour;
        this.cost = cost;

    }

}

class Car extends GroundMovable{

    Car(String name, String colour, int cost){

        this.name = name;
        this.colour = colour;
        this.cost = cost;

    }

}

class Plane extends AirMovable{

    Plane(String name, String colour, int cost){

        this.name = name;
        this.colour = colour;
        this.cost = cost;

    }

}
