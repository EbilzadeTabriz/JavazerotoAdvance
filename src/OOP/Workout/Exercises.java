package OOP.Workout;

import java.util.Scanner;

public class Exercises{
    private int burpee_number,
    pushUp_number,
    sitUp_number,
    squat_number;

    public Exercises(int burpee_number, int pushUp_number, int sitUp_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushUp_number = pushUp_number;
        this.sitUp_number = sitUp_number;
        this.squat_number = squat_number;
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public int getPushUp_number() {
        return pushUp_number;
    }

    public void setPushUp_number(int pushUp_number) {
        this.pushUp_number = pushUp_number;
    }

    public int getSitUp_number() {
        return sitUp_number;
    }

    public void setSitUp_number(int siUp_number) {
        this.sitUp_number = siUp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }
    public  void doExercise(String kindOfExercises,int number){
        if (kindOfExercises.equals("Burpee")){

            doBurpee(number);
        } else if (kindOfExercises.equals("PushUp")) {
            doPushUp(number);

        } else if (kindOfExercises.equals("SitUp")) {
            doSitUp(number);


        } else if (kindOfExercises.equals("Squat")) {
            doSquat(number);

        }
        else {
            System.out.println("Invalid exercises");
        }

    }
    public void doBurpee(int number) {
        if (burpee_number == 0) {
            System.out.println("there is no burpee to do");
        }
        if (burpee_number - number < 0) {
            System.out.println("Congratulation you reach your target burpee number");
            burpee_number -= 0;
            System.out.println("Remain burpee number: " + burpee_number);
        } else {
            burpee_number -= number;
            System.out.println("Remain burpee number: " + burpee_number);


        }
    }

        public void doPushUp(int number) {
            if (pushUp_number == 0) {
                System.out.println("there is no pushUp to do");
            }
            if (pushUp_number - number < 0) {
                System.out.println("Congratulation you reach your target pushUp number");
                pushUp_number -= 0;
                System.out.println("Remain pushUp number: " + pushUp_number);
            } else {
                pushUp_number -= number;
                System.out.println("Remain pushUp number: " + pushUp_number);


            }
        }
            public void doSitUp(int number) {
                if (sitUp_number == 0) {
                    System.out.println("there is no sitUp to do");
                }
                if (sitUp_number - number < 0) {
                    System.out.println("Congratulation you reach your target sitUp number");
                    sitUp_number -= 0;
                    System.out.println("Remain sitUp number: " + sitUp_number);
                } else {
                    sitUp_number -= number;
                    System.out.println("Remain sitUp number: " + sitUp_number);


                }
            }
                public void doSquat(int number){
                    if (squat_number ==0){
                        System.out.println("there is no squat to do");
                    }
                    if (squat_number-number<0){
                        System.out.println("Congratulation you reach your target squat number");
                        squat_number-=0;
                        System.out.println("Remain squat number: "+squat_number);
                    }
                    else {
                        squat_number-=number;
                        System.out.println("Remain squat number: "+squat_number);


                    }
    }
    public boolean exercisesFinished() {
        return (burpee_number==0)&&(sitUp_number==0)&&(pushUp_number==0)&&(squat_number==0);

    }






    public static void main(String[] args) {
        Scanner scannerc = new Scanner(System.in);

        System.out.println("Welcome to Workout program");

        String exercises = "Valid exercises\n"
                +"Burpee\n"
                +"PushUp\n"
                +"SitUp\n"
                +"Squat\n";
        System.out.println(exercises);

        System.out.println("Create Workout :");

        System.out.print("Burpee number: ");
        int BurpeeNumber = scannerc.nextInt();

        System.out.print("PushUp number: ");
        int PushUpNumber = scannerc.nextInt();

        System.out.print("SitUp number: ");
        int SitUpNumber  = scannerc.nextInt();

        System.out.print("Squat number: ");
        int SquatNumber = scannerc.nextInt();
/// hemise diqqet et scanner.nextline olsun bele meselelerde yoxsa cox boyuk problem yaradir!!!!!!
        scannerc.nextLine();

        Exercises  exercises1 = new Exercises(BurpeeNumber,PushUpNumber,SquatNumber,SitUpNumber);

        System.out.println("Your workout is being started!");

        while(exercises1.exercisesFinished()==false){
            System.out.println("Kind of exercise(Burpee,PushUp,SitUp,Squat): ");

            String tour = scannerc.nextLine();
            System.out.println("How many tour do you wanna make ?");

            int number = scannerc.nextInt();
            scannerc.nextLine();
            exercises1.doExercise(tour,number);
        }

        System.out.println("You completed your workout");
    }
}
