package io.github.lmikoto.pattern.chain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author liuyang
 * 2020-04-26 16:14
 */
@Order(1)
@Component
public class ConsoleLogger extends AbstractLogger {
    @Override
    protected int level() {
        return AbstractLogger.DEBUG;
    }

    @Override
    protected void write(String msg) {
        System.out.println("ConsoleLogger: " + msg);
    }
}
