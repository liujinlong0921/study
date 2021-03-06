package com.milla.report.constant;

import java.io.File;

/**
 * @Package: com.aimsphm.nuclear.report.constant
 * @Description: <常量类>
 * @Author: MILLA
 * @CreateDate: 2020/4/27 18:09
 * @UpdateUser: MILLA
 * @UpdateDate: 2020/4/27 18:09
 * @UpdateRemark: <>
 * @Version: 1.0
 */
public class ReportConstant {
    /**
     * Window系统前缀
     */
    public static final String OS_NAME_PRE_WINDOWS = "Windows";
    /**
     * Mac系统前缀
     */
    public static final String OS_NAME_PRE_MAC = "Mac OS";

    /**
     * Linux系统前缀
     */
    public static final String OS_NAME_PRE_LINUX = "Linux";
    /**
     * 变量中系统的key
     */
    public static final String SYSTEM_CONSTANT_OS_NAME = "os.name";
    /**
     * 驱动运行临时目录
     */
    public static final String SYSTEM_CONSTANT_OS_TEMP_DIR = File.separator + "usr" + File.separator + "share" + File.separator + "local" + File.separator;
    /**
     * echarts临时目录
     */
    public static final String ECHARTS_TEMP_DIR = SYSTEM_CONSTANT_OS_TEMP_DIR + "echarts" + File.separator;
    /**
     * 生成文件存储目录
     */
    public static final String DOC_TEMP_DIR_PRE = SYSTEM_CONSTANT_OS_TEMP_DIR + "doc" + File.separator;
    /**
     * word生成文件后缀
     */
    public static final String DOC_SUFFIX = ".docx";
    /**
     * echarts生成文件后缀
     */
    public static final String ECHARTS_HTML_SUFFIX = ".html";
    /**
     * echarts JS 名称
     */
    public static final String ECHARTS_JS_NAME = "echarts-all-3.js";
    /**
     * word template 名称
     */
    public static final String TEMPLATE_DOC_NAME = "template.docx";
    /**
     * 驱动在项目中的根路径
     */
    public static final String PROJECT_DRIVER_ROOT_DIR = File.separator + "driver" + File.separator;
    /**
     * templates
     */
    public static final String PROJECT_TEMPLATES_ROOT_DIR = File.separator + "templates" + File.separator;
    /**
     * static
     */
    public static final String PROJECT_STATIC_ROOT_DIR = File.separator + "static" + File.separator;
    /**
     * linux将文件变成可执行文件命令前缀
     */
    public static final String LINUX_EXECUTABLE_CMD_PRE = "chmod +x ";

    /**
     * 空字符串
     */
    public static final String BLANK = "";
    /**
     * 本地浏览器打开文件前缀
     */
    public static final String BROWSER_LOCAL_OPEN_PRE = "file:///";

    /**
     * echarts 图片tag名称
     */
    public static final String ECHARTS_CANVAS = "canvas";
    /**
     * 连接符
     */
    public static final String CONNECTOR = "-";
    /**
     * 离散点的大小
     */
    public static final String SCATTER_SIZE = "10";
}
