package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    //alap Anchor, ezen van az egész:
    public AnchorPane anchor;
//buttons:
    public Button answerButton1;
    public Button answerButton2;
    public Button answerButton3;
    public Button startButton;
    public Button nextButton;
    public Button exitButton;
    public Button nextQuizButton;
    public Button coloredButton;
//labels:
    public Label question1;
    public Label goodAnswer;
    public Label wrongAnswerLabel;
    public Label goodAnswer2;
    public Label resultLabel;
    public Label startQuestionLabel;
    public Label historyLabel;
    public Label nemOKLabel;
    public Label answerButtonLabel1;
    public Label answerButtonLabel2;
    public Label answerButtonLabel3;
//rectangles:
    public Rectangle rectangle;
    public Rectangle answerRectangle1;
    public Rectangle answerRectangle2;
    public Rectangle answerRectangle3;
    //counters:
    int counter = 0;
    int counterright = 0;
    int counterNextQuiz = 0;
    int counterNextButton = 0;
    int counterStart = 0;
    int random = 0;
    int countck = 0;
    //alap képek, ikonok elkészítése:
    public ImageView newImageView;
    Image image1 = new Image("/Historyicon.png");
    Image image3 = new Image("/beericon.png");
    Image image4 = new Image("/Hands-Thumbs-Down-icon.png");
    Image image5 = new Image("/alcoholpicture.png");
    Image image6 = new Image("/Bp.png");
    Image image2es = new Image("/twoicon.png");
    Image image3as = new Image("/3icon.png");
    Image image4es = new Image("/4icon.png");
    Image image5os = new Image("/5icon.png");
    ImageView imageView1 = new ImageView(image1);
    Image image2 = new Image("/historypicture.jpg");
    ImageView imageView2 = new ImageView(image2);
    ImageView imageView3 = new ImageView(image5);
    ImageView imageView4 = new ImageView(image6);

public static void vanishing(List<ImageView> myImageViewList){
    myImageViewList.stream().forEach(a -> a.setVisible(false));
}

//feltöltött kérdések-válaszok String objektumként:
    MyText mytext1 = new MyText("Ki volt a Napkirály?", "XIV. Lajos", "XV. Lajos", "XVI. Lajos");
    MyText mytext2 = new MyText("Mikor volt a kenyérmezei csata?", "1479", "1235", "1520");
    MyText mytext3 = new MyText("Mikor volt a kubai rakétaválság?", "1962", "1969", "1971");
    MyText mytext4 = new MyText("Hol volt az I. vh. legnyagyobb csatája?", "Verdun", "Gallipoli", "Ypres");
    MyText mytext5 = new MyText("Ki volt a Sivatagi Róka?", "Ervin Rommel", "Bernard Montgomery", "George Patton");

    MyText mytext6 = new MyText("Melyik híd volt túl messze (II vh.)?", "Arnhemi híd", "Rajna híd", "Nijmegeni híd");
    MyText mytext7 = new MyText("Mikor volt a „fekete csütörtök” azaz a New York-i tőzsdekrach?", "1929. október 24-én", "1929. szeptember 2-án", "1930. november 4-én");
    MyText mytext8 = new MyText("Mikor uralkodott II. András?", "1205-1235", "1235-1265", "1265-1283");
    MyText mytext9 = new MyText("Kinek az elnöksége alatt történt az U2-es incidens?", "Dwight D. Eisenhower", "Richard Nixon", "Lyndon B. Johnson");
    MyText mytext10 = new MyText("Melyik nem ide való?", "SHIELD", "OMAHA", "SWORD");

    MyText mytext11 = new MyText("Melyik régió sajátja a sligovica vagy más néven szilvórum? ", "Cseh-, Lengyelország, Balkán", "Mexikó", "Spanyolország");
    MyText mytext12 = new MyText("Milyen bor illik a sült keszeghez?", "Fehérbor", "Vörösbor", "Rosé");
    MyText mytext13 = new MyText("Melyik nem lehet az úzóban?", "kamilla", "fahéj", "ánizs");
    MyText mytext14 = new MyText("Melyik a grog egyik alapanyaga?", "rum", "pezsgő", "bor");
    MyText mytext15 = new MyText("Melyik a létező legjobb sör a világon??", "Szia Uram!", "Szia Uram!", "Szia Uram!");
    MyText mytext16 = new MyText("Melyik a grog egyik alapanyaga?", "rum", "pezsgő", "bor");//6. kérdés
    /*
    List<String> quiz1 = Arrays.asList("Ki volt a Napkirály?","XIV. Lajos", "XV. Lajos", "XVI. Lajos");
    List<String> quiz2 = Arrays.asList("Mikor volt a kenyérmezei csata?", "1479", "1235", "1520");
    List<String> quiz3 = Arrays.asList("Mikor volt a kubai rakétaválság?", "1962", "1969", "1971");
    List<String> quiz4 = Arrays.asList("Hol volt az I. vh. legnyagyobb csatája?", "Verdun", "Gallipoli", "Ypres");
    List<String> quiz5 = Arrays.asList("Ki volt a Sivatagi Róka?", "Ervin Rommel", "Bernard Montgomery", "George Patton");
    */
    //feltöltött kérdések-válaszok mint Listák:
    //Bp. kvíz:
    List<String> quiz1 = Arrays.asList("Mikor nyílt meg a Keleti Pályaudvar?","1884. július 15.", "1880. június 20.", "1891. január 2.");
    List<String> quiz2 = Arrays.asList("Melyik a legnagyobb népességű kerület?", "XI.", "III.", "XIV.");
    List<String> quiz3 = Arrays.asList("Ki volt Budapest első polgármestere?", "Kamermayer Károly", "Márkus József", "Halmos János");
    List<String> quiz4 = Arrays.asList("Budapestnek eredetileg hány kerülete volt?", "10", "12", "20");
    List<String> quiz5 = Arrays.asList("Budapesten hány színház működik?", "40", "35", "24");
/*
    List<String> quiz6 = Arrays.asList("Melyik híd volt túl messze (II vh.)?", "Arnhemi híd", "Rajna híd", "Nijmegeni híd");
    List<String> quiz7 = Arrays.asList("Mikor volt a „fekete csütörtök” azaz a New York-i tőzsdekrach?", "1929. október 24-én", "1929. szeptember 2-án", "1930. november 4-én");
    List<String> quiz8 = Arrays.asList("Mikor uralkodott II. András?", "1205-1235", "1235-1265", "1265-1283");
    List<String> quiz9 = Arrays.asList("Kinek az elnöksége alatt történt az U2-es incidens?", "Dwight D. Eisenhower", "Richard Nixon", "Lyndon B. Johnson");
    List<String> quiz10 = Arrays.asList("Melyik nem ide való?", "SHIELD", "OMAHA", "SWORD");
*/
    List<String> quiz6 = Arrays.asList(" 'A háború, amely véget vet minden háborúnak.' Ez a(z): ", "I. világháború", "II. világháború", "100 éves háború");
    List<String> quiz7 = Arrays.asList("Melyik nem Kisantant szövetséges?", "Bulgária", "Románia", "Csehszlovákia");
    List<String> quiz8 = Arrays.asList("Melyik a helytelen?", "Little Girl", "Fat Man", "Little Boy");
    List<String> quiz9 = Arrays.asList("Ki volt Magyarország első polgári származású miniszterelnöke?", "Wekerle Sándor", "Tisza István", "Tisza Kálmán");
    List<String> quiz10 = Arrays.asList("Melyik nem ide való?", "EASY", "JUNO", "GOLD");

    //italkvíz:
/*
    List<String> quiz11 = Arrays.asList("Melyik régió sajátja a sligovica vagy más néven szilvórum? ", "Cseh-, Lengyelország, Balkán", "Mexikó", "Spanyolország");
    List<String> quiz12 = Arrays.asList("Milyen bor illik a sült keszeghez?", "Fehérbor", "Vörösbor", "Rosé");
    List<String> quiz13= Arrays.asList("Melyik nem lehet az úzóban?", "kamilla", "fahéj", "ánizs");
    List<String> quiz14= Arrays.asList("Melyik a grog egyik alapanyaga?", "rum", "pezsgő", "bor");
    List<String> quiz15 = Arrays.asList("Melyik a létező legjobb sör a világon??", "Szia Uram!", "Szia Uram!", "Szia Uram!");
*/
    List<String> quiz11 = Arrays.asList("Melyek azok az ízjegyek, amelyek elsősorban a malátából származnak?", "gabonás, kenyeres, mézes, aszalt gyümölcsös ízek", "friss gyümölcsös, kesernyés ízek", "florális gyógynövényes, virágos ízek");
    List<String> quiz12 = Arrays.asList("A komlónövény mely részét használják a sörfőzéshez?", "a nőivarú komlóvirágot", "a növény leveleit és hajtásait", "a gyökerét");
    List<String> quiz13= Arrays.asList("Az alábbiak közül melyik állítás igaz a komlóra?", "tartósítja a sört", "világos színt ad a sörnek", "krémesebbé teszi a sör textúráját");
    List<String> quiz14= Arrays.asList("Mi a Whirpool komlózás lényege?", "a már nem forrásban lévő sörléhez keverik hozzá a komlót", "a komlóval együtt ászokolják a sört", "magas hőmérsékletű sörléhez adják hozzá a komlót");
    List<String> quiz15 = Arrays.asList("Hogyan erjednek a Brüsszel környékén készülő Lambic sörök?", "fajélesztővel való beoltás nélkül!", "hibrid erjesztéssel", "felsőerjesztéssel");


//listák létrehozása

    List<MyText> myTextList1 = new ArrayList<>();
    List<MyText> myTextList2 = new ArrayList<>();
    List<MyText> myTextList3 = new ArrayList<>();

    //listák listája:
    List<List<MyText>> sumList = new ArrayList<>();
    //asList megoldáshoz
    List<List<String>> sumList1 = new ArrayList<>();
    List<List<String>> sumList2 = new ArrayList<>();
    List<List<String>> sumList3 = new ArrayList<>();
    List<List<List<String>>> sumList4 = new ArrayList<>();
    //Buttons
    List<Button> MyButtons = new ArrayList<>();
    //labels:
    List<Label> MyLabels = new ArrayList<>();
    //Rectangles
    List<Rectangle> MyRectangles = new ArrayList<>();



    public void startButtonEvent(ActionEvent actionEvent) {//kezdés gomb
        System.out.println("startButtonEvent lefut.");
//címkék inicializálásaa startnál:
        startQuestionLabel.setVisible(true);
        question1.setText("Ki volt a Napkirály?");
        question1.setVisible(true);
//gombok inicializálása a startnál:
        answerButton1.setDisable(false);
        answerButton2.setDisable(false);
        answerButton3.setDisable(false);
        nextButton.setDisable(false);
        answerButton1.setVisible(true);
        answerButton2.setVisible(true);
        answerButton3.setVisible(true);
        exitButton.setVisible(false);
        startButton.setVisible(false);
        //coloredButton.setVisible(true);
        //rectangle.setVisible(false);
//képek inicializálása a startnál:
        newImageView.setImage(image3);
        newImageView.setVisible(false);
//gombok felcímkézése induláskor
        ButtonLabeling();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("initialize lefut.");
        //counter++;
//listák feltöltése a kérdésekkel:
        myTextList1.add(mytext1);
        myTextList1.add(mytext2);
        myTextList1.add(mytext3);
        myTextList1.add(mytext4);
        myTextList1.add(mytext5);

        myTextList2.add(mytext6);
        myTextList2.add(mytext7);
        myTextList2.add(mytext8);
        myTextList2.add(mytext9);
        myTextList2.add(mytext10);

        myTextList3.add(mytext11);
        myTextList3.add(mytext12);
        myTextList3.add(mytext13);
        myTextList3.add(mytext14);
        myTextList3.add(mytext15);

//listák betöltése az összegző listához
        sumList.add(myTextList1);
        sumList.add(myTextList2);
        sumList.add(myTextList3);
//második megoldás (asList-ek)

        sumList1.add(quiz1);
        sumList1.add(quiz2);
        sumList1.add(quiz3);
        sumList1.add(quiz4);
        sumList1.add(quiz5);

        sumList2.add(quiz6);
        sumList2.add(quiz7);
        sumList2.add(quiz8);
        sumList2.add(quiz9);
        sumList2.add(quiz10);

        sumList3.add(quiz11);
        sumList3.add(quiz12);
        sumList3.add(quiz13);
        sumList3.add(quiz14);
        sumList3.add(quiz15);
        //listák betöltése az összegző listához(asList megoldás)
        sumList4.add(sumList1);
        sumList4.add(sumList2);
        sumList4.add(sumList3);
        //Buttons:
        MyButtons.add(answerButton1);
        MyButtons.add(answerButton2);
        MyButtons.add(answerButton3);

        //Labels:
        MyLabels.add(answerButtonLabel1);
        MyLabels.add(answerButtonLabel2);
        MyLabels.add(answerButtonLabel3);
        //Rectangles:
        MyRectangles.add(answerRectangle1);
        MyRectangles.add(answerRectangle2);
        MyRectangles.add(answerRectangle3);

        //próbák az elemekre:
        sumList.get(0);
        myTextList1.get(0);
        mytext1.getAnswer1();

        sumList1.get(0);
        quiz1.get(1);

        //címkék inicializálása:
        startQuestionLabel.setVisible(false);
        goodAnswer.setVisible(false);
        goodAnswer2.setVisible(false);
        wrongAnswerLabel.setVisible(false);
        question1.setVisible(false);
        resultLabel.setVisible(false);
        //nemOKLabel.setVisible(false);
        answerButtonLabel1.setVisible(false);
        answerButtonLabel2.setVisible(false);
        answerButtonLabel3.setVisible(false);
        //rectangle-k:
        answerRectangle1.setVisible(false);
        answerRectangle2.setVisible(false);
        answerRectangle3.setVisible(false);
        //rectangle.setVisible(false);
        //gombok inicializálása:
        answerButton1.setVisible(false);
        answerButton2.setVisible(false);
        answerButton3.setVisible(false);
        nextButton.setVisible(false);
        answerButton1.setDisable(true);
        answerButton2.setDisable(true);
        answerButton3.setDisable(true);
        nextButton.setDisable(true);
        nextQuizButton.setVisible(false);
        //coloredButton.setVisible(false);

        //képek inicializálása:
        anchor.getChildren().add(imageView2);
        anchor.getChildren().add(imageView1);
        anchor.getChildren().add(imageView3);
        anchor.getChildren().add(imageView4);
        imageView3.setVisible(false);
        imageView2.setVisible(false);//nagy history kép
        imageView1.setVisible(false);//kicsi history kép
        //imageView2.setScaleX(0.5);
        //imageView2.setScaleY(0.5);
        imageView2.setX(90);
        imageView2.setY(55);
        imageView3.setX(75);
        imageView3.setY(75);//alcoholpicture
        imageView4.setX(85);
        imageView4.setY(75);
        imageView1.setX(40);
        imageView1.setY(100);

    }

    //Ellenőrzés metódus. Ide még kell hogy bármely gomb lenyomása után a másik kettó disabled (hogy ne lehessen nyomkodni--és ne szineződjön el).
    //itt nem sikerült megoldani a ButtonEvent-eknél van.
    public void checkAnswer(Button buttonck, Label labelck, Rectangle rectangleck){


        if (shufflelista.get((MyButtons.indexOf(buttonck))) == 1){//a gomb sorszáma kell

            //green
            labelck.setVisible(true);
            labelck.setDisable(false);
            rectangleck.setFill(Color.GREEN);
            rectangleck.setVisible(true);
            goodAnswer.setVisible(true);
            counterright++;
        }
        else{

            //red

            labelck.setVisible(true);
            rectangleck.setFill(Color.RED);
            rectangleck.setVisible(true);
            wrongAnswerLabel.setVisible(true);
            //rectangles: 0,1,2
            MyRectangles.get(shufflelista.indexOf(1)).setVisible(true);
            MyRectangles.get(shufflelista.indexOf(1)).setFill(Color.GREEN);
            //labels:
            MyLabels.get(shufflelista.indexOf(1)).setDisable(false);
            MyLabels.get(shufflelista.indexOf(1)).setVisible(true);
            //answers:
            goodAnswer2.setVisible(true);
            goodAnswer2.setText(sumList4.get(counterNextQuiz).get(counter).get(1));

            System.out.println("shufflelista.indexOf(1): "+shufflelista.indexOf(1));


        }
    }

//Válaszgombok:
    //Button 1:

    public void answerButton1Event(ActionEvent actionEvent) {

        checkAnswer(answerButton1, answerButtonLabel1, answerRectangle1);
        MyButtons.stream().forEach(a -> a.setDisable(true));//bejárjuk az 'n' elemű listát és minden objektummal csinálunk valamit
        nextButton.setVisible(true);

        System.out.println("answerButton1Event lefut.");

    }
    //Button 2:
    public void answerButton2Event(ActionEvent actionEvent) {

        checkAnswer(answerButton2, answerButtonLabel2, answerRectangle2);
        MyButtons.stream().forEach(a -> a.setDisable(true));
        nextButton.setVisible(true);

        System.out.println("answerButton2Event lefut.");

    }
    //Button 3:
    public void answerButton3Event(ActionEvent actionEvent) {

        checkAnswer(answerButton3, answerButtonLabel3,answerRectangle3);
        MyButtons.stream().forEach(a -> a.setDisable(true));
        nextButton.setVisible(true);
        System.out.println("answerButton3Event lefut.");


    }

    List<Integer> shufflelista;

    //Next gomb
    public void nextButtonEvent(ActionEvent actionEvent) {

        counterNextButton++;
        System.out.println("nextButtonEvent lefut.");
        //System.out.println("counter2: " + counter);
        startButton.setDisable(true);

        System.out.println("counter2cimkezes: " + counter);
        System.out.println("mytextlst mérete "+myTextList1.size());
        System.out.println("counterNextButton: "+ counterNextButton);
        System.out.println("counterNextQuiz1: " + counterNextQuiz);


            if (counterNextButton == myTextList1.size()) {//következő kvízre való ugrás
                //question1.setText("VÉGE");
                //gombok:
                answerButton1.setDisable(false);
                answerButton2.setDisable(false);
                answerButton3.setDisable(false);
                answerButton1.setVisible(false);
                answerButton2.setVisible(false);
                answerButton3.setVisible(false);
                //rectangle-k:
                answerRectangle1.setVisible(false);
                answerRectangle2.setVisible(false);
                answerRectangle3.setVisible(false);
                answerRectangle1.setDisable(true);
                answerRectangle2.setDisable(true);
                answerRectangle3.setDisable(true);
                labels:
                answerButtonLabel1.setVisible(false);
                answerButtonLabel2.setVisible(false);
                answerButtonLabel3.setVisible(false);
                answerButtonLabel1.setDisable(true);
                answerButtonLabel2.setDisable(true);
                answerButtonLabel3.setDisable(true);
                //kérdések:
                question1.setVisible(false);
                startQuestionLabel.setVisible(false);
                //nextButton:
                nextButton.setDisable(true);
                nextButton.setVisible(false);
                //válaszok:
                goodAnswer.setVisible(false);
                goodAnswer2.setVisible(false);
                wrongAnswerLabel.setVisible(false);
                //egyéb gombok:
                startButton.setVisible(false);
                exitButton.setVisible(true);//Kilépés
                nextQuizButton.setVisible(true);//következő kvíz gomb megnyomható
                //nextQuizButton.setVisible(false);
                //számlálók:
                counter = 0;
                counterNextButton = 0;
                counterNextQuiz++;
                result();
                //counterNextQuiz++;
                if(counterNextQuiz==sumList.size()){
                    question1.setText("VÉGE, SZÉP VOLT FIÚK, LÁNYOK!");
                    question1.setVisible(true);
                    nextQuizButton.setVisible(false);
                }


                System.out.println("counterNextQuiz2: " + counterNextQuiz);

            } else {

                counter++;
                System.out.println("counter a nextButtonEvent metóduson belül: " + counter);
                System.out.println("counterNexButton a nextButtonEvent metóduson belül: " + counterNextButton);

                answerRectangle1.setVisible(false);
                answerRectangle2.setVisible(false);
                answerRectangle3.setVisible(false);
                answerRectangle1.setDisable(true);
                answerRectangle2.setDisable(true);
                answerRectangle3.setDisable(true);
                answerButtonLabel1.setVisible(false);
                answerButtonLabel2.setVisible(false);
                answerButtonLabel3.setVisible(false);
                answerButtonLabel1.setDisable(true);
                answerButtonLabel2.setDisable(true);
                answerButtonLabel3.setDisable(true);
                answerButton1.setDisable(false);
                answerButton2.setDisable(false);
                answerButton3.setDisable(false);
                //answers:
                wrongAnswerLabel.setVisible(false);
                goodAnswer2.setVisible(false);
                goodAnswer.setVisible(false);
                ButtonLabeling();


            }

            System.out.println("counterright: " + counterright);
        nextButton.setVisible(false);




    }
//Eredmény kiértékelése
    public void result(){
        System.out.println("result lefut.");
        System.out.println("counterNextQuiz a result metódusban: " + counterNextQuiz);
        resultLabel.setVisible(true);
        switch 	(counterright) {

            case 0:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 0. Töri egyes");
                    newImageView.setImage(image4);
                    newImageView.setVisible(true);
                }else{
                    resultLabel.setText("Jó válaszok száma: 0. Igyál SziaUram-ot!");
                }
                break;
            case 1:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 1. Töri kettes");
                    newImageView.setImage(image2es);
                    newImageView.setVisible(true);
                }else{
                    resultLabel.setText("Jó válaszok száma: 1. Igyál Dréher-t!");
                }
                break;
            case 2:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 2. Töri hármas");
                    newImageView.setImage(image3as);
                    newImageView.setVisible(true);
                }else{
                    resultLabel.setText("Jó válaszok száma: 2. Igyál Mad Scientist-et!");
                }
                break;
            case 3:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 3. Töri négyes");
                    newImageView.setImage(image4es);
                    newImageView.setVisible(true);
                }else{
                    resultLabel.setText("Jó válaszok száma: 3. Igyál Monyo-ot!");
                }
                break;
            case 4:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 4. Töri ötös");
                    newImageView.setImage(image5os);
                    newImageView.setVisible(true);
                    break;
                }else{
                    resultLabel.setText("Jó válaszok száma: 4. Igyál Horizont-ot!");
                }
            case 5:
                if(counterNextQuiz < sumList.size()) {
                    resultLabel.setText("Jó válaszok száma: 5. Töri Kitűnő");
                    newImageView.setImage(image5os);
                    newImageView.setVisible(true);
                    break;
                } else{
                    resultLabel.setText("Jó válaszok száma: 5. Igyál Reketye-t!");
                }
                break;
            default:
                System.out.println("resultLabelDefault");
                break;
        }
    }



//Gombok felcímkézése minden körben:
    public void ButtonLabeling(){
//Random számok legenerálása:
        shufflelista =MyShuffle();
//Fő kérdés szövegének kiosztása:
        question1.setText(sumList4.get(counterNextQuiz).get(counter).get(0));//"Kérdés" felcímkézése minden körben

        //Button 1:
        answerButton1.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(0)));
        answerButtonLabel1.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(0)));

        //Button 2:
        answerButton2.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(1)));
        answerButtonLabel2.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(1)));

        //Button 3:
        answerButton3.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(2)));
        answerButtonLabel3.setText(sumList4.get(counterNextQuiz).get(counter).get(shufflelista.get(2)));

//Ellenőrzések:

        System.out.println("gombCimkezes lefut.");

        System.out.println("counter a gombcimkézés metóduson belül: "+counter);

    }
//Kilépés gomb:
    public void exitButtonEvent(ActionEvent actionEvent) {
        System.out.println("EXIT lefut.");
        System.exit(0);
    }

//Következő kvíz gomb:
    public void nexQuizButtonEvent(ActionEvent actionEvent) {
        counterright = 0;
        System.out.println("nexQuizButtonEvent lefut.");

        System.out.println("counterNextQuiz: " + counterNextQuiz);

        //addMyTextList(myTextList1, myTextList2);

        startButton.setVisible(true);
        startButton.setDisable(false);

        if(counterNextQuiz > 0) {
            //myTextList1.clear();
            //addMyTextList(myTextList1, myTextList2);//elsőhöz hozzáadja a másodikat
            historyLabel.setText("Történelmi kvíz:");
            imageView2.setVisible(true);//nagy history kép
            //imageView1.setVisible(true);//kicsi history kép
            imageView4.setVisible(false);//nagy Budapest kép
            newImageView.setVisible(false);
        }
        if(counterNextQuiz > 1) {
            //myTextList1.clear();
            //addMyTextList(myTextList1, myTextList3);//elsőhöz hozzáadja a másodikat
            imageView3.setVisible(true);
            imageView2.setVisible(false);
            imageView2.setDisable(true);
            newImageView.setVisible(false);
            historyLabel.setText("Ultranehéz Sörkvíz:");
        }

        resultLabel.setVisible(false);
        nextQuizButton.setVisible(false);

    }
//Stringlisták kezelése--most használaton kívűl
    public static void addMyTextList(List<MyText> lista1, List<MyText> lista2){
        System.out.println("addMyTextList lefut.");
        //List<MyText> myList = new ArrayList<>();
        lista1.addAll(lista2);
    }

//permutációk elkészítése
    public static List<Integer>  MyShuffle(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i+1);//1,2,3-at dobjon, mert a 0. listaelem az mindig a "Kérdés".
        }
        Collections.shuffle(list);
        list.stream().forEach(a -> System.out.print(a + "\n"));
        return list;

    }



}
