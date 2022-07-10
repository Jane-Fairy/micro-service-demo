package cn.tj.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/9 17:31
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
@Configuration
public class ConfigBean {
/**
    Logger.Level 的具体级别如下：
    NONE：不记录任何信息。
    BASIC：仅记录请求方法、URL 以及响应状态码和执行时间。
    HEADERS：除了记录 BASIC 级别的信息外，还会记录请求和响应的头信息。
    FULL：记录所有请求与响应的明细，包括头信息、请求体、元数据等等。
 **/

    @Bean
    Logger.Level feginLoggerLevel() {
        return Logger.Level.FULL;
    }
    
}

