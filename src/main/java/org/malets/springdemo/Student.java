package org.malets.springdemo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Component
public class Student {


    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 5,max = 12, message = "is required")
    private String lastName;

    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    private LinkedHashMap<String, String> countryOptions;

    Student(){
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("Brazil", "Brazil");
        countryOptions.put("Germany", "Germany");
        countryOptions.put("France", "France");
        countryOptions.put("India", "India");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }
}
