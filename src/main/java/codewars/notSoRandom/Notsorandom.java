package codewars.notSoRandom;
class Notsorandom {

    public static void main(String[] args) {
        System.out.println(notSoRandom(10000, 10000));
    }

    static String notSoRandom(int b, int w){

        Marble[] magicHat = {new Marble("Black", b), new Marble("White", w)};
        String marble1, marble2;
        String lastMarbleColor = "";
        System.out.println("Black: " + b + ",White: " + w);
        do{
            marble1 = pickedMurbleFromMagicHat(magicHat);
            magicHat = removeMurbleFromMagicHat(magicHat, marble1);
            marble2 = pickedMurbleFromMagicHat(magicHat);
            magicHat = removeMurbleFromMagicHat(magicHat, marble2);
            b = magicHat[0].getValue();
            w = magicHat[1].getValue();
            if (b < 1) {

                lastMarbleColor = "White";
            }else if (w < 1){
                lastMarbleColor = "Black";
            }else {

                if (marble1.equals(marble2)){
                    magicHat = addMurbleToMagicHat(magicHat, "White");
                } else {
                    magicHat = addMurbleToMagicHat(magicHat, "Black");
                }
    
                b = magicHat[0].getValue();
                w = magicHat[1].getValue();
            }

        }while (b >= 1 && w >= 1);

        return lastMarbleColor;
    }

    static String pickedMurbleFromMagicHat(Marble[] magicHat){

        // we compute random index value of Hashmap magicHat

        int randomMurbleIndex = (int) Math.floor(Math.random()*magicHat.length);
        String pickedMurble = magicHat[randomMurbleIndex].getName();

        return pickedMurble;
    }

    static Marble[] removeMurbleFromMagicHat(Marble[] magicHat, String removedMurble){

        // we compute random index value of Hashmap magicHat
        for (Marble marble : magicHat) {
            
            if (marble.getName().equals(removedMurble)){
                marble.setValue((marble.getValue())-1);
            }
        }

        return magicHat;
    }

    static Marble[] addMurbleToMagicHat(Marble[] magicHat, String addedMurble){

        // we compute random index value of Hashmap magicHat
        for (Marble marble : magicHat) {
            
            if (marble.getName().equals(addedMurble)){
                marble.setValue((marble.getValue())+1);
            }
        }

        return magicHat;
    }

}
