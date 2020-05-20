package com.dubbo.lcn.serviceA.produce.serivce;

import com.dubbo.lcn.serviceA.produce.vo.UserVo;

/**
 * @author wuzongzhao
 * @date 2020/5/18 10:49
 */
public interface ServerAService {

    int insertUser(UserVo userVo);
}
