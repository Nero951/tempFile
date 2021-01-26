package org.example.util;

import org.example.model.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: Wade
 */
@Component
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUserName("Hgx");
        user.setPassWord("23456");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
