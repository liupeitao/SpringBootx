package com.liu;

import com.liu.dao.bookDao;
import com.liu.service.Service;

public class serviceImp1 implements Service {
    private bookDao bd;

    @Override
    public void save() {
        bd.save();
        System.out.println("serviceImp2 save ....... . . . .. .");
    }

    public void setBd(daoImp bd) {
        this.bd = bd;
    }
}
