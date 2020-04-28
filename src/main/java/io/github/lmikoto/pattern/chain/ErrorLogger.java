package io.github.lmikoto.pattern.chain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author liuyang
 * 2020-04-26 16:17
 */
@Order(3)
@Component
public class ErrorLogger extends AbstractLogger {
    @Override
    protected int level() {
        return AbstractLogger.ERROR;
    }

    @Override
    protected void write(String msg) {
        System.out.println("ErrorLogger: " + msg);
    }
}
