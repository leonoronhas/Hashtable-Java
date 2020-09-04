package Hashtables;

public class MyHashtableArray {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jo", 122);
        Employee dougJhonson = new Employee("Doug", "Jonson", 288);
        Employee guiNascimento = new Employee("Gui", "Nascimento", 744);
        Employee leoSantos = new Employee("Leo", "Santos", 2553);

        HashtableArray ht = new HashtableArray();

        ht.put("Jane", janeJones);
        ht.put("Leo", leoSantos);
        ht.put("Doug", dougJhonson);
        ht.put("Gui", guiNascimento);

        ht.printHashtable();

        System.out.println("Retrieve key Leo: " + ht.get("Leo"));

    }
}
