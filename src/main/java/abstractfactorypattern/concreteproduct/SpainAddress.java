package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Address;

public class SpainAddress implements Address {

    String street;
    String city;
    String zip;

    public SpainAddress(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String getAddress() {
        return ("Address: " + street + ", " + zip + " " + city);
    }

}


