package io.github.lmikoto.pattern.chain;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author liuyang
 * 2020-04-26 18:10
 */
@Order(2)
@Component
public class FileLogger extends AbstractLogger {
    @Override
    protected int level() {
        return AbstractLogger.INFO;
    }

    @Override
    protected void write(String msg) {
        System.out.println("FileLogger: " + msg);
    }
}
