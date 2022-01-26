package sample;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public List<MyText> quizList;
    int quizCounter;

    public int getQuizCounter() {
        return quizCounter;
    }

    public void setQuizCounter(int quizCounter) {
        this.quizCounter = quizCounter;
    }

    public List<MyText> getQuizList() {

        return quizList;
    }

    public void setQuizList(List<MyText> quizList) {
        this.quizList = quizList;
    }




    public MyList(List<MyText> quizList) {
        this.quizList = quizList;
        //this.quizCounter = quizCounter;
    }

    public static void removeMyTextList(List<MyText> lista1, List<MyText> lista2){//nincs most használatban
        //List<MyText> myList = new ArrayList<>();
        lista1.removeAll(lista2);
    }

}
