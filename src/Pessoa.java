public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa:" + nome + "\nIdade: " + idade + "\n";
    }
}
