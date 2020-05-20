package com.dubbo.lcn.serviceA.produce.mapper;

import com.dubbo.lcn.serviceA.produce.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuzongzhao
 * @date 2020/5/18 10:46
 */
@Mapper
public interface ServerMapper {

    /**
     * 新增用户
     * @param userVo
     * @return
     */
    int insertUser(UserVo userVo);
}
