package cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Services;

import java.util.Optional;

import java.util.List;
import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Domain.Fruita;

public interface IFruitaService {
    public Fruita add(Fruita novaFruita);
    public Fruita update(Fruita updateFruita);
    public void delete(int id);
    public Optional<Fruita> getOne(int id);
    public List<Fruita> getAll();
}
