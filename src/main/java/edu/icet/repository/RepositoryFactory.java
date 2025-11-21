package edu.icet.repository;

import edu.icet.repository.custom.Impl.CustomerRepositoryImpl;
import edu.icet.util.RepositoryEnum;

public class RepositoryFactory {
    private RepositoryFactory(){}
    private static RepositoryFactory instance;

    public static RepositoryFactory getInstance(){
        return instance==null? new RepositoryFactory():instance;
    }

    public <T extends SuperRepository>T getFactory(RepositoryEnum type){
        switch (type){
            case CUSTOMER : return (T) new CustomerRepositoryImpl();
            case VEHICLE:
        }
        return null;
    }
}
