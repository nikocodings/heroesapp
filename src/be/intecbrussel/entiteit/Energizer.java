package be.intecbrussel.entiteit;

public class Energizer extends Hero{

    public Energizer(){


    }
    public Energizer(String alias){
        this.alias=alias;

    }
    public Energizer(String alias, int age){
        this.alias=alias;
        this.age=age;

    }

    @Override
    public String toString() {
        return "Energizer{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                "} " ;
    }

    public void useSuperPower(){
        System.out.println("charging... , attacks enemy with charges superpowers");

    }
}
