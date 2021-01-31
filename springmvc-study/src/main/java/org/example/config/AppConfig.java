package org.example.config;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.config.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private ObjectMapper objectMapper;

    //配置controller中请求映射方法路径匹配规则
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //设置路径前缀的规则，以第二个参数的返回值作为请求映射方法是否添加前缀
        configurer.addPathPrefix("api", c->true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //前端：敏感资源在拦截器中处理为：没登陆跳转首页
        //后端：敏感资源在拦截器中处理为：返回json，401状态码
        registry.addInterceptor(new LoginInterceptor(objectMapper)).//*代表路径的下一级，**代表路径的所有子级
                addPathPatterns("/api/**")
                .excludePathPatterns("/api/user/**")//后端开放的资源
                .addPathPatterns("/views/article.html")
                .addPathPatterns("/views/main.html");
    }
}
