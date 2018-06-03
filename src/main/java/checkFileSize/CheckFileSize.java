package checkFileSize;

import java.io.File;

/**
 * Klasa sprawdzająca rozmiar folderu, do którego ścieżka została podana.
 */

public class CheckFileSize {
    long fileSize;

    /**
     * Metoda sprawdzająca rozmiar folderu. Potrzebuje przekazania obiektu typu File!!!
     * @param file
     * @return fileSize
     */
    public long checkFileSize (File file){
        return fileSize = file.getTotalSpace();
    }
}
