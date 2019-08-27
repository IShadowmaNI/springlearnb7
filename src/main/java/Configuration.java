import energy.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = "energy") //Sa scanez dupa componente care
@PropertySource("classpath:application.properties")
public class Configuration {

//    @Bean(name = "solar")
//    public Energy solar() {
//        Energy energy = new SolarEnergy(5);
//        return energy;
//    }

//    @Bean(name = "nuclear")
//    public Energy nuclear() {
//        NuclearEnergy nuclearEnergy = new NuclearEnergy();
//        nuclearEnergy.setEnergyLevel(1);
//        return nuclearEnergy;
//    }


//    @Bean(name = "newEnergy")
//    public Energy newEnergy() {
//        NewEnergy newEnergy = new NewEnergy(3);
//        newEnergy.setLocalEnergy(-5);
//
//        return newEnergy;
//    }

    // Vom folosi ComponentScan si nu mai e nevoie de aceasta metoda
//    @Bean
//    public Bec bec() {
//        return new Bec(newEnergy());
//    }
}
