package co.net.parking.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.net.parking.dto.RespuestaGeneralDTO;

/**
 * clase para el manejo de archivos y carpetas
 * 
 * @author a.mora
 *
 */
public class Archivo {

	private String ruta;

	public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
	public static final Charset UTF_8 = Charset.forName("UTF-8");

	public void setRuta(String path) {
		this.ruta = path;
	}

	private String getRuta() {
		return this.ruta;
	}

	/**
	 * método que guarda un archivo que se haya especificado con su ruta
	 * 
	 * @param content = "string"
	 * @return boolean
	 */
	public Boolean saveFile(String content) {
		Boolean response = false;
		try {
			// Create new file
			// String content = "This is the content to write into create file";
			File file = new File(this.getRuta());

			if (!file.exists()) {// If file doesn't exists, then create it
				file.createNewFile();
			}

			// FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file.getAbsoluteFile()), StandardCharsets.UTF_8));
			// BufferedWriter bw = new BufferedWriter(fw);

			bw.write(content);// Write in file
			bw.newLine();
			bw.close();// Close connection

			response = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return response;
	}

	/**
	 * método que crea una carpeta si no existe
	 * 
	 * @param path
	 * @return
	 */
	public Boolean createFolder(String path) {
		Boolean response = false;

		File theDir = new File(path);

		if (!theDir.exists()) {// if the directory does not exist, create it
			try {
				theDir.mkdir();
				response = true;
			} catch (SecurityException se) {
				se.printStackTrace();
			}
		} else {
			response = true;
		}
		return response;

	}

	/**
	 * método que retorna los archivos de un directorio
	 * 
	 * @param route
	 * @return lista de archivos encontrados
	 */
	public List<String> getFilesOfFolder(String route) {
		List<String> response = new ArrayList<String>();
		try {
			File folder = new File(route);
			File[] listOfFiles = folder.listFiles();

			for (File file : listOfFiles) {
				if (file.isFile()) {
					response.add(file.getName());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	/**
	 * método que obtiene el contenido de un archivo
	 */
	public String getFileContent(String route) {
		String response = "";
		try {
			File file = new File(route);
			StringBuilder fileContents = new StringBuilder((int) file.length());
			Scanner scanner = new Scanner(file);
			String lineSeparator = System.getProperty("line.separator");

			try {
				while (scanner.hasNextLine()) {
					fileContents.append(scanner.nextLine() + lineSeparator);
				}
				response = fileContents.toString();
			} finally {
				scanner.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}

	/**
	 * método que elimina una carpeta y su contenido
	 * 
	 * @param route
	 * @return
	 */
	public RespuestaGeneralDTO deleteFolder(String route) {
		RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
		respuestaGeneralDTO.setEstado(false);
		respuestaGeneralDTO.setMensaje("Ocurrió un error al procesar la solicitud.");
		try {
			File directory = new File(route);
			// make sure directory exists
			if (!directory.exists()) {
				respuestaGeneralDTO.setMensaje("La carpeta no existe.");
				System.exit(0);
			} else {
				try {
					respuestaGeneralDTO = delete(directory);
					if (respuestaGeneralDTO.getEstado()) {
						respuestaGeneralDTO.setMensaje("Eliminación correcta.");
					}

				} catch (IOException e) {
					respuestaGeneralDTO.setDetalle(e.getMessage());
					e.printStackTrace();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			respuestaGeneralDTO.setDetalle(e.getMessage());
			e.printStackTrace();
		}
		return respuestaGeneralDTO;
	}

	/**
	 * método que realiza el borrado de archivos y carpetas de forma recursiva
	 * 
	 * @param file
	 * @throws IOException
	 */
	private RespuestaGeneralDTO delete(File file) throws IOException {
		RespuestaGeneralDTO respuestaGeneralDTO = new RespuestaGeneralDTO();
		respuestaGeneralDTO.setEstado(false);
		respuestaGeneralDTO.setMensaje("Ocurrió un error al procesar la solicitud.");
		try {
			if (file.isDirectory()) {
				// directory is empty, then delete it
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : " + file.getAbsolutePath());
				} else {
					// list all the directory contents
					String files[] = file.list();
					for (String temp : files) {
						// construct the file structure
						File fileDelete = new File(file, temp);
						// recursive delete
						delete(fileDelete);
					}
					// check the directory again, if empty then delete it
					if (file.list().length == 0) {
						file.delete();
						System.out.println("Directory is deleted : " + file.getAbsolutePath());
					}
				}
			} else {
				// if file, then delete it
				file.delete();
				System.out.println("File is deleted : " + file.getAbsolutePath());
			}
			respuestaGeneralDTO.setEstado(true);
			respuestaGeneralDTO.setMensaje("Proceso realizado correctamente.");
		} catch (Exception e) {
			respuestaGeneralDTO.setEstado(false);
			respuestaGeneralDTO.setDetalle(e.getMessage());
		}

		return respuestaGeneralDTO;
	}

	/**
	 * método que retorna un string en formato utf8
	 * 
	 * @param input
	 * @return
	 */
	public String stringToUTF8(String input) {

		// ByteBuffer byteBuffer = Charset.forName("UTF-16").encode(input);
		// String s = StandardCharsets.UTF_8.decode(byteBuffer).toString();

		byte[] ptext = input.getBytes(ISO_8859_1);
		String value = new String(ptext, UTF_8);

		return value;
	}
}
