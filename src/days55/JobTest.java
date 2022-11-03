package days55;

import java.util.ArrayList;

public class JobTest {

    public static void main(String[] args) {

        Job job1 = new Job();

        Job job2=new Job("SDET");

        Job job3=new Job("DEV","EuroTech",10000);

        System.out.println(job1.toString());
        System.out.println(job2.toString());
        System.out.println(job3.toString());

        // Bir job listesi olusturun
        // icerisinde 3 adet object store edin

        ArrayList<Job> joblist=new ArrayList<>();
        joblist.add(new Job("SDET","chip",20000));
        joblist.add(new Job("Po","Heyman",30000));

        // En yuksek maasli job u print edelim

        double maxSalary=Double.MIN_VALUE;

        int heigestIndex=0;

        for (int i = 0; i <joblist.size() ; i++) {
            if (joblist.get(i).getSalary()>maxSalary){
                maxSalary=joblist.get(i).getSalary();
                heigestIndex=i;
            }
        }
        System.out.println(joblist.get(heigestIndex).toString());
    }
}
