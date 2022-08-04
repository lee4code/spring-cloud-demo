package omed.springcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
    
    // 配置了一个 id 为 my_route 的路由规则，当访问地址 http://localhost:9000/hello时会自动转发到地址：http://localhost:8001/hello
    // @Bean
    // public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("my_route", r -> r.path("/hello")
    //                     .uri("http://localhost:8001/hello"))
    //             .build();
    // }
}
