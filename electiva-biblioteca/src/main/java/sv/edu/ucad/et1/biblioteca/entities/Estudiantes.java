package sv.edu.ucad.et1.biblioteca.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="estudiantes")
@Access(value=AccessType.PROPERTY)

public class Estudiantes {
	private int codestudi;
	private String nomestudi;
	private String apestudi;
	private String carnestudi;
	private String direstudi;
	private String telestudi;

	public Facultad facu;

	//asociacion UnoaUno Unidireccional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codfac", updatable=false)
	public Facultad getFacu() {
		return facu;
	}
	public void setFacu(Facultad facu) {
		this.facu = facu;
	}
	
	private boolean estado;
	
@Transient 
public boolean isEstado() {
	return estado;
}
public void setEstado(boolean estado){
	this.estado = estado;
	
}

	
	//DEFINE METODO SETTERS Y GETTERS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codestudi", updatable=false)	
	public int getCodestudi() {
		return codestudi;
	}
	public void setCodestudi(int codestudi) {
		this.codestudi = codestudi;
	}
 	
	@Column(name="nomestudi", nullable=false)	
	public String getNomestudi() {
		return nomestudi;
	}
	public void setNomestudi(String nomestudi) {
		this.nomestudi = nomestudi;
	}
	@Column(name="apestudi", nullable=false)	
	public String getApestudi() {
		return apestudi;
	}
	public void setApestudi(String apestudi) {
		this.apestudi = apestudi;
	}
	@Column(name="carnestudi", nullable=false)	
	public String getCarnestudi() {
		return carnestudi;
	}
	public void setCarnestudi(String carnestudi) {
		this.carnestudi = carnestudi;
	}
	@Column(name="direstudi")	
	public String getDirestudi() {
		return direstudi;
	}
	public void setDirestudi(String direstudi) {
		this.direstudi = direstudi;
	}
	@Column(name="telestudi")	
	public String getTelestudi() {
		return telestudi;
	}
	public void setTelestudi(String telestudi) {
		this.telestudi = telestudi;
	}
}
//FIN CLASE USUARIO


	
	
	
	
	
	
	
	