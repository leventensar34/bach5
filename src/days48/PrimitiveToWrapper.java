package days48;

public class PrimitiveToWrapper {

    public static void main(String[] args) {

        // create primitives
        int num = 5;
        double num2 = 5.35;
        boolean b = true;

        //Convert to Wrapper object
        Integer Obj1 = Integer.valueOf(num);
        Double Obj2 = Double.valueOf(num2);
        Boolean Obj3 = Boolean.valueOf(b);

        System.out.println(Obj1);
        System.out.println(Obj2);
        System.out.println(Obj3);

        // Checck of obj instans of particular class

        if (Obj1 instanceof Integer){
            System.out.println(Obj1+" is converted to Wrapper Class");
        }else{
            System.out.println(Obj1+" is not converted to Wrapper Class");

        }
/*
      // Checck of obj instans of particular class
      // obj2 int olmadigi icin java bize eror verir

        if (Obj2 instanceof Integer){
            System.out.println(Obj1+" is converted to Wrapper Class");
        }else{
            System.out.println(Obj1+" is not converted to Wrapper Class");

        } */



    }
}
