package com.gsy.readmanageweb.business.dao.mapper;

import com.gsy.readmanageweb.business.dao.po.AoyunRequestLogPO;
import com.gsy.readmanageweb.business.dao.po.AoyunRequestLogPOExample;
import com.gsy.readmanageweb.business.dao.po.AoyunRequestLogPOWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AoyunRequestLogPOMapper {
    long countByExample(AoyunRequestLogPOExample example);

    int deleteByExample(AoyunRequestLogPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AoyunRequestLogPOWithBLOBs record);

    int insertSelective(AoyunRequestLogPOWithBLOBs record);

    List<AoyunRequestLogPOWithBLOBs> selectByExampleWithBLOBs(AoyunRequestLogPOExample example);

    List<AoyunRequestLogPO> selectByExample(AoyunRequestLogPOExample example);

    AoyunRequestLogPOWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AoyunRequestLogPOWithBLOBs record, @Param("example") AoyunRequestLogPOExample example);

    int updateByExampleWithBLOBs(@Param("record") AoyunRequestLogPOWithBLOBs record, @Param("example") AoyunRequestLogPOExample example);

    int updateByExample(@Param("record") AoyunRequestLogPO record, @Param("example") AoyunRequestLogPOExample example);

    int updateByPrimaryKeySelective(AoyunRequestLogPOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AoyunRequestLogPOWithBLOBs record);

    int updateByPrimaryKey(AoyunRequestLogPO record);
}
