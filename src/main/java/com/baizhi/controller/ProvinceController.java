package com.baizhi.controller;

import com.baizhi.entity.Province;
import com.baizhi.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("selectAll")
    @ResponseBody
    public List<Province> selectAll(HttpServletResponse response) {
        List<Province> list = provinceService.selectAll();
        return list;
    }
}
