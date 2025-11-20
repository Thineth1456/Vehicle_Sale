package edu.icet.service;

import edu.icet.service.custom.Impl.CustomerServiceImpl;
import edu.icet.util.ServiceEnum;

public class ServiceFactory {
    private ServiceFactory() {}
    private static ServiceFactory instance;

    public static ServiceFactory getInstance(){
        return instance==null?new ServiceFactory():instance;
    }

    public <T extends SuperService>T getFactory(ServiceEnum type){
        switch (type){
            case CUSTOMER : return (T) new CustomerServiceImpl();
            case VEHICLE:
        }
        return null;
    }
}
