package com.demain.vo;

import lombok.Data;

import java.util.List;

/**
 * 题支信息
 *
 * @author demain_lee
 * @since 2022/7/29 14:34
 */
@Data
public class Option<E> {

	/**
	 * 题支类别  1 选项  2 图片 选项  3 视频 选项
	 */
	private Integer type;

	/**
	 * 题支列表
	 */
	private List<E> data;
}
