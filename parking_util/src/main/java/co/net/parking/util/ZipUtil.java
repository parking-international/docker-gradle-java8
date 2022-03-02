/**
 * 
 */
package co.net.parking.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jheyson.bedoya@parking.net.co>
 */
public class ZipUtil {
    
    
    /**
     * Funciones: compresión varios archivos en un archivo zip
     * @param srcfile: Archivo de código fuente de la lista
     * @param zipfile: Archivo
     */
    public static void zipFiles(File[] srcfile, File zipfile) {
        byte[] buf = new byte[2048];
        try {
            // ZipOutputStream: completar el archivo o carpeta comprimir
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));
            for (int i = 0; i <srcfile.length; i++) {
                FileInputStream in = new FileInputStream(srcfile[i]);
                out.putNextEntry(new ZipEntry(srcfile[i].getName()));
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                out.closeEntry();
                in.close();
            }
            out.close();
            System.out.println("Comprimido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Funciones: descomprimir
     * @param zipfile: La necesidad de descomprimir el archivo
     * @param descDir: El Directorio de destino tras la extracción de la
     * @throws IOException
     */
    @SuppressWarnings("rawtypes")
    public static void unZipFiles(File zipfile, String descDir) {
        File file = new File(descDir);
        if (!file.exists()) {
            try {
                file.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            ZipFile zf = new ZipFile(zipfile);
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                String zipEntryName = entry.getName();
                InputStream in = zf.getInputStream(entry);
                OutputStream out = new FileOutputStream(descDir + zipEntryName);
                byte[] buf1 = new byte[1024];
                int len;
                while ((len = in.read(buf1)) > 0) {
                    out.write(buf1, 0, len);
                }
                in.close();
                out.close();
                System.out.println("Descompresión completa.");
            }

            zf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
