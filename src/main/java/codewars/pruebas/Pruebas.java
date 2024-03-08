package pruebas;

class Animal {}
class Dog extends Animal {
    void bark() {}
}

class Pruebas {

    public static void main(String[] args) {

        double sideLength = 8.0;
        double diagonal = sideLength * Math.sqrt(2);

        double diagonal1 = Math.hypot(sideLength, sideLength);

        
    }

}

