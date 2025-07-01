package POO;

import java.util.Random;

public class Hipo extends Animal {

    public void sound() {
        System.out.println("O hipopótamo grunhe: 'Grrrrrrrr!'");
    }

    public void swim() {
        System.out.println("O hipopótamo está nadando no rio.");
    }

    public void openMouth() {
        System.out.println("O hipopótamo abre um bocão enorme!");
    }

    public void rest() {
        System.out.println("O hipopótamo está descansando à sombra.");
    }

    public void eat() {
        System.out.println("O hipopótamo está comendo capim às margens do rio.");
    }

    public void dailyRoutine() {
        System.out.println("🌅 Início da rotina do hipopótamo:");

        swim();
        if (new Random().nextBoolean()) {
            sound();
        } else {
            openMouth();
        }

        eat();

        int horas = new Random().nextInt(3) + 1;
        for (int i = 1; i <= horas; i++) {
            System.out.println("Hora " + i + " de descanso...");
            rest();
        }

        System.out.println("🌇 Fim da rotina do hipopótamo.\n");
    }
}
