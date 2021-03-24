package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Чеснок implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("Вставить ческнок в ущи, нос и рот, крутить по часовой стрелке во время еды, до конца пандемии");
    }
}
