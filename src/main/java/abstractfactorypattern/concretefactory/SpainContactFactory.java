package abstractfactorypattern.concretefactory;

import abstractfactorypattern.abstractfactory.ContactFactory;
import abstractfactorypattern.abstractproduct.Address;
import abstractfactorypattern.abstractproduct.Phone;
import abstractfactorypattern.concreteproduct.SpainAddress;
import abstractfactorypattern.concreteproduct.SpainPhone;

public class SpainContactFactory implements ContactFactory {

    private final String street;
    private final String city;
    private final String zip;
    private final String number;


    public SpainContactFactory(String street, String city, String zip, String number) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.number = number;
    }

    @Override
    public Phone createPhone() {
        return new SpainPhone(number);
    }

    @Override
    public Address createAddress() {
        return new SpainAddress(street, city, zip);
    }

}

