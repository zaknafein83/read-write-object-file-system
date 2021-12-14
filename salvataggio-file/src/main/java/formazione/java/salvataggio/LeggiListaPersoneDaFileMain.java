package formazione.java.salvataggio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LeggiListaPersoneDaFileMain {
	
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("salvataggio.jvm"));
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			List<Persona> listaPersone = (List<Persona>) inputStream.readObject();
			
			for (Persona persona : listaPersone) {
				System.out.println(persona.getCognome() + " " + persona.getNome());
			}
			
			inputStream.close();
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
