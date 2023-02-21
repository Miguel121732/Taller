import puntoCinco.Student;
import puntoSiete.Person;

public class Principal {
	
	public static void main (String[] args) {
	    //crear un objeto tipo student con la siguiente sintaxis
		//primero coloco el tipo de dato del objeto, despues el nombre del objeto
		//luego el signo igual, despues la palabra new y por ultimo el constructor de la clase
		
		Student st = new Student();
		System.out.println(st.name + "\n" + st.Id + "\n" + st.status);
	

	

	 Person p1 = new Person(37,"arial ");
	 Person p2 = new Person(15," Joseph");
	 
	 if(p1.getName() == p2.getName()) {
		 
		System.out.println(p1.getName()+" es el mismo nombre que " + p2.getName());
	 }

	 else {
		 System.out.println(p1.getName()+"NO tiene el mismo nombre que" + p2.getName());
	 }
	 
	 if(p1.getAge() == p2.getAge()){
			System.out.println(p1.getAge() +" es la mismo edad que" + p2.getAge());
		}
		else {
			System.out.println(p1.getAge() +" NO es la misma edad que " + p2.getAge());
		}
	 
	} //final de la clase principal

}//final del metodo main