package Lista4;

public abstract class AnimalAB implements AnimalIF {

    private String nome;
    private String tipoAnimal;
    private Integer idade;
    private String habitat;

    public AnimalAB() {
    }

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public void comer(double massa) {
        System.out.println("O animal comeu " + massa + " Kg de alimento para cachorro");
    }

    @Override
    public void moverse(double distancia) {
        System.out.println("O animal moveu-se " + distancia + " Km");
    }

    @Override
    public void dormir(double tempo) {
        System.out.println("O animal dormiu " + tempo + " horas.");
    }
}
