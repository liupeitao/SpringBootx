package com.liu.factory;

import com.liu.service.Service;
import com.liu.serviceImp;
import com.liu.serviceImp1;

public class ServiceFactory {
    public static Service getserviceImp(){
        return new serviceImp();
    }
    public static Service getserviceImp1(){
        return new serviceImp1();
    }
}
