package com.example.test01.hm;

import org.springframework.beans.BeanUtils;

public class Test {

    public static class Dog{
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class Animal{
        private String name;
        private String age;
        private String sex;

        public Animal(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public Animal() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 2);
        Animal animal = new Animal();
        BeanUtils.copyProperties(dog, animal);
        System.out.println(animal.toString());

    }

//    public static void main(String[] args) {
//
//        Field[] claimCaseFields = ClaimCase.class.getDeclaredFields();
//        HashSet<String> claimCaseSet = Arrays.stream(claimCaseFields).map(Field::getName).collect(Collectors.toCollection(HashSet::new));
////        System.out.println("claimCaseSet=" + claimCaseSet.size());
////        claimCaseSet.forEach(System.out::println);
//
//        Field[] claimCaseMirrorFields = ClaimCaseMirror.class.getDeclaredFields();
//        HashSet<String> claimCaseMirrorSet = Arrays.stream(claimCaseMirrorFields).map(Field::getName).collect(Collectors.toCollection(HashSet::new));
//        System.out.println("claimCaseMirrorSet=" + claimCaseMirrorSet.size());
//        claimCaseMirrorSet.forEach(System.out::println);
//
//
//
//
//
//
//
//
//    }
}
