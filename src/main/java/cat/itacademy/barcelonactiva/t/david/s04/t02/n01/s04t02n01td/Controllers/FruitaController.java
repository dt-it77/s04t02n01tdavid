package cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Domain.Fruita;
import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Services.IFruitaService;

@RestController
public class FruitaController {
	
	@Autowired
	private IFruitaService fruitaService;

	@GetMapping("/fruita/getAll")
	public ResponseEntity<List<Fruita>> getAll() {
		return new ResponseEntity<>(fruitaService.getAll(), HttpStatus.OK);
	}    
	@GetMapping("/fruita/getOne/{id}")
	public ResponseEntity<Fruita> getOne(@PathVariable("id") int id) {
		Optional<Fruita> _fruita = fruitaService.getOne(id);
		if (_fruita.isPresent()) {
			return new ResponseEntity<>(_fruita.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}    
	@PostMapping("/fruita/add")
	public ResponseEntity<Fruita> add(@RequestBody Fruita fruita) {
		try {
			Fruita _fruita =  fruitaService.add(fruita);
			return new ResponseEntity<>(_fruita, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/fruita/update")
	public ResponseEntity<Fruita> update(@RequestBody Fruita fruita) {
		try {
			Fruita _fruita =  fruitaService.add(fruita);
			return new ResponseEntity<>(_fruita, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/fruita/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id) {
		try {
			fruitaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
