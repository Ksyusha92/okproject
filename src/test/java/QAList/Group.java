package QAList;

public class Group {
    String name = "Oksana";
    int number = 6;
    String style = "dance";

    public static void main (String args[]){
        Group firstPerson = new Group();
        firstPerson.name = "Lena";
        firstPerson.number = 1;
        firstPerson.style = "samba";


        Group secondPerson = new Group();
        secondPerson.style = "chacha";
        secondPerson.number = 2;
        secondPerson.name = "Olya";

        System.out.println(firstPerson.number + "" + firstPerson.name + secondPerson.number + "" + secondPerson.style);
    }
    }

