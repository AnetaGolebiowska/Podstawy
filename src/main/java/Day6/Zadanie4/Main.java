package Day6.Zadanie4;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        ConfigurationLoader configurationLoader = new ConfigurationLoader();
        Path path = Paths.get("C:", "Programowanie", "productionConfig.txt");

        configurationLoader.load(path);
        System.out.println(configurationLoader.getConfig());
        System.out.println(configurationLoader.getConfigMap());
        System.out.println(configurationLoader.getConfigMap().get("password")); // pobranie wartości dla klucza password

        configurationLoader.load(Paths.get("Z:", "nonExistingFile.txt"));
        System.out.println(configurationLoader.getConfig());
        System.out.println(configurationLoader.getConfigMap());
        System.out.println(configurationLoader.getConfigMap().get("password"));
    }
}
