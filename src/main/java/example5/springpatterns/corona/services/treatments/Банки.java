package example5.springpatterns.corona.services.treatments;

import example5.springpatterns.corona.model.Patient;
import org.springframework.stereotype.Component;

/**
 * @author Alexis-Di
 */
@Component
public class Банки implements Лечение {
    @Override
    public void применить(Patient patient) {
        System.out.println("12 банок, присосать к спине на пол часа перед сном");
    }
}
