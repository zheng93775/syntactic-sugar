package com.github.zheng93775.sugar.paramized;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public void source() {
        List<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("test");
        System.out.println(list);
    }

    public void target() {
        List list = new ArrayList();
        list.add("ABC");
        list.add("test");
        System.out.println(list);
    }
}
