package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.domain.ClientFlor;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.dto.ClientFlorDTO;




@RequestMapping("/flor")
@RestController
public class ClientFlorsController {

	
	
	
	@GetMapping("/clientFlorsAll")
	public ResponseEntity<ClientFlorDTO[]> mostrarFlors(){
		
		String uri = "http://localhost:9001/swagger/flor/getAll";
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<ClientFlorDTO[]> result = restTemplate.getForEntity(uri, ClientFlorDTO[].class);
	    return result;
		
	}
	
	@GetMapping("/clientFlorsGetOne/{id}")
	public ClientFlorDTO mostrarFlor(@PathVariable("id") int id) {
		String uri = "http://localhost:9001/swagger/flor/getOne/{id}";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(uri,ClientFlorDTO.class,id);
		
	}
	
	
	@PostMapping("/clientFlorsAdd")
	public ResponseEntity<Object> afegirFlor(@RequestBody ClientFlor flor) {
		String uri = "http://localhost:9001/swagger/flor/add";
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForEntity(uri,flor,Object.class);
	}
	
	
	@PutMapping("/clientFlorsUpdate/{id}") 
	public ResponseEntity<Object> actualitzarFlor(@RequestBody ClientFlor flor, @PathVariable("id") int id) {
		String uri = "http://localhost:9001/swagger/flor/update/{id}";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ClientFlor> entity = new HttpEntity<ClientFlor>(flor);
		return restTemplate.exchange(uri,HttpMethod.PUT, entity, Object.class, id);
	}
	
	
	@DeleteMapping("/clientFlorsDelete/{id}")
	public ResponseEntity<HttpStatus> eliminarFlor(@PathVariable("id") int id) {
		String uri = "http://localhost:9001/swagger/flor/delete/{id}";
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> entity = new HttpEntity<String>("test");
		return restTemplate.exchange(uri,HttpMethod.DELETE, entity, HttpStatus.class, id);
	}
	
}
