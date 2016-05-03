package sv.edu.ucad.et1.biblioteca.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="facultad")
@Access(value=AccessType.PROPERTY)


public class Facultad {
    private int codfac;
	private String nomfac;

//DEFINIR GETTERS Y SETTERS
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codfac", updatable=false)
	public int getCodfac (){
		return codfac;
	}
	public void setCodfac(int codfac) {
		this.codfac = codfac;
	}

	@Column(name="nomfac", nullable=false)
	public String getNomfac (){
		return nomfac ;
	}
	public void setNomfac (String nomfac){
		this.nomfac = nomfac;
	}
}
