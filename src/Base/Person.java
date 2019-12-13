package Base;

public class Person {
    public String nation;
    public  int age;
    public String edu;

    public Person(String nation, int age, String edu) throws PersonException {
        if(!nation.equals("Iranian"))
            throw new PersonException("ملیت غیر قابل قبول");
        if(!edu.equals("foghDiplom") )
            throw new PersonException("تحصیلات غیر قابل قبول");
        if(age<=23)
                throw new PersonException("سن غیر قابل قبول");
        this.nation = nation;
        this.age = age;
        this.edu = edu;
    }
}
