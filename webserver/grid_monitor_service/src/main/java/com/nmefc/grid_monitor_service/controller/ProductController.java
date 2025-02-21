package com.nmefc.grid_monitor_service.controller;

import com.nmefc.grid_monitor_service.bean.resultBean.ProductInfo;
import com.nmefc.grid_monitor_service.bean.resultBean.WatchFileInfo;
import com.nmefc.grid_monitor_service.service.BaseFileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 *@Description: 产品控制器
 *@Param:
 *@Return:
 *@Author: QuYuan
 *@Date: 2022/8/17 20:34
 */
@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    BaseFileInfoService baseFileInfoService;
    /**
     *@Description: 获取所有产品列表
     *@Param: []
     *@Return: java.util.List<com.nmefc.grid_monitor_service.bean.resultBean.ProductInfo>
     *@Author: QuYuan
     *@Date: 2022/8/15 18:31
     */
    @GetMapping("/group/list")
    public List<ProductInfo> list(){
        return baseFileInfoService.getProductInfo();
    }
    /**
     *@Description:获取当前最新的文件监控详情，获取当前最新生成的count文件详情，倒序排列
     *@Param: []
     *@Return: java.util.List<com.nmefc.grid_monitor_service.bean.resultBean.ProductInfo>
     *@Author: QuYuan
     *@Date: 2022/8/30 13:00
     */
    @GetMapping("/watch/list")
    public List<WatchFileInfo> watchList(){
        return baseFileInfoService.getWatchList();
    }
}
