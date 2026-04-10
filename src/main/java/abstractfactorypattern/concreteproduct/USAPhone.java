package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Phone;

public class USAPhone implements Phone {

    private final String number;

    public USAPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return ("Phone: +1 " + number);
    }
}
