package ss09_dsa.exercise.arraylist1;

public class Test {
    static class Person{
        String name;
        int age;
        Person(String name, int age){
            this.name =name;
            this.age = age;

        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        MyArrayList<Person> myArrayList = new MyArrayList<>(4);
        myArrayList.ensureCapacity(4);
        myArrayList.add(new Person("A", 25));
        myArrayList.add(new Person("B", 15));
        myArrayList.add(new Person("C", 5));
        myArrayList.add(new Person("D", 36),2);
        myArrayList.remove(2);
        MyArrayList<Person> list2 = myArrayList.clone();
        for (int i=0;i< list2.size();i++){
            System.out.println(myArrayList.get(i).toString());
        }
    }
}
