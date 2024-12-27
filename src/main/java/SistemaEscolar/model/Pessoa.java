package main.java.SistemaEscolar.model;

public abstract class Pessoa {
    private String nome;
    private String id;

    public Pessoa(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
