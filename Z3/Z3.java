package Z3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class Z3 {
    public static void main(String[] args) {
        final String PATH = "C:\\Users\\Michał\\Moje pliki\\Nauka\\Przedmioty\\PO\\Egzaminy\\162395-E02";
        System.out.println("Katalogi przefiltrowane wyrażeniem lambda");
        wypiszPlik(podkatalogi1(PATH));
        System.out.println("Katalogi przefiltrowane z użyciem klasy anonimowej");
        wypiszPlik(podkatalogi1(PATH));

    }

    public static List<File> podkatalogi1(String filename) {
        File f = new File(filename);

        return List.of(f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory() == true;
            }
        }));

    }

    public static List<File> podkatalogi2(String filename) {
        File f = new File(filename);

        return List.of(f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory() == true;
            }
        }));

    }

    public static void wypiszPlik(List<File> files) {
        for (File f : files) {
            System.out.println(f);

        }

    }

}
