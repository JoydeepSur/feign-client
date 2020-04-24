package com.example.client.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="feign-server")
public interface NameProxy {
	
	   @RequestMapping("/rest/name/{name}")
	   public String getName(@PathVariable(value="name") String name);

}
