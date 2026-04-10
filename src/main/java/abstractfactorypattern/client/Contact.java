package abstractfactorypattern.client;

import abstractfactorypattern.abstractfactory.ContactFactory;
import abstractfactorypattern.abstractproduct.Address;
import abstractfactorypattern.abstractproduct.Phone;

public class Contact {

    private final Address address;
    private final Phone phone;

    public Contact(ContactFactory factory) {

        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return address.getAddress() + " | " + phone.getPhoneNumber();
    }
}

