package com.demain.base;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 选项基类
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
public class BaseOption implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 选项ID
     */
    private String oId;
    /**
     * 选项标题
     */
    private String oTitle;
    /**
     * 选项类型
     */
    private int oType;
}
