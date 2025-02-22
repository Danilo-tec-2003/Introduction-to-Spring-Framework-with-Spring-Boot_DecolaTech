package dio.Scopes_Beans_Autowiring;

import org.springframework.context.annotation.Bean; //usada para declarar um método que cria e retorna um objeto
import org.springframework.context.annotation.Configuration; //marca uma classe como uma classe de configuração do Spring, ou seja, ela contém definições de beans
import org.springframework.context.annotation.Scope; //define o escopo de um bean, ou seja, como e quando ele será instanciado.

@Configuration
public class PersonConfig {

    @Bean
    public Person personSingleton() {
        return new Person("Danilo");  // Person Singleton: Danilo
    }

    @Bean
    @Scope("prototype")
    public Person personPrototype() {
        return new Person("Rebeca");  // Person Prototype: Rebeca
    }
}
