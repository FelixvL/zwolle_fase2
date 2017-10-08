package nl.zwolle.fase2.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.zwolle.fase2.domain.Entiteit;

@RestController
public class EntityEndpoint {
		
		@GetMapping("/entiteit")
		public List<Entiteit> getAllBanks(){
			return Arrays.asList(
					new Entiteit("Entiteit"));
		}
}
