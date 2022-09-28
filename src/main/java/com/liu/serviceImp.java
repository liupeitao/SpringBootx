package com.liu;

import com.liu.dao.bookDao;
import com.liu.service.Service;

public class serviceImp implements Service {



    private bookDao bd ;

    @Override
    public void save() {
        bd.save();
        System.out.println("service dao savr ........ . . .. .");
    }

    //
    public void setBd(bookDao bd) {
        this.bd = bd;
    }
}
