package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.services;

import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.domain.ClientFlor;
import cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.dto.ClientFlorDTO;

public class Mapper {

	public static ClientFlorDTO toDTO(ClientFlor flor) {
		return new ClientFlorDTO(flor.getFlorID(),flor.getNomFlor(),flor.getPaisFlor());
	}
	
	
	public static ClientFlor toFlor(ClientFlorDTO florDTO) {
		return new ClientFlor(florDTO.getFlorID(),florDTO.getNomFlor(),florDTO.getPaisFlor());
	}
	
	
}
