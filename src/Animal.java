public class Animal {
    private String nome;
    private int comprimento;
    private String cor;
    private String ambiente;
    private double velocidade;
    private int patas;


    public Animal() {
    
    }

    public Animal(String nome, int comprimento, String cor, String ambiente, double velocidade, int patas) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    public String dados() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", comprimento='" + getComprimento() + "'" +
            ", cor='" + getCor() + "'" +
            ", ambiente='" + getAmbiente() + "'" +
            ", velocidade='" + getVelocidade() + "'" +
            ", patas='" + getPatas() + "'" +
            "}";
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return this.ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    

}
