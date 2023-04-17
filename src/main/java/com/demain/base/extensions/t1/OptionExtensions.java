package com.demain.base.extensions.t1;

import com.demain.base.BaseOption;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Option基类扩展
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OptionExtensions extends BaseOption {


    /**
     * 媒体资源(图片、视频...)
     */
    private String[] media;

    /**
     * 媒体类型 1 图片 2 视频 3 音频
     */
    private Integer mediaType;
}
