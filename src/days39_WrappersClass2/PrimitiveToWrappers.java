package days39_WrappersClass2;

public class PrimitiveToWrappers {

    public static void main(String[] args) {

        int num=5;
        double num2=5.35;
        boolean b=true;

        Integer obj1=Integer.valueOf(num);
        Double obj2=Double.valueOf(num2);
        Boolean obj3=Boolean.valueOf(b);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        if (obj1 instanceof Integer){
            System.out.println(obj1+" is converted to Wrapper Class");
        }else {
            System.out.println(obj1 + " is not converted to Wrapper Class");
        }

        if (obj2 instanceof Double ){
            System.out.println(obj2+" is converted to Wrapper Class");
        }else {
            System.out.println(obj2 + " is not converted to Wrapper Class");
        }

    }
}
