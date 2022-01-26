package sample;

import java.util.List;

public class MyText {
    public String answer3;
    public int count = 0;
    public String question;
    public String answer1;
    public String answer2;
    public List<String> Mylist;

    public List<String> getMylist(int count) {
        return Mylist;
    }

    public void setMylist(List<String> mylist) {
        Mylist = mylist;
    }



    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public MyText(String question, String answer1, String answer2, String answer3) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.count = count;
    }








}
