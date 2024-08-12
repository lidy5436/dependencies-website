package io.github.lidy5436.utils;

import java.util.Map;

/**
 * 字符串通用工具类
 *
 * @author 李东阳
 **/
public class StringUtils {


    /**
     * 清理文本中不可见的字符
     *
     * @param txt 待处理的文本
     * @return 处理后的文本结果
     */
    public static String cleanChars(String txt) {
        return txt.replaceAll("[ 　`·•�\\f\\t\\v\\s]", "");
    }


}
