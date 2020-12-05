package base.collection;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Objects;

/**
 * @author ts495
 * @date 2020/12/5
 */
public class HashCodeAndEquals {

    public static class ClassA {
        private String name;
        private int age;

        public ClassA(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ClassA classA = (ClassA) o;
            return age == classA.age && Objects.equals(name, classA.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "ClassA{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class ClassB {
        private String name;
        private int age;

        public ClassB(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "ClassB{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class ClassC {
        private String name;
        private int age;

        public ClassC(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ClassC classC = (ClassC) o;
            return age == classC.age && Objects.equals(name, classC.name);
        }

        @Override
        public String toString() {
            return "ClassC{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class ClassD {
        private String name;
        private int age;

        public ClassD(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "ClassD{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println(">>>>>> 重写equals和hashcode方法：");
        Map<ClassA, String> map = Maps.newHashMap();
        ClassA a1 = new ClassA("Jack", 25);
        ClassA a2 = new ClassA("Rose", 22);
        ClassA a3 = new ClassA("Jack", 25);
        map.put(a1, "1");
        map.put(a2, "2");
        map.put(a3, "3");
        for (Map.Entry<ClassA, String> entry : map.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println(">>>>>> 没有重写equals和hashcode方法：");
        Map<ClassB, String> mapB = Maps.newHashMap();
        ClassB b1 = new ClassB("Jack", 25);
        ClassB b2 = new ClassB("Rose", 22);
        ClassB b3 = new ClassB("Jack", 25);
        mapB.put(b1, "1");
        mapB.put(b2, "2");
        mapB.put(b3, "3");
        for (Map.Entry<ClassB, String> entry : mapB.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println(">>>>>> 只重写equals方法：");
        Map<ClassC, String> mapC = Maps.newHashMap();
        ClassC c1 = new ClassC("Jack", 25);
        ClassC c2 = new ClassC("Rose", 22);
        ClassC c3 = new ClassC("Jack", 25);
        mapC.put(c1, "1");
        mapC.put(c2, "2");
        mapC.put(c3, "3");
        for (Map.Entry<ClassC, String> entry : mapC.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println(">>>>>> 只重写hashcode方法：");
        Map<ClassD, String> mapD = Maps.newHashMap();
        ClassD d1 = new ClassD("Jack", 25);
        ClassD d2 = new ClassD("Rose", 22);
        ClassD d3 = new ClassD("Jack", 25);
        mapD.put(d1, "1");
        mapD.put(d2, "2");
        mapD.put(d3, "3");
        for (Map.Entry<ClassD, String> entry : mapD.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), entry.getValue());
        }
    }
}
