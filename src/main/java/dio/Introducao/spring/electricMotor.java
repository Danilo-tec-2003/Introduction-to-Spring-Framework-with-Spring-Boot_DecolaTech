package dio.Introducao.spring;

import org.springframework.stereotype.Component; //marca uma classe como um Componente Gerenciado pelo ioC, então... vai ser gerenciado como um Bean

@Component
public class electricMotor implements Engine {

    @Override  //indica que um método está sobrescrevendo um método de uma classe pai ou interface (nesse caso a interface = Engine)
    public void start() {
        System.out.println("motor elétrico ligado!");
    }
}
