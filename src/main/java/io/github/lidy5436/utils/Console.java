package io.github.lidy5436.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制台工具类
 *
 * @author 李东阳
 **/
public class Console {

    private static final Map<String, String> FONT_COLOR = new HashMap<>();

    static {
        FONT_COLOR.put("default", "\u001B[0m");
        FONT_COLOR.put("black", "\u001B[30m");
        FONT_COLOR.put("red", "\u001B[31m");
        FONT_COLOR.put("green", "\u001B[32m");
        FONT_COLOR.put("yellow", "\u001B[33m");
        FONT_COLOR.put("blue", "\u001B[34m");
        FONT_COLOR.put("purple", "\u001B[35m");
        FONT_COLOR.put("cyan", "\u001B[36m");
        FONT_COLOR.put("white", "\u001B[37m");
    }

    /**
     * 打印文本
     *
     * @param text 文本
     */
    public static void log(String text) {
        System.out.println(text);
    }

    /**
     * 打印红色文本
     *
     * @param text 文本
     */
    public static void logRed(String text) {
        System.out.println(FONT_COLOR.get("red") + text + FONT_COLOR.get("default"));
    }

    /**
     * 打印黄色文本
     *
     * @param text 文本
     */
    public static void logYellow(String text) {
        System.out.println(FONT_COLOR.get("yellow") + text + FONT_COLOR.get("default"));
    }

    /**
     * 打印绿色文本
     *
     * @param text 文本
     */
    public static void logGreen(String text) {
        System.out.println(FONT_COLOR.get("green") + text + FONT_COLOR.get("default"));
    }

}
