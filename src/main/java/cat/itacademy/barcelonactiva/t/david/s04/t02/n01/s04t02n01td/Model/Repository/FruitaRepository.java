package cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Domain.Fruita;

@Repository
public interface FruitaRepository extends JpaRepository<Fruita, Integer> {
    /* Aqui podriem crear algun metode personalitzat, no ens fara falta per l'exercici... */
  }