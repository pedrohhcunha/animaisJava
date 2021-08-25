public class TesteAnimais {
    public static void main(String[] args) throws Exception {
        System.out.println("---> ZOOLOGICO ABERTO <---");

        Animal camelo = new Animal("Animal", 34, "Rosa", "Deserto", 4.89, 4);

        Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 7, 6.89);

        Mamifero urso = new Mamifero("Urso canada", "Vermelho", "Mel", 6, 3, 4);

        System.out.println("--- CAMELO ---");
        System.out.println(camelo.dados());

        System.out.println("--- TUBARÂO ---");
        System.out.println(tubarao.dados());

        System.out.println("--- URSO CANADA ---");
        System.out.println(urso.dados());

        System.out.println("---> ZOOLOGICO FECHADO <---");
    }
}
