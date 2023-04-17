package com.demain.enums;


/**
 * 选项类型
 *
 * @author demain_lee
 * @since 2023/4/17
 */
public enum OptionTypeEnum {

    // 定义 单选 1 多选 2 填空 3 判断 4
    SINGLE(1, "单选"),
    MULTIPLE(2, "多选"),
    FILL(3, "填空"),
    JUDGE(4, "判断");

    /**
     * 选项类型
     */
    private final int code;

    /**
     * 选项类型名称
     */
    private final String name;

    OptionTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获取 选项类型 code
     */
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}


