package com.srs.code.entiy;

import lombok.Data;

/**
 * @author shaorensheng
 * @date 2019/12/20
 */
@Data
public class PayChannel {

    private Integer id;
    private String payCode;
    private String path;
    private String beanID;

}
