package redis.client;

import redis.clients.jedis.Jedis;

public class RedisCliDemo {

	public static void main(String[] args) {

		// ip+port
		Jedis jedis = new Jedis("192.168.174.143", 7000);
		System.out.println(jedis.get("hello"));
	}

}
