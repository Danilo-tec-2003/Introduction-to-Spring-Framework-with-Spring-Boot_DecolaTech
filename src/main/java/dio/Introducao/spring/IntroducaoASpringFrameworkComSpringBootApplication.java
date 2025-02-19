package dio.Introducao.spring;
                                                                       //MAIN
import org.springframework.boot.SpringApplication; //inicia a aplicação e executa o método mian para rodar o servidor
import org.springframework.boot.autoconfigure.SpringBootApplication; //habilita consifurações automáticas, marca a classe como principal.
import org.springframework.boot.CommandLineRunner; //é uma interface usada para executar código após a inicialização completa da aplicação
import org.springframework.context.ApplicationContext; //é a interface central do Spring, responsável por gerenciar o contexto da aplicação,
import org.springframework.context.annotation.Bean; // usada para definir um bean manualmente dentro de uma classe de configuração

@SpringBootApplication
public class IntroducaoASpringFrameworkComSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoASpringFrameworkComSpringBootApplication.class, args);
	}

	//O código que você forneceu cria um CommandLineRunner que será executado logo após a inicialização da aplicação Spring Boot.
	// O método run acessa o bean Car do contexto da aplicação e chama o método drive() do carro.

	@Bean
	CommandLineRunner run(ApplicationContext context)  {
		return args -> {
			Car car = context.getBean(Car.class); //obtém o Bean do carro
			car.drive(); //aciona o motor e dirige
		};
	}

}
