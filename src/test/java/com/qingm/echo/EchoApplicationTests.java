package com.qingm.echo;

import com.qingm.echo.Models.User;
import com.qingm.echo.Utils.HttpUtil;
import com.qingm.echo.Utils.JsonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.qingm.echo.dao.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EchoApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
	public void contextLoads() throws Exception{
//        String jsonStr =  HttpUtil.get("http://www.app-echo.com/api/sound/info?id=784547");
//        Map jsonMap =  JsonUtil.toMap(jsonStr);
//        System.out.println(jsonMap);
//        System.out.println(jsonMap.get("info"));

        // 创建10条记录
        System.out.println(userRepository);

        userRepository.save(new User("AAA", 10));
        userRepository.save(new User("BBB", 20));
        userRepository.save(new User("CCC", 30));
        userRepository.save(new User("DDD", 40));
        userRepository.save(new User("EEE", 50));
        userRepository.save(new User("FFF", 60));
        userRepository.save(new User("GGG", 70));
        userRepository.save(new User("HHH", 80));
        userRepository.save(new User("III", 90));
        userRepository.save(new User("JJJ", 100));


    }

}
