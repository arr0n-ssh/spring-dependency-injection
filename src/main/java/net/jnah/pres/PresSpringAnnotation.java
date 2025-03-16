package net.jnah.pres;

import net.jnah.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.jnah");
        IMetier metier = applicationContext.getBean(IMetier.class);

        System.out.println("result: " + metier.calcul());
        System.out.println("test");
    }
}
