package io.github.lmikoto.pattern

import io.github.lmikoto.pattern.chain.LoggerService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @author liuyang
 * 2020-04-26 20:06
 */
@SpringBootTest
class Chain {

    @Autowired
    lateinit var logger: LoggerService

    @Test
    fun log(){
        logger.print("log")
    }
}