public class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
    }


    public Mamifero(String nome, String cor, String alimento, int comprimento, int velocidade, int patas) {
        super(nome, comprimento, cor, "Terra", velocidade, patas);
        this.alimento = alimento;
    }

    public String dados() {
        return "{" + super.dados() +
            " alimento='" + getAlimento() + "'" +
            "}";
    }

    public String getAlimento() {
        return this.alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    
}
