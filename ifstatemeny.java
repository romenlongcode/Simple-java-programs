public class ifstatemeny {
    public static void main(String[] args){
        float salary =35000.00f;
        if(salary<15000){
           salary=salary+1000;
    } else if (salary<25000) {
            salary=salary+2000;
        }
        else {
            salary=salary+3000;
        }
        System.out.println(salary);
        }
    }
