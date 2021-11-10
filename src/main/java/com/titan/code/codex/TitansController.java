package com.titan.code.codex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TitansController {
	
	@Autowired
	private TitanService titanService;

	@GetMapping ("/titans")
	public List<Titan> getAllTitans() {
		return titanService.getAllTitans();
	}
	@GetMapping ("/titans/{id}")
	public Titan getTitan(@PathVariable String id, @RequestBody Titan titan) {
		return titanService.getTitan(id);
	}
	@PostMapping( value="/titans")
	public void addTitan(@RequestBody Titan titan) {
		titanService.addTitan(titan);
	}
	@PutMapping( value="/titans/{id}")
	public void updateTitan(@RequestBody Titan titan, @PathVariable String id) {
		titanService.updateTitan(id, titan);
	}
	@DeleteMapping(value="/titans/{id}")
	public void deleteTitan(@PathVariable String id) {
		titanService.deleteTitan(id);
	}
}
