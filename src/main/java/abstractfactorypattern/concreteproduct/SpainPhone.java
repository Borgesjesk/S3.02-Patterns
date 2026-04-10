package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Phone;

public class SpainPhone implements Phone {

    private final String number;

    public SpainPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        if (number.length() != 9) {
            throw new IllegalArgumentException("Spanish phone must be 9 digits");
        }
        return "Phone: +34 " + number.substring(0, 3) + " " +
                number.substring(3, 5) + " " +
                number.substring(5, 7) + " " +
                number.substring(7, 9);
    }
}
