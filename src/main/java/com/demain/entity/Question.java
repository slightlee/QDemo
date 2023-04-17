package com.demain.entity;

import com.demain.base.extensions.t1.QuestionExtensions;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 简单题目类，包含选项
 *
 * @author demain_lee
 * @since 2023/4/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Question<T> extends QuestionExtensions {

    private List<T> options;

}
