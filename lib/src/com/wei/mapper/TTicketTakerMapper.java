package com.wei.mapper;

import com.wei.pojo.TTicketTaker;
import com.wei.pojo.TTicketTakerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTicketTakerMapper {
    int countByExample(TTicketTakerExample example);

    int deleteByExample(TTicketTakerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTicketTaker record);

    int insertSelective(TTicketTaker record);

    List<TTicketTaker> selectByExample(TTicketTakerExample example);

    TTicketTaker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTicketTaker record, @Param("example") TTicketTakerExample example);

    int updateByExample(@Param("record") TTicketTaker record, @Param("example") TTicketTakerExample example);

    int updateByPrimaryKeySelective(TTicketTaker record);

    int updateByPrimaryKey(TTicketTaker record);
}