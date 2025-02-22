package dio.Scopes_Beans_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestScopes {

    @Autowired
    @Qualifier("personSingleton")  // Especifica o bean personSingleton
    private Person personSingleton1;

    @Autowired
    @Qualifier("personSingleton")  // Especifica o bean personSingleton
    private Person personSingleton2;

    @Autowired
    @Qualifier("personPrototype")  // Especifica o bean personPrototype
    private Person personPrototype1;

    @Autowired
    @Qualifier("personPrototype")  // Especifica o bean personPrototype
    private Person personPrototype2;

    //imprimindo Singleton
    public void testSingleton() {
        System.out.println("Testing Singleton:");
        System.out.println("Person Singleton 1: " + personSingleton1.getName());
        System.out.println("Person Singleton 2: " + personSingleton2.getName());
        System.out.println("Are the Singleton instances equal? " + (personSingleton1 == personSingleton2));
    }

    //imprimindo Prototype
    public void testPrototype() {
        System.out.println("Testing Prototype:");
        System.out.println("Person Prototype 1: " + personPrototype1.getName());
        System.out.println("Person Prototype 2: " + personPrototype2.getName());
        System.out.println("Are the Prototype instances different? " + (personPrototype1 != personPrototype2));
    }
}
