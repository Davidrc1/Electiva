package sv.edu.ucad.et1.biblioteca.data;

import org.hibernate.Session;

import sv.edu.ucad.et1.biblioteca.entities.Estudiantes;
import sv.edu.ucad.et1.biblioteca.entities.Facultad;


public class UnoaUno {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
	//	sesion.getTransaction().begin(); //empieza trasacion
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Facultad facu = createNewFacultad();
			Estudiantes estudiantes = createNewEstudiantes(facu);
			
			sesion.save(estudiantes);
			transaccion.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
	
	//CREAR NUEVO ESTUDIANTES
	private static Estudiantes createNewEstudiantes(Facultad facu){
		Estudiantes estu = new Estudiantes();
		estu.setNomestudi("David");
		estu.setApestudi("Ramirez");
		estu.setCarnestudi("12345");
		estu.setDirestudi("Colonia san jose");
		estu.setTelestudi("71234567");
		estu.setFacu (facu);
		return estu;
	}
	
	//CREAR NUEVA FACULTAD
	private static Facultad createNewFacultad() {
		Facultad facus = new Facultad();
		facus.setNomfac("Facultad Economia");
		return facus;
	}
}//fin de la clase Principal
