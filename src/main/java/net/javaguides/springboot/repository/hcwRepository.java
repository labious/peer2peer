package net.javaguides.springboot.repository;
import net.javaguides.springboot.model.HealthCareWorkers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hcwRepository extends JpaRepository<HealthCareWorkers,Long> {
    //all crud database methods
}
