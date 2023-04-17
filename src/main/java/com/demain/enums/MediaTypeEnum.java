package com.demain.enums;

/**
 * 定义媒体类型枚举
 *
 * @author demain_lee
 * @since 2023/4/17
 */
public enum MediaTypeEnum {

    // 定义 图片 1 视频 2 音频 3
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    AUDIO(3, "音频");

    /**
     * 媒体类型
     */
    private final int code;

    /**
     * 媒体类型名称
     */
    private final String name;

    MediaTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获取 媒体类型 code
     */
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
