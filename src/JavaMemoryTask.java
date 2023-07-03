import java.util.Arrays;

public class JavaMemoryTask {
    public static void main(String[] args) {
        int value5 = 33;
        Integer value6 = 33;
        System.out.println(value5);
        changeValue(value5);
        System.out.println(value5);
        changeValueObj(value6);
        System.out.println(value6);
        Integer []value7 = {3,4};
        System.out.println(Arrays.toString(value7));
        changeValueArr(value7);
        System.out.println(Arrays.toString(value7));
        changeValueArrElement(value7);
        System.out.println(Arrays.toString(value7));
        Person person = new Person("Trubetskoy","Lyapis");
        System.out.println(person);
        changePerson(person);
        System.out.println(person);
        changePerson1(person);
        System.out.println(person);
    }

    public static void changeValue(int value) {
        value = 22;
        System.out.println(value);
    }
    public static void changeValueObj(Integer value) {
        value = 22;
        System.out.println(value);
    }
    public static void changeValueArr(Integer[] value) {
        value = new Integer[] {1,2};
        System.out.println(Arrays.toString(value));
    }
    public static void changeValueArrElement(Integer[] value) {
        value[0] = 99;
        System.out.println(Arrays.toString(value));
    }

    public static void changePerson(Person person){
        person=new Person("Lagutenko","Ilya" );
    }
    public static void changePerson1(Person person){
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}
