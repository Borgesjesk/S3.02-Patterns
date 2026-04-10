package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Address;

public class USAAddress implements Address {

    private final String street;
    private final String city;
    private final String stateZip;

    public USAAddress(String street, String city, String stateZip) {
        this.street = street;
        this.city = city;
        this.stateZip = stateZip;
    }

    @Override
    public String getAddress() {
        return ("Address: " + street + ", " + city + ", " + stateZip);
    }
}
