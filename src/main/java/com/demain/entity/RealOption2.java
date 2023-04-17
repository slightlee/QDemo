package com.demain.entity;

import com.demain.base.BaseOption;
import com.demain.base.extensions.t1.OptionExtensions;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * 题支类
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RealOption2 extends BaseOption {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 分数(是否需要？)
     */
    private Integer score;
}
