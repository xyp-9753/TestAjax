package com.baizhi.servicesimpl;

import com.baizhi.dao.ProvinceDao;
import com.baizhi.entity.Province;
import com.baizhi.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao provinceDao;

    @Override
    public List<Province> selectAll() {
        List<Province> list = provinceDao.selectAll();
        System.out.println(list);
        return null;
    }
}
