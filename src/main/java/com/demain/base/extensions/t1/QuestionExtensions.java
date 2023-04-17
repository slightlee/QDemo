package com.demain.base.extensions.t1;


import com.demain.base.BaseQuestion;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * BaseQuestion基类拓展
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionExtensions extends BaseQuestion {

    /**
     * 媒体资源(图片、视频)
     */
    private String[] media;

    /**
     * 媒体类型 1 图片 2 视频 3 音频
     */
    private Integer mediaType;
}
