package com.gsy.readmanageweb.business.manage.impl;

import com.gsy.readmanageweb.business.dao.mapper.AoyunRequestLogPOMapper;
import com.gsy.readmanageweb.business.dao.po.AoyunRequestLogPOExample;
import com.gsy.readmanageweb.business.manage.testManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testManageImpl implements testManage {

    @Autowired
    private AoyunRequestLogPOMapper aoyunRequestLogPOMapper;

    @Override
    public int count() {
        AoyunRequestLogPOExample example = new AoyunRequestLogPOExample();
        example.createCriteria().andCreateUserEqualTo("GSY");
        Long count = aoyunRequestLogPOMapper.countByExample(example);
        return count.intValue();
    }
}
