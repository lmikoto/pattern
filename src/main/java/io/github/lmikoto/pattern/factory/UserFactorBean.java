package io.github.lmikoto.pattern.factory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import sun.net.www.http.HttpClient;

/**
 * @author liuyang
 * 2020-04-28 19:42
 */
@Component
public class UserFactorBean implements FactoryBean<User>, DisposableBean {

    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void destroy() throws Exception {

    }
}
