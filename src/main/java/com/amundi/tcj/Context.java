package com.amundi.tcj;


public interface Context {


    /**
     *
     * @return value of the context as Object
     */

    Object getAsObject(String key);


    /**
     *
     * @return value of the context as String
     */

    String getAsString(String key);


    /**
     * add an Object to the context
     */

    void put(String key, Object value);


    /**
     * clear the entire context
     */

    void clear();

}
