package Grades;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Processes a collection of LetterGradeEnums
 * @author mafudge
 */
public class GradeProcessor {
    /**
     * The collection of LetterGradeEnum to process
     */
    private final ArrayList<LetterGrade> grades;
    
    /**
     * Creates a new grade processor for the list of grades
     * @param grades the collection of grades to process.
     */
    public GradeProcessor( ArrayList<LetterGrade> grades ) {
        this.grades = grades;
    }
    
    /**
     * Returns the number of grades in the collection
     * @return the count (number) of grades as an int
     */
    public int Count() {
        // TODO: Write code here
        return grades.size();
    }
    
    /**
     * Returns the Mean GPA (Grade Point Average) for the collection of grades.
     * @return The average of the grades as a double
     */
    public double GPA() {
        // TODO: Write code here. 
        double gpa;
        double sum = 0;
        int count = Count();

        if (count != 0) {
            for (LetterGrade l : grades) {
                sum += l.Points();
            }
            gpa = sum / (double) count;
        } else {
            gpa = 0;
        }
        return gpa;
    }
    
    /**
     * Returns the Mean as a letter grade (A, F, C+, etc...)
     * @return LetterGrade for the mean
     */
    public LetterGrade Mean() {
        // TODO: Write code here
        LetterGrade l;

        double gpa = GPA();

        if (gpa >= 4.0) {
            l = LetterGrade.A;
        } else if (gpa >= 3.667 && gpa < 4.0) {
            l = LetterGrade.AMinus;
        } else if (gpa >= 3.333 && gpa < 3.667) {
            l = LetterGrade.BPlus;
        } else if (gpa >= 3.0 && gpa < 3.333) {
            l = LetterGrade.B;
        } else if (gpa >= 2.667 && gpa < 3.0) {
            l = LetterGrade.BMinus;
        } else if (gpa >= 2.333 && gpa < 2.667) {
            l = LetterGrade.CPlus;
        } else if (gpa >= 2.0 && gpa < 2.333) {
            l = LetterGrade.C;
        } else if (gpa >= 1.667 && gpa < 2.0) {
            l = LetterGrade.CMinus;
        } else if (gpa >= 1.0 && gpa < 1.667) {
            l = LetterGrade.D;
        } else {
            l = LetterGrade.F;
        }

        return l;
    }
    
    /**
     * Returns the lowest grade in the collection
     * @return LetterGrade representing the lowest grade
     */
    public LetterGrade Lowest() {
        // TODO: Write code here. 

        Collections.sort(grades, new LetterGradeComparator());

        return grades.get(0);
    }
    
    /**
     * Returns the highest grade in the collection
     * @return LetterGrade representing the grade
     */
    public LetterGrade Highest() {
        // TODO: Write code here. 
        Collections.sort(grades, new LetterGradeComparator());
        
        return grades.get(grades.size()-1);
    }
    
    /**
     * Returns a count (frequency) of the number of LetterGrade in the collection 
     * of grades. For example you might get a count of C+.
     * @param grade The grade to count (eg. A, B+, F)
     * @return The frequency of that grade.
     */
    public int Frequency( LetterGrade grade ) {
        //TODO: Write code here
        int count = 0;
        for (LetterGrade l : grades) {
            if (l.Letter().equals(grade.Letter())) {
                count++;
            }
        }
        return count;
    }
}
