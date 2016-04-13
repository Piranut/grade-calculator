package Grades;

import java.util.Comparator;

/**
 * I wrote this code for you.
 * @author mafudge
 */
public class LetterGradeComparator implements Comparator<LetterGrade> {

    @Override
    public int compare(LetterGrade grade1, LetterGrade grade2) {
        return (int)(1000*grade1.Points() - 1000*grade2.Points());      
    }
}
