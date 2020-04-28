package io.github.lmikoto.pattern.chain;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

/**
 * @author liuyang
 * 2020-04-26 19:56
 */
@Service
@RequiredArgsConstructor
public class LoggerService {

    private final List<AbstractLogger> loggers;

    @Value("${log.level:1}")
    private Integer level;

    @PostConstruct
    public void init(){
        Collections.sort(loggers, AnnotationAwareOrderComparator.INSTANCE);
        for(int i = 0; i<loggers.size(); i++){
            if(i == loggers.size() -1){
                loggers.get(i).setNext(null);
            }else{
                loggers.get(i).setNext(loggers.get(i + 1));
            }
        }
    }

    public void print(String msg){
        loggers.get(0).loggerMessage(level,msg);
    }

}
