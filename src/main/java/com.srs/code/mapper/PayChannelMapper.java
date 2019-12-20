package com.srs.code.mapper;

import com.srs.code.entiy.PayChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
public interface PayChannelMapper {

    @Select("SELECT id,payCode,path,beanID FROM payChannel WHERE payCode = #{payCode};")
    public PayChannel getPayByPayCode(String payCode);

}
