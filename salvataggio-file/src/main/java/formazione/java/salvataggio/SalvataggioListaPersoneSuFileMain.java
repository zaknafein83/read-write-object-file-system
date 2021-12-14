package formazione.java.salvataggio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SalvataggioListaPersoneSuFileMain {
	
	public static void main(String[] args) {
		List<Persona> listaDiPersone = new ArrayList<Persona>();
		
		listaDiPersone.add(new Persona("francesco", "sisca", "zaknafein", "123456"));
		listaDiPersone.add(new Persona("giovanno", "sisca", "paupapu", "987654"));
		listaDiPersone.add(new Persona("Marcello", "mazzucca", "zaknafein", "123***456"));
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File("salvataggio.jvm"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(listaDiPersone);
			
			objectOutputStream.close();
			fileOutputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
