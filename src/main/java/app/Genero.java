package app;

public class Genero {
    private long id;
    private String nome;

    public void setId(long id) {
        if(id<1) {
            throw new IllegalArgumentException("Id inválido");
        }
        this.id = id;
    }
    
    public long getId() {
        return this.id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public Genero (long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    public Genero() {}
}