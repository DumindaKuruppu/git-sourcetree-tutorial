package com.company;

class Main {

    public static void main(String[] args) {


        BA mrBa = new BA();
        mrBa.name = "Obama";
        mrBa.id="001";

    mrBa.train();
        mrBa.analytics();
        mrBa.extraActivities();




        QA mrQa = new QA();

        mrQa.backTest();
        mrQa.backTest();
        mrBa.train();
        mrBa.extraActivities();


        SE mrSe = new SE();

        mrSe.backDev();
        mrSe.frontDev();
        mrSe.extraActivities();
        mrSe.train();


        UI mrUi = new UI();

        mrUi.backDesign();
        mrUi.frontDesign();
        mrUi.extraActivities();
        mrUi.train();


    }

}










