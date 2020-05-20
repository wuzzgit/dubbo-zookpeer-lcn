package com.dubbo.lcn.serviceA.produce.controller;

import com.dubbo.lcn.serviceA.produce.serivce.ServerAService;
import com.dubbo.lcn.serviceA.produce.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务A
 * @author wuzongzhao
 * @date 2020/5/18 10:45
 */
@Controller
@RequestMapping("/serverA")
public class ServerAController {

    @Autowired
    private ServerAService serverAService;

    @RequestMapping("/insertUser")
    @PostMapping
    @ResponseBody
    private int insertUser(UserVo userVo){
        return serverAService.insertUser(userVo);
    }
}
