public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Петров Петр", 2021, "Проспект Строителей", "89657846735", 1, "Повар"),
                new Student("Сидоров Антон", 2022, "Воронова", "89653424587", 4, "Техник"),
                new Student("Иванов Иван", 2021, "Ладожская", "897653457689", 2, "Менеджмент")
        };
        System.out.println("Студенты:");
        for ( Student student : students){
            System.out.println(student.getName());
        }
        System.out.println("Студенты, учащиеся на \"Повар:\" ");
        for ( Student student : students){
            if ( student.getFacultet() == "Повар") {
                System.out.println(student.getName());
            }
        }
        System.out.println("Студенты, поступившие после 2021 года");
        for (int i = 0; i < students.length; i++){
            if ( students[i].getYear() > 2021) {
                System.out.println(students[i].getName());
            }
        }
    }
}
class Student {
    private String Name;
    private int Year;
    private String Address;
    private String Number;
    private int Curs;
    private String Facultet;

    Student(String Name, int Year, String Address, String Number, int Curs, String Facultet){
        this.Name = Name;
        this.Year = Year;
        this.Address = Address;
        this.Number = Number;
        this.Curs = Curs;
        this.Facultet = Facultet;
    }

    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public int getYear(){
        return this.Year;
    }
    public void setYear(int Year){
        this.Year = Year;
    }

    public String getAddress(){
        return this.Address;
    }

    public String getNumber(){
        return this.Number;
    }
    public void setNumber(String number){
        this.Number = Number;
    }

    public void setCurs(int Curs){
        this.Curs = Curs;
    }

    public String getFacultet(){
        return this.Facultet;
    }



}