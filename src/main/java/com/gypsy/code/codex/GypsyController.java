package com.gypsy.code.codex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GypsyController {
	
	@Autowired
	private GypsyService gypsyService;

	@RequestMapping("/titans")
	public List<Gypsy> getAllGypsies() {
		return gypsyService.getAllGypsies();
	}
	@RequestMapping("/titans/{id}")
	public Gypsy getTitan(@PathVariable String id) {
		return gypsyService.getGypsy(id);
	}
	@RequestMapping(method= RequestMethod.POST, value="/titans")
	public void addGypsy(@RequestBody Gypsy gypsy) {
		gypsyService.addGypsy(gypsy);
	}
	@RequestMapping(method= RequestMethod.PUT, value="/titans/{id}")
	public void updateGypsy(@RequestBody Gypsy gypsy, @PathVariable String id) {
		gypsyService.updateGypsy(id, gypsy);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/titans/{id}")
	public void deleteGypsy(@PathVariable String id) {
		gypsyService.deleteGypsy(id);
	}
}
