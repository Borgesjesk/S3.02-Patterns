package abstractfactorypattern.concreteproduct;

import abstractfactorypattern.abstractproduct.Phone;

public class USAPhone implements Phone {

    private final String number;

    public USAPhone(String number) {
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        String formatted = number;
        if (formatted.length() == 9) {
            formatted = "0" + formatted; // pad to 10 digits
        }
        if (formatted.length() != 10) {
            throw new IllegalArgumentException("US phone must be 9 or 10 digits");
        }
        return "Phone: +1 (" + formatted.substring(0, 3) + ") " +
                formatted.substring(3, 6) + "-" +
                formatted.substring(6);
    }
}
