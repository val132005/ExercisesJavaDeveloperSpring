package com.val132005.spring.properties;

import java.util.Properties;

public class Country {

    private Properties countryAndLangs;

    public Properties getCountryAndLangs() {
        return countryAndLangs;
    }

    public void setCountryAndLangs(Properties countryAndLangs) {
        this.countryAndLangs = countryAndLangs;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryAndLangs=" + countryAndLangs +
                '}';
    }
}
