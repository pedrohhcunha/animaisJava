public class Peixe extends Animal {
    private String caracteristica;


    public Peixe() {
    
    }

    public Peixe(String nome, String caracteristica, int comprimento, double velocidade) {
        super(nome, comprimento, "cinzento", "mar", velocidade, 0);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }


    public String dados() {
        return "{" + super.dados() +
            " caracteristica='" + getCaracteristica() + "'" +
            "}";
    }



}
