import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList <Pessoa> listaDePessoa = new ArrayList<Pessoa>();

       Pessoa pessoa1= new Pessoa("Joana" , 32);
       Pessoa pessoa2= new Pessoa("Jane" , 32);
       Pessoa pessoa3= new Pessoa("John" , 32);

       listaDePessoa.add(pessoa1);
       listaDePessoa.add(pessoa2);
       listaDePessoa.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoa.size());
        System.out.println("Primeira Pessoa: " + listaDePessoa.get(0));

        for (Pessoa p : listaDePessoa) {
            System.out.println(p);

        }
        }
    }
