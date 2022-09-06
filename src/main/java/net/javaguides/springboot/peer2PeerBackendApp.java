package net.javaguides.springboot;


import net.javaguides.springboot.model.HealthCareWorkers;
import net.javaguides.springboot.model.Peers;
import net.javaguides.springboot.repository.PeerRepository;
import net.javaguides.springboot.repository.hcwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class peer2PeerBackendApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(peer2PeerBackendApp.class, args);
	}

	@Autowired
	private PeerRepository peerRepository;

	@Autowired
	private hcwRepository hcwRepository;


	@Override
	public void run(String... args) throws Exception {

		/** Manually insert data to
		 * database using setter
		 * methods from setter
		 * annotations defined in
		 * respective peer and hcw
		 * repositories **/

		/** Populates peer table **/
		Peers peers = new Peers();
		peers.setId(123456789);
		peers.setFirstName("Mbali");
		peers.setLastName("Mnisi");
		peers.setEmailId("MM@gmail.com");
		peerRepository.save(peers);

		/** Populates HCW TABLE **/
		HealthCareWorkers hcw = new HealthCareWorkers();
		hcw.setId(98754321);
		hcw.setFirstName("Cleo");
		hcw.setLastName("Vilakazi");
		hcw.setEmailId("cv@gmail.com");
		hcw.setProfession("Psychic");
		hcwRepository.save(hcw);
	}
}
