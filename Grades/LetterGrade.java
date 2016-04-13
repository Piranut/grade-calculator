package Grades;

/**
 * This custom data type represents Letter Grades eg. B+ and their point value eg. 3.333
 * @author mafudge
 * This code has been written for you... no need to change it
 */
public enum LetterGrade {
    A(4.0,"A"), 
    AMinus(3.667,"A-"),
    BPlus(3.333,"B+"),
    B(3.0,"B"),
    BMinus(2.667,"B-"),
    CPlus(2.333,"C+"),
    C(2.0, "C"),
    CMinus(1.667,"C-"),
    D(1.0,"D"),
    F(0.0,"F");
    
    private final double points;
    private final String letter;
   
    
    LetterGrade(double points, String letter) {
        this.points = points;
        this.letter = letter;
    }
    
    /**
     * Gets the string representation of the corresponding letter grade
     * @return a string representing the letter grade eg. "C+"
     */
    public String Letter() {
        return this.letter;
    }
    
    /**
     * Gets the point value of the corresponding letter grade
     * @return a double representing the point value eg. 3.667
     */
    public double Points() {
        return  this.points;
    } 
    
}
