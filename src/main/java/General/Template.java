package General;

import java.util.HashMap;
import java.util.Map;

public class Template {
    private Map<String,String> configMap = new HashMap<String,String>();

    public Map<String, String> getConfigMap() {
        return configMap;
    }

    public void setConfigMap(Map<String, String> configMap) {
        this.configMap = configMap;
    }
}
