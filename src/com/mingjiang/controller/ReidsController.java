package com.mingjiang.controller;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class ReidsController {
	public static void main(String[] args) {
		// 连接本地redis服务
		Jedis jedis = new Jedis();
		System.out.println("Connection to server sucessfully");
		// 查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
		String name=jedis.get("myKey");
		System.out.println(name);
		 System.out.println(RedisClient.getRedisClient().getShardedJedis());
         System.out.println(RedisClient.getRedisClient().getJedis());

	}
}
