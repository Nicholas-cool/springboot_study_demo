package com.wzq.springboot_study_demo.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {

    // 解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        // 获取请求中的语言参数
        String language = request.getParameter("l");
        Locale locale = Locale.getDefault();  // 如果没有，就使用默认的

        // 如果请求的链接，携带了 i18n 的参数
        if (!StringUtils.isEmpty(language)){
            // zh_CN
            String[] split = language.split("_");
            // 国家，地区
            locale = new Locale(split[0], split[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response,
                          Locale locale) {
    }
}
