package dio.Introducao.spring;

import org.springframework.stereotype.Component; //marca uma classe como um Componente Gerenciado pelo ioC, então... vai ser gerenciado como um Bean
import org.springframework.beans.factory.annotation.Autowired; //injeção de dependência automática, o spring busca e injeta automaticamente um bean compatível.

@Component
public class Car {

    private final Engine engine;

    @Autowired       //injeta automaticamente o engine(motor)
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive () {
        engine.start();
        System.out.println("O carro está em movimento VRUMMMMMMMMMMM!");
    }
}
