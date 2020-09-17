package homework;
import java.util.Scanner;
        
public class StudentScore {
    String sdutentName;
    float englishScore;
    float computerScore;
    float sportScore;
    float averageScore;
    boolean englishPassed;
    boolean computerPassed;
    boolean sportPassed;
    boolean allPassed;
    
    static float englishAverageScore;
    static float computerAverageScore;
    static float sportAverageScore;
    static float englishMaxScore;
    static float englishMinScore;
    static float computerMaxScore;
    static float computerMinScore;
    static float sportMaxScore;
    static float sportMinScore;
    
    final static int STUDENTNUMBER = 5;
    final static int COURSENUMBER = 3;
    final static float PASSEDSCORE = 60.0f;
    
    public void information() {
        averageScore = (englishScore + computerScore + sportScore) / COURSENUMBER;
        System.out.print("name:" + sdutentName);
        System.out.print(" english:" + englishScore);
        System.out.print(" computer:" + englishScore);
        System.out.print(" sport:" + englishScore);
        System.out.println(" average:" + averageScore);
        
        if (englishScore < PASSEDSCORE) {
            englishPassed = false;
        }
        else {
            englishPassed = true;
        }
        if (computerScore < PASSEDSCORE) {
            computerPassed = false;
        }
        else {
            computerPassed = true;
        }
        if (sportScore < PASSEDSCORE) {
            sportPassed = false;
        }
        else {
            sportPassed = true;
        }
        if (englishPassed && computerPassed && sportPassed) {
            allPassed = true;
        }
        else {
            allPassed = false;
        }
    }

    public static void calculateAverageScore(final StudentScore[] ss) {
        if (STUDENTNUMBER != ss.length) {
            System.out.println("something wrong!!");
            return;
        }
        float englishTotalScore = 0.0f;
        float computerTotalScore = 0.0f;
        float sportTotalScore = 0.0f;
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            englishTotalScore += ss[i].englishScore;
            computerTotalScore += ss[i].computerScore;
            sportTotalScore += ss[i].sportScore;
        }
        englishAverageScore = englishTotalScore / STUDENTNUMBER;
        computerAverageScore = computerTotalScore / STUDENTNUMBER;
        sportAverageScore = sportTotalScore / STUDENTNUMBER;
        System.out.println("english average:" + englishAverageScore);
        System.out.println("computer average:" + computerAverageScore);
        System.out.println("sport average:" + sportAverageScore);
    }
    
    public static void calculateMaxMinScore(final StudentScore[] ss) {
        if (ss.length != STUDENTNUMBER) {
            System.out.println("something wrong!!");
            return;
        }
        englishMaxScore = ss[0].englishScore;
        englishMinScore = ss[0].englishScore;
        computerMaxScore = ss[0].computerScore;
        computerMinScore = ss[0].computerScore;
        sportMaxScore = ss[0].sportScore;
        sportMinScore = ss[0].sportScore;
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (englishMaxScore < ss[i].englishScore) {
                englishMaxScore = ss[i].englishScore;
            }
            if (englishMinScore > ss[i].englishScore) {
                englishMinScore = ss[i].englishScore;
            }
            if (computerMaxScore < ss[i].computerScore) {
                computerMaxScore = ss[i].computerScore;
            }
            if (computerMinScore > ss[i].computerScore) {
                computerMinScore = ss[i].computerScore;
            }
            if (sportMaxScore < ss[i].sportScore) {
                sportMaxScore = ss[i].sportScore;
            }
            if (sportMinScore > ss[i].sportScore) {
                sportMinScore = ss[i].sportScore;
            }
        }
        System.out.print("english max:"  + englishMaxScore);
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].englishScore == englishMaxScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();
        System.out.print("english min:"  + englishMinScore);
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].englishScore == englishMinScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();
        System.out.print("computer max:"  + computerMaxScore);       
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].computerScore == computerMaxScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();        
        System.out.print("computer min:"  + computerMinScore);
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].computerScore == computerMinScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();        
        System.out.print("sport max:"  + sportMaxScore);       
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].sportScore == sportMaxScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();        
        System.out.print("sport min:"  + sportMinScore);
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (ss[i].sportScore == sportMinScore) {
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println();
    }
    
    public static void calculateUnpassedScore(final StudentScore[] ss) {
        if (ss.length != STUDENTNUMBER) {
            System.out.println("something wrong!!");
            return;
        }
        int unpassedCount = 0;
        System.out.print("english unpassed:");
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (!ss[i].englishPassed) {
                unpassedCount++;
                System.out.print(" (" + ss[i].sdutentName + " " + ss[i].englishScore + ")");
            }
        }
        System.out.println(" " + unpassedCount);
        System.out.print("computer unpassed:");
        unpassedCount = 0;
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (!ss[i].computerPassed) {
                unpassedCount++;
                System.out.print(" (" + ss[i].sdutentName + " " + ss[i].computerScore + ")");
            }
        }
        System.out.println(" " + unpassedCount);
        System.out.print("sport unpassed:");
        unpassedCount = 0;
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (!ss[i].sportPassed) {
                unpassedCount++;
                System.out.print(" (" + ss[i].sdutentName + " " + ss[i].sportScore + ")");
            }
        }
        System.out.println(" " + unpassedCount);
        System.out.print("total unpassed:");
        unpassedCount = 0;
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            if (!ss[i].allPassed) {
                unpassedCount++;
                System.out.print(" " + ss[i].sdutentName);
            }
        }
        System.out.println(" " + unpassedCount);
    }
    
    public static void main(String[] args) {
        System.out.println("----------begin----------");
        StudentScore[] ssArray = new StudentScore[STUDENTNUMBER];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            StudentScore ss = new StudentScore();
            ssArray[i] = ss;
            System.out.print("please input the name of one student:");
            ss.sdutentName = scan.next();
            System.out.print("please input the english score of student " + ss.sdutentName + ":");
            ss.englishScore = scan.nextFloat();
            System.out.print("please input the computer score of student " + ss.sdutentName + ":");
            ss.computerScore = scan.nextFloat();
            System.out.print("please input the sport score of student " + ss.sdutentName + ":");
            ss.sportScore = scan.nextFloat();
            System.out.println("--------------------");
        }
        for (int i = 0; i < STUDENTNUMBER; ++i) {
            ssArray[i].information();
        }
        System.out.println("--------------------");
        StudentScore.calculateAverageScore(ssArray);
        System.out.println("--------------------");
        StudentScore.calculateMaxMinScore(ssArray);
        System.out.println("--------------------");
        StudentScore.calculateUnpassedScore(ssArray);        
        System.out.println("----------end----------");
    }
}