package com.demain.base;


import lombok.Data;

/**
 * 题干基类
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
public class BaseQuestion {

    private static final long serialVersionUID = 1L;

    /**
     * 题干ID
     */
    private String qId;
    /**
     * 题干标题
     */
    private String qTitle;
    /**
     * 题序
     */
    private int sort;
    /**
     * 类型ID
     */
    private int qType;
}
