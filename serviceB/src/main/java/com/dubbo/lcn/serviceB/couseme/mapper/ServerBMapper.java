package com.dubbo.lcn.serviceB.couseme.mapper;

import com.dubbo.lcn.common.domain.MemberRpc;
import com.dubbo.lcn.serviceB.couseme.vo.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuzongzhao
 * @date 2020/5/18 15:46
 */
@Mapper
public interface ServerBMapper {

    /**
     * 新增会员信息
     * @param member
     * @return
     */
    int insertMember(Member member);

    int insertMemberRpc(MemberRpc member);
}
