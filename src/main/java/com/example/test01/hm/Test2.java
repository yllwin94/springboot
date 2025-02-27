package com.example.test01.hm;

import org.hibernate.criterion.Distinct;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {

    public static class Demo {
        private String classId;
        private String allowClassId;

        public Demo(String classId, String allowClassId) {
            this.classId = classId;
            this.allowClassId = allowClassId;
        }

        public String getClassId() {
            return classId;
        }

        public void setClassId(String classId) {
            this.classId = classId;
        }

        public String getAllowClassId() {
            return allowClassId;
        }

        public void setAllowClassId(String allowClassId) {
            this.allowClassId = allowClassId;
        }

        @Override
        public String toString() {
            return "Demo{" +
                    "classId='" + classId + '\'' +
                    ", allowClassId='" + allowClassId + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        Demo a = new Demo("1", "a");
        Demo b = new Demo("2", "b");
        Demo c = new Demo("1", null);
        Demo d = new Demo(null, "b");
        List<Demo> list = Arrays.asList(a, b, c, d);





//        Set<String> collect = list.stream().filter(demo -> StringUtils.isNotBlank(demo.getClassId())).map(demo -> demo.getClassId()).collect(Collectors.toSet());
//        collect.addAll(list.stream().filter(demo -> StringUtils.isNotBlank(demo.getAllowClassId())).map(demo -> demo.getAllowClassId()).collect(Collectors.toSet()));
////        Set<String> collect1 = list.stream().filter(demo -> StringUtils.isNotBlank(demo.getAllowClassId())).map(demo -> demo.getAllowClassId()).collect(Collectors.toSet());
//        collect.forEach(System.out::println);
//
//        System.out.println("============================================");
//        Map<String, List<Demo>> collect1 = list.stream()
//                .filter(demo -> StringUtils.isNotBlank(demo.getClassId()))
//                .collect(Collectors.groupingBy(Demo::getClassId));
//        System.out.println(collect1.toString());
//
//        System.out.println("============================================");
//        List<String> collect2 = list.stream().filter(demo -> StringUtils.isNotBlank(demo.getClassId())).map(demo -> demo.getClassId()).distinct().collect(Collectors.toList());
//        collect2.forEach(System.out::println);


    }
}
