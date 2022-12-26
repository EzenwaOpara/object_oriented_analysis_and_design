package chapter1_5;

import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Object getProperty(String key) {
        return properties.get(key);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (String propertyName : otherSpec.getProperties().keySet()) {

            if (!properties.get(propertyName).equals(
                    otherSpec.getProperty(propertyName))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "InstrumentSpec{" +
                "properties=" + properties +
                '}';
    }
}
