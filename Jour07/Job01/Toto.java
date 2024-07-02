package Jour07.Job01;

public class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }
    public static void main(String[] args) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : " + toto);
    }
}
/* [{
	"resource": "/c:/Users/tiste/Documents/Cours/Runtrack java révision/runtrackJavaPOO/Jour07/Job01/Toto.java",
	"owner": "_generated_diagnostic_collection_name_#3",
	"code": "33554506",
	"severity": 8,
	"message": "Cannot make a static reference to the non-static field toto",
	"source": "Java",
	"startLineNumber": 11,
	"startColumn": 40,
	"endLineNumber": 11,
	"endColumn": 44
}] */