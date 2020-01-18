package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
@RestController
@RequestMapping(value = "/api/roundTable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;

    @GetMapping
    public Result getPopular() {return Result.success(roundTableService.selectPopular());  }

    @GetMapping(value = "/all")
    public  Result getAllRoundTable(){
        return Result.success(roundTableService.selectAllRoundTable());
    }
}