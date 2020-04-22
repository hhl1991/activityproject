package com.fengkong.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName hhl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/4/21 16:21
 * @Version 1.0
 **/
@Data
public class Holiday implements Serializable {
    private static final long serialVersionUID = 373046364072498634L;

    private Integer id;
    /**
     * 申请人的名字
     */
    private String holidayName;
    /**
     * 开始时间
     */
    private Date beginDate;
    /**
     * 结束日期
     */
    private Date endDate;
    /**
     * 请假天数
     */
    private Float days;
    /**
     * 事由
     */
    private String reason;
    /**
     * 请假类型
     */
    private String type;
}
