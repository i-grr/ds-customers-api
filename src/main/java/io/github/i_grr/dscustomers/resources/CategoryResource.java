package io.github.i_grr.dscustomers.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.i_grr.dscustomers.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Igor Silva", "014.713.364-50", 4000.00, Instant.parse("2002-03-10T10:12:35Z"), 0));
		list.add(new Client(2L, "André Borges", "333.108.183-30", 7350.00, Instant.parse("1990-07-23T14:23:41Z"), 2));
		return ResponseEntity.ok().body(list);
	}
	
}
