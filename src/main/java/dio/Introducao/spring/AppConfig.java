package dio.Introducao.spring;


import org.springframework.context.annotation.ComponentScan; //usada para especificar os pacotes onde o Spring deve buscar e registrar componentes automaticamente
import org.springframework.context.annotation.Configuration; //indica uma classe de config, onde pode ser definido beans ou realizar outras config



@Configuration
@ComponentScan(basePackages = "dio.introducao.spring")   //escanea o pacote e registra todos os componentes como @Component, @Service, @Repository etc...
public class AppConfig {

}
