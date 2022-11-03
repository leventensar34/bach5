package Extra_Grup1_Calisma.Arrays;

public class ForDongu {

    public static void main(String[] args) {

       alem("Seriban","esma","hasan","mehmet","umut","samsun");

    }
    public static void alem(String...str){
        String newStr="";
        for (String cok : str) {
            newStr=newStr+cok.charAt(0);

        }
        System.out.println(newStr);

    }

}
