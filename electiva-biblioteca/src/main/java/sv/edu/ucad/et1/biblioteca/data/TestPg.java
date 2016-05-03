package sv.edu.ucad.et1.biblioteca.data;

import org.hibernate.Session;

/*
 * probar la conexion con postgres
 */
public class TestPg {
public static void main(String[] args){
	Session sesion = HibernateUtil.getSessionFactory().openSession();
	sesion.beginTransaction();
	sesion.close();
}
}