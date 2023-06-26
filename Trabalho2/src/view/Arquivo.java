package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

	public void escreverDados(String msg, File file) {
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(file, true);
			arquivo.write(msg);
			arquivo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
