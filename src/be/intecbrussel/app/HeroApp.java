package be.intecbrussel.app;

import be.intecbrussel.entiteit.*;
import be.intecbrussel.util.AllTheHeroes;


public class HeroApp {

    public static void main (String[] args) {

        AllTheHeroes heroes = new AllTheHeroes();

//        Hero[] listOfHeroes = heroes.getHeroes();


        ArmoredHero ironMan = new ArmoredHero("Iron Man", 54);
        Tank hulk = new Tank("Hulk", 55);
        Energizer ironFist = new Energizer("Iron Fist",43);
        Shapeshifter misterFantastic = new Shapeshifter("Mister Fantastic",56);
        Energizer havok = new Energizer("Havok",48);
        Shapeshifter mystique = new Shapeshifter("Mystique",39);


        heroes.addSuperHero(ironMan);
        heroes.addSuperHero(hulk);
        heroes.addSuperHero(ironFist);
        heroes.addSuperHero(misterFantastic);


        printHeader();



        heroes.getHeroes();


        heroes.removeSuperHero(ironFist);
        heroes.removeSuperHero(misterFantastic);


        heroes.addSuperHero(havok);
        heroes.addSuperHero(mystique);

        printHeader();


        heroes.getHeroes();




    }

    private static void print(Hero[] listOfHeroes) {
        printHeader();



        for(int i = 0; i < listOfHeroes.length; i++) {
            if (listOfHeroes[i] != null) {
                System.out.println(listOfHeroes[i]);
                fancyLines(55);
            }
        }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tLIST OF HEROES\n");
        fancyLines(45);
    }

    private static void fancyLines (int numbOfLines){
        for (int i = 0; i < numbOfLines; i++){
            System.out.print("-");
            if (i == (numbOfLines-1)){
                System.out.println("|\n");
            }
        }
    }

}
