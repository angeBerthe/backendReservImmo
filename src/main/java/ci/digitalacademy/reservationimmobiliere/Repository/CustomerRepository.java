package ci.digitalacademy.reservationimmobiliere.Repository;

import aj.org.objectweb.asm.commons.Remapper;
import ci.digitalacademy.reservationimmobiliere.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findBySlug(String slug);
}
