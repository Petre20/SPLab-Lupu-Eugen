package com.example.splablupueugen;

import com.example.splablupueugen.diexamples.ClientComponent;
import com.example.splablupueugen.diexamples.SingletonComponent;
import com.example.splablupueugen.diexamples.TransientComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpLabLupuEugenApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpLabLupuEugenApplication.class, args);

        ApplicationContext context = SpringApplication.run(SpLabLupuEugenApplication.class, args);

        TransientComponent transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean =
                context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean =
                context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c =
                context.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent) context.getBean("clientComponent");
        c.operation();
    }

}
