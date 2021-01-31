package org.example.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.ResponseJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class ResponseAdvice implements ResponseBodyAdvice {
    @Autowired
    private ObjectMapper objectMapper;
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    /**
     * 执行完Controller的请求映射方法，如果是有响应体内容，可以写入
     * http协议响应体
     * @param body 请求映射方法返回值
     * @param response SpringMVC封装的响应类
     * @return 返回的响应体内容：一般的做法，请求映射方法返回Object，可以改为其他对象
     * 返回String，使用json序列化
     */
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        ResponseJSON rj = new ResponseJSON();
        rj.setSuccess(true);
        rj.setData(body);
        if(body instanceof String){
            try {
                return objectMapper.writeValueAsString(rj);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("JSON序列化失败"+rj);
            }
        }
        return rj;
    }
}
