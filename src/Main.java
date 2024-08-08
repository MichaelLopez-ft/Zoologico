public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais", 3);
        Gato miGato = new Gato("Wilson", 2);

        miPerro.hacerSonido();
        miPerro.comer();
        miPerro.beber();
        miPerro.dormir();
        miPerro.hacerTruco();
        miPerro.hacerTruco("Saltar");

        miGato.hacerSonido();
        miGato.comer();
        miGato.beber();
        miGato.dormir();
    }
}
