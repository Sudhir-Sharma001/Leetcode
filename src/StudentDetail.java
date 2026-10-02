public class StudentDetail {
    int id;
    int roll_no;
    String name="";
    static  String clg_name="PSIT";
    static  String high_Q="MCA";
    public StudentDetail(int id,int roll_no,String name){
        this.id=2514216;
        this.roll_no=25016;
        this.name="Sudhir";
    }
    public  void get_detail(){
        System.out.println("Student details");
        System.out.println("Id="+id);
        System.out.println("Name="+name);
        System.out.println("College name="+clg_name);
        System.out.println("Highest Qualification"+high_Q);
    }
    public static void main(String[] args) {
        StudentDetail obj=new StudentDetail(0,0,"");
        obj.get_detail();

    }
}
