import dao.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        EntityManager em = factory.createEntityManager();

        try {
            em.getTransaction().begin();

            try {
                Users users = new Users("login","password");
                TypesDetails typesDetails = new TypesDetails("Ходовая");
                Cars cars = new Cars("Ford","Sedan",2018,"USA","RED",2.0D,new BigDecimal(1000000));
                Contractor contractor = new Contractor("PUPKIN","CHINA","Moon street 16","+7(921)753-24-55");
                CarDetails details = new CarDetails("Шарнир1",typesDetails,new BigDecimal(5000),cars,contractor);
                List<CarDetails> carDetails = new ArrayList<>();
                carDetails.add(details);
                cars.setCarDetails(carDetails);
                contractor.setCarDetails(carDetails);

                em.persist(users);
                em.persist(typesDetails);
                em.persist(cars);
                em.persist(contractor);
                em.persist(details);
                em.getTransaction().commit();

            } catch (Exception e) {
                em.getTransaction().rollback();
                System.out.println("ROLLBACK");
                throw e;
            }


        } finally {
            em.close();
            factory.close();
        }

    }
}
