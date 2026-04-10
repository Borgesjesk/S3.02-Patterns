package abstractfactorypattern.concretefactory;

import abstractfactorypattern.abstractfactory.ContactFactory;
import abstractfactorypattern.abstractproduct.Address;
import abstractfactorypattern.abstractproduct.Phone;
import abstractfactorypattern.concreteproduct.USAAddress;
import abstractfactorypattern.concreteproduct.USAPhone;

public class USAContactFactory implements ContactFactory {

    private final String street;
    private final String city;
    private final String stateZip;
    private final String number;

    public USAContactFactory(String street, String city, String stateZip, String number) {
        this.street = street;
        this.city = city;
        this.stateZip = stateZip;
        this.number = number;
    }

    @Override
    public Phone createPhone() {
        return new USAPhone(number);
    }

    @Override
    public Address createAddress() {
        return new USAAddress(street, city, stateZip);
    }
}
