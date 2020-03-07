package App_Control_Pattern;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        AlphabetController controller = new AlphabetController();

        controller.mapCommand("Recite alphabet", new AlphabetCatcher());

        HashMap alphabet = new HashMap();

        alphabet.put("1", "A: Apple, axe, album");
        alphabet.put("2", "B: Boy, bat, box");
        alphabet.put("3", "C: Cat, car, can");
        alphabet.put("4", "D: Dog, dish, desk");
        alphabet.put("5", "E: Egg, ear, eel");
        alphabet.put("6", "F: Fish, fire, fox");
        alphabet.put("7", "G: Golf, grape, garage");
        alphabet.put("8", "H: Hat, horse, house");
        alphabet.put("9", "I: Ice, isle, ill");
        alphabet.put("10", "J: Jump, jack, jazz");
        alphabet.put("11", "K: Kite, kitten, knock");
        alphabet.put("12", "L: Lock, lamb, life");
        alphabet.put("13", "M: Mail, mom, match");
        alphabet.put("14", "N: Nail, newt, narwhal");
        alphabet.put("15", "O: Ox, owl, olive");
        alphabet.put("16", "P: Pie, penguin, pier");
        alphabet.put("17", "Q: Quail, quill, quilt");
        alphabet.put("18", "R: Rake, rail, rats");
        alphabet.put("19", "S: Star, stem, step");
        alphabet.put("20", "T: Tire, tiger, towel");
        alphabet.put("21", "U: Umbrella, usher, ukelele");
        alphabet.put("22", "V: Violin, vase, van");
        alphabet.put("23", "W: Whale, wall, wasp");
        alphabet.put("24", "X: Not a lot, actually");
        alphabet.put("25", "Y: yam, yell, yak");
        alphabet.put("26", "Z: Zebra, zipper, zoo");

        controller.manageRequest("Recite alphabet", alphabet);
    }
}
