package cat.itacademy.barcelonactiva.t.david.s04.t02.n01.s04t02n01td.Model.Domain;

import javax.persistence.*;

@Entity
@Table(name = "fruita")
public class Fruita {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)    
    int id;
    @Column(name = "nom")
    String nom;
    @Column(name = "quantitatQuilos")
    int quantitatQuilos;

    public Fruita() {
	}
	public Fruita(int id, String nom, int quantitatQuilos) {
		this.id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}
	public long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	@Override
	public String toString() {
		return "Fruita [id=" + id + ", nom=" + nom + ", quantitatQuilos=" + quantitatQuilos +"]";
	}
}
