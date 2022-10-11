public class smethodsoutsideaclass {
    int id;
    String name;
}

//Creating another class TestStudent1 which contains the main method
class TestStudent{
    public static void main(String args[]){
        smethodsoutsideaclass s1=new smethodsoutsideaclass();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}