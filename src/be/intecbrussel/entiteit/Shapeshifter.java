package be.intecbrussel.entiteit;

public class Shapeshifter extends Hero{

    public Shapeshifter(){

    }
    public Shapeshifter(String alias){
        this.alias=alias;

    }
    public Shapeshifter(String alias, int age){
        this.alias=alias;
        this.age=age;

    }

    @Override
    public String toString() {
        return "Shapeshifter{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                "} ";
    }

    public void useSuperPower(){
        System.out.println("disguises as enemy, attack enemy from behind");

    }
}
