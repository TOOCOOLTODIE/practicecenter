import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * gsd
 * @author luo
 * @date 2022/04/23 19:48
 **/
@SpringBootTest
public class RedisSpringbootApplicationTests {
    @Resource
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        redisTemplate.opsForValue().set("user:1:name","moluu");
        System.out.println(redisTemplate.opsForValue().get("user:1:name"));
    }
}
