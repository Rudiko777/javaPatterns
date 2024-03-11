package pract8.Main;

import pract8.Chain.*;
import pract8.State.Activity;
import pract8.State.Developer;
import pract8.State.Sleeping;

public class Main {
    public static void main(String[] args) {
        //Состояние
//        Activity activity = new Sleeping();
//        Developer developer = new Developer();
//
//        developer.setActivity(activity);
//        for (int i = 0; i < 10; i++){
//            developer.justDoIt();
//            developer.changeActivity();
//        }
        //Цепочка обязанностей
//        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
//        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
//        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);
//
//        reportNotifier.setNextNotifier(emailNotifier);
//        emailNotifier.setNextNotifier(smsNotifier);
//
//        reportNotifier.notifyManager("Everything is OK", Priority.ROUTINE);
//        reportNotifier.notifyManager("Something went wrong", Priority.IMPORTANT);
//        reportNotifier.notifyManager("Big troubles", Priority.ASAP);
    }
}
