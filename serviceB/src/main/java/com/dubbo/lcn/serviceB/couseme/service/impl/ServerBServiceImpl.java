package com.dubbo.lcn.serviceB.couseme.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.dubbo.lcn.common.domain.MemberRpc;
import com.dubbo.lcn.common.service.CousemeSerive;
import com.dubbo.lcn.serviceB.couseme.mapper.ServerBMapper;
import com.dubbo.lcn.serviceB.couseme.service.ServerBService;
import com.dubbo.lcn.serviceB.couseme.vo.Member;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wuzongzhao
 * @date 2020/5/18 15:47
 */
@Service
public class ServerBServiceImpl implements CousemeSerive, ServerBService {

    @Autowired(required=true)
    private ServerBMapper serverBMapper;


    @Override
    @Transactional
    public int insertMember(Member member) {
        int result=serverBMapper.insertMember(member);
        return result;
    }

    @Override
    @Transactional
    public int cousemeRpc(MemberRpc member) {
        int result=serverBMapper.insertMemberRpc(member);
        return result;
    }
}
