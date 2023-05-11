package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[] ={
            "Which company owns the android?",
            "Which one is not the programming language?",
            "Where you are watching this video?",
            "Which company owns the Apple?",
            "Which of the following converts Java byte code into Dalvik byte code?",
            "ADB stands for"
    };

    public static String choices[][] = {
            {"Google","Apple","Nokia","Samsung"},
            {"Java","Kotlin","Notepad","Python"},
            {"Facebook","Whatsapp","Instagram","Youtube"},
            {"Google","Apple","Nokia","Samsung"},
            {"Dalvik converter","Dex compiler","Mobile interpretive compiler (MIC)","None of the above"},
            {"Android debug bridge", "Android delete bridge", "Android destroy bridge", "None of the above"}
    };

    public static String correctAnswers[] = {
            "Google",
            "Notepad",
            "Youtube",
            "Apple",
            "Dex compiler",
            "Android debug bridge"
    };

}
