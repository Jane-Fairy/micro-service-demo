package jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @Author Noah  tianjin
 * @Date 2022/7/6 11:44
 * @Version Noah's Coding
 * @Work zsj ヾ(ﾟ∀ﾟゞ)
 */
public class jedis{
    public static void main(String[] args) {
        Jedis jedis = new Jedis("43.136.134.67", 6379);
        String ping = jedis.ping();

        Set<String> keys = jedis.keys("*");
        for(String key : keys){
            System.out.println(key);
        }

        System.out.println(ping);
    }
}