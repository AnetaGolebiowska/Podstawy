package Day6.Zadanie4;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationLoader {
    private static final Path DEFAULT_CONFIG_PATH =
            Paths.get("src", "main", "resources", "defaultConfig.txt");
    //        Path path = Paths.get("C:\\Users\\micha\\test2.txt");
//        Path path = Paths.get("C:/Users/micha/test2.txt");
//        Path path = Paths.get("C:", "Users", "micha", "test2.txt"); // różne sposoby zapisu ścieżki do pliku
private List <String> config;

    private Map <String, String > configMap = new HashMap <>();

    public void load (Path path) {
        try {
            config = Files.readAllLines(path, Charset.defaultCharset());
        } catch (IOException e) {
            try {
                config = Files.readAllLines(DEFAULT_CONFIG_PATH, Charset.defaultCharset());
                e.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        for (String line : config) {
            line = line.trim();
            if (StringUtils.isNotBlank(line)){
                String[] keyVallueArray = line.split("=");
                configMap.put(keyVallueArray[0], keyVallueArray[1]);

            }
        }
    }
    public List<String> getConfig() {
        return config;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
