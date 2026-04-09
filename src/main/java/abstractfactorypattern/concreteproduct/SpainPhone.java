package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Phone;

public class SpainPhone implements Phone {

    String number;

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return ("Phone: +34 " + number);
    }
}
