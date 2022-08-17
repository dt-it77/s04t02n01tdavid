package cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Domain.Fruita;
import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Repository.FruitaRepository;

@Service
public class FruitaService implements IFruitaService {
    @Autowired
    private FruitaRepository fruitaRepository;
	
	public Fruita add(Fruita novaFruita){
		return fruitaRepository.save(novaFruita);
	}

	public Fruita update(Fruita updateFruida){
       return fruitaRepository.save(updateFruida);
    }
	
	public void delete(int id){
		fruitaRepository.deleteById(id);		
    }
	public Optional<Fruita> getOne(int id){	
		return fruitaRepository.findById(id);		
	}
	public List<Fruita> getAll(){
		return fruitaRepository.findAll();
	}


}
