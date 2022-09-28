package com.liu.factory;

import com.liu.service.Service;
import com.liu.serviceImp;
import org.springframework.beans.factory.FactoryBean;

public class ServiceFactoryBean implements FactoryBean {
    @Override
    public Service getObject() throws Exception {
        return new serviceImp();
    }

    @Override
    public Class<?> getObjectType() {
        return Service.class.getClass();
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
