package com.demain.vo;

import lombok.Data;

/**
 * 题目信息
 *
 * @author demain_lee
 * @since 2022/7/29 14:34
 */
@Data
public class Question<T,E> {


	/**
	 * 题干信息
	 */
	private T topic;

    /**
	 * 题支信息
	 */
	private Option<E> options;
}
