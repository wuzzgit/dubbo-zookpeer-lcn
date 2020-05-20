package com.dubbo.lcn.serviceA.produce.serivce.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.dubbo.lcn.common.domain.MemberRpc;
import com.dubbo.lcn.common.service.CousemeSerive;
import com.dubbo.lcn.serviceA.produce.mapper.ServerMapper;
import com.dubbo.lcn.serviceA.produce.serivce.ServerAService;
import com.dubbo.lcn.serviceA.produce.vo.UserVo;
import com.dubbo.lcn.serviceB.couseme.service.ServerBService;
import com.dubbo.lcn.serviceB.couseme.vo.Member;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wuzongzhao
 * @date 2020/5/18 10:49
 */
@Service
public class ServerAServiceImpl implements ServerAService {

    @Autowired
    private ServerMapper serverMapper;

    @Reference
    private CousemeSerive cousemeSerive;

    @Override
    @Transactional
    public int insertUser(UserVo userVo) {
        userVo.setPhone("123456789");
        userVo.setUserName("测试lcn");
        int result=serverMapper.insertUser(userVo);
        MemberRpc member=new MemberRpc();
        member.setIsVip("1");
        member.setUserId(userVo.getId());
        cousemeSerive.cousemeRpc(member);

        return result;
    }


}
