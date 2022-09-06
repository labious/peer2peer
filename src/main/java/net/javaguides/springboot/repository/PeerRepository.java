package net.javaguides.springboot.repository;


import net.javaguides.springboot.model.Peers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeerRepository extends JpaRepository<Peers, Long> {
    //all crud database methods
}
