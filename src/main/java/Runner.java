import energy.Bec;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
//        Energy solar = context.getBean("solar", Energy.class);

        Bec myBec = context.getBean(Bec.class);
        myBec.getEnergyLevelFromBec();
        System.out.println(myBec);
    }
}
