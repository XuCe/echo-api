package com.qingm.echo.Controllers;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "helloworld",description="你好世界")
@RestController
public class HelloController {
    @ApiOperation(value = "获取helloWorld", notes = "简单SpringMVC请求")
    @RequestMapping("/hello")
    public String index() throws Exception {
        throw new Exception("发生错误");
        //return "Hello World";
    }
}