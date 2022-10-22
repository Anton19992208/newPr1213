package com.example.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRunner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//
        User user = new User(25L, "Ivan", 20);
        testMethods(user);
//        Class<? extends User> userClass1 = user.getClass();
//        Class<User> userClass2 = User.class;
//        testConstructor();
//        testFields(user);
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "petr");
        System.out.println(petr);

    }

    private static void testFields(User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object value = declaredField.get(user);
            System.out.println(value);
        }
    }
    private static void testMethods(User user) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method method = User.class.getMethod("getName");
        System.out.println(method.invoke(user));
    }
}
