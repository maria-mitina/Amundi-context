package com.amundi.tcj;

import java.util.Map;


public class CucumberContext implements Context{

    private Map<String, Object> cucContext;


    public CucumberContext(Map<String, Object> context) {
        cucContext = context;
    }

    public Object getAsObject(String key) {
        return this.cucContext.get(key);
    }

    public String getAsString(String key) {
        return this.cucContext.get(key).toString();
    }

    public void put(String key, Object value) {
        cucContext.put(key, value);
    }

    public void clear() {
        cucContext.clear();
    }


}
