package io.github.lidy5436.utils;

import java.time.format.DateTimeFormatter;

/**
 * 日期工具类
 *
 * @author 李东阳
 **/
public class DateUtils {

    public static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_DATE = "yyyy-MM-dd";
    public static final String PATTERN_TIME = "HH:mm:ss";

    public static final DateTimeFormatter DATETIME_FORMATTER =DateTimeFormatter.ofPattern(PATTERN_DATETIME);
    public static final DateTimeFormatter DATE_FORMATTER =DateTimeFormatter.ofPattern(PATTERN_DATE);
    public static final DateTimeFormatter TIME_FORMATTER =DateTimeFormatter.ofPattern(PATTERN_TIME);






}
