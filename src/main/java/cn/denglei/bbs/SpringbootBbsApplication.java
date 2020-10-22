package cn.denglei.bbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 80705
 */
@SpringBootApplication
@MapperScan("cn.denglei.bbs.dao")
public class SpringbootBbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBbsApplication.class, args);
    }

}

