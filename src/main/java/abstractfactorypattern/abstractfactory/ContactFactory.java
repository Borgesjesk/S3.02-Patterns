package abstractfactorypattern.abstractfactory;

import abstractfactorypattern.abstractproduct.Address;
import abstractfactorypattern.abstractproduct.Phone;

public interface ContactFactory {

    Phone createPhone();

    Address createAddress();
}
