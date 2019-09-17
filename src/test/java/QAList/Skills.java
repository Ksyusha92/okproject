package QAList;

public class Skills {
    int salary = 500;
    boolean istqb = true;
    int english = 6;
    int yearsOfExperience = 3;

    public int calculateSalary() {
        if (yearsOfExperience >= 2 && yearsOfExperience <= 3) ;
        salary += 500;
        System.out.println("middle:" + salary);

        if (yearsOfExperience >= 3 && yearsOfExperience <= 4) {
            salary += 700;
            System.out.println("senior:" + salary);
        }

        if (yearsOfExperience >5) {
            salary += 2000;
            System.out.println("lead:" + salary);
        }

        if (english >= 5) {
            salary += 200;
            System.out.println("Good knowledge of English:" + salary);
        }

        if (english <= 1) {
            salary -= 200;
            System.out.println("Bad knowledge of English:" + salary);
        }

        if (istqb = true){
            salary += 300;
            System.out.println("Has ISTQB Certificate:" + salary);
        }
        else {
            System.out.println("No ISTQB Certificate:" + salary);
        }

        return salary;
    }


    public static void main(String args[]) {
        Skills oksana = new Skills();
        oksana.yearsOfExperience = 4;
        oksana.english = 1;
        oksana.calculateSalary();
    }
}

/*realyzovat:
    cherez and / or
    cherez if/else

    yearsofexp bolshe 2 - dobavit 500 $, bolshe 4 dobavit 700, bolshe 5 dobavit 2000, english - plus 200,
    no english - -200, istqb + 300, no istqb = 0; */