package com.thisgary.lab.module4;

/*
Activity 3
----------
Create an enumeration called as Subject
Details of enum declaration consist of following information:
1. Enum constant -> Arguments
2. CSE3501 -> ("Software Engineering Basic", "BCS(SE)")
3. CSE3502 -> ("Software Requirements Engineering", "BCS(SE)")
4. CSE3503 -> ("Software Architecture", "BCS(SE)")
5. CSE3504 -> ("Software Testing", "BCS(SE)")
6. MMM3401->("Principle of Maritime Management", "BSC(IM)")
7. CSA3501->("Maritime Informatics Technology and Application", "BSC(IM)")

The constructor for enum Subject has a signature of subject name and course name
The enum Subject has a getter for subject name and course name
 */

public enum Subject {
    CSE3501("Software Engineering Basic", "BCS(SE)"),
    CSE3502("Software Requirements Engineering", "BCS(SE)"),
    CSE3503("Software Architecture", "BCS(SE)"),
    CSE3504("Software Testing", "BCS(SE)"),
    MMM3401("Principle of Maritime Management", "BSC(IM)"),
    CSA3501("Maritime Informatics Technology and Application", "BSC(IM)") ;

    private final String subjectName;
    private final String departmentCode;

    Subject(String subjectName, String departmentCode) {
        this.subjectName = subjectName;
        this.departmentCode = departmentCode;
    }

    public void overview() {
        System.out.println(subjectName + ", " + departmentCode);
    }
}
