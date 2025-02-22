package dio.Scopes_Beans_Autowiring;

public class Person {

    private String name;

    // Construtor
    public Person(String name) {
        this.name = name;
    }

    // Getter e Setter do "nome"
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //  declarando o Metodo para imprimir nome
    public void sayName() {
        System.out.println("o nome da Pessoa é: " + name);
    }
}
