package io.github.lmikoto.pattern.chain;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author liuyang
 * 2020-04-26 16:05
 */
public abstract class AbstractLogger {

    public static int DEBUG = 1;
    public static int INFO = 2;
    public static int ERROR = 3;

    @Setter
    protected AbstractLogger next;

    public void loggerMessage(int level,String msg){
        if(level() >= level){
            write(msg);
        }
        if(next != null){
            next.loggerMessage(level,msg);
        }
    }

    /**
     * log level
     * @return
     */
    abstract protected int level();

    /**
     * write log
     * @param msg
     */
    abstract protected void write(String msg);
}
