package personalHealth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;




public class Data {

    double temperatureType1 = 25;
    double weightType1 = 0;
    double distanceType1 = 0;

    public Data() {
    }

    public void doFunction() {


        //    int COUNT = 1;

        boolean ISMODE1 = true;


        double temperatureType2 = 0;
        double weightType2 = 0;
        double distanceType2 = 0;

//        Date date = new Date();
        SimpleDateFormat formatterMonthDateYear = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatterMonthDateYear.format(new Date());

        SimpleDateFormat formatterDateMonthYear = new SimpleDateFormat("dd/MM/yyyy ");
        String time2 = formatterDateMonthYear.format(new Date());

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatterLocalTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String timeHourMinuteSecond = formatterLocalTime.format(localTime);

        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
        String timeHourMinuteSecondMarker = dateFormat.format(new Date()).toString();


        System.out.println("\nThe Default data is--" +
                " \nTemperature -" + temperatureType1 + " degree celcius \nWeight - "
                + weightType1 + " Kilogram: \nDistance covered - " + distanceType1 + " km" + "\nDate - " + strDate + "\nTime - " + timeHourMinuteSecond);
        System.out.println(" ");

        String continueChoice;
        do {

            System.out.println("\nChoose any of the option");
            System.out.println("1. Display the data");
            System.out.println("2. Toggle modes (from mode1 -> mode2 -> mode1)");
            System.out.println("3. Edit the values");
            System.out.println("0. TO exit");
            System.out.println("Enter the choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    if (ISMODE1) {
                        System.out.println("\nMode 1" +
                                " \nTemperature- " + temperatureType1 + " degree celcius \nWeight- "
                                + weightType1 + " Kilogram \nDistance- " + distanceType1 + " Kilometre" + "\nDate- " + strDate + "\nTime- " + timeHourMinuteSecond);
                    } else {
                        System.out.println("\nMode 2" +
                                " \nTemperature is " + temperatureType1 * 1.8 + " degree fahrenheit \nWeight-" + weightType1 * 2.2 +
                                " pounds \nDistance- " + distanceType1 * 0.62 + " miles" + "\nDate- " + time2 + "\nTime- " + timeHourMinuteSecondMarker);
                    }
                    break;
                case 2: //change of mode


                    ISMODE1 = !ISMODE1;// here we are toggling modes

                    if (ISMODE1) {
                        System.out.println("\nMode 1" +
                                " \nTemperature- " + temperatureType1 + " degree celcius \nWeight- "
                                + weightType1 + " Kilogram- \nDistance- " + distanceType1 + " Kilometre" + "\nDate- " + strDate + "\nTime- " + timeHourMinuteSecond);
                    } else {
                        System.out.println("\nMode 2" +
                                " \nTemperature- " + temperatureType1 * 1.8 + " degree fahrenheit \nWeight-" + weightType1 * 2.2 +
                                " pounds \nDistance- " + distanceType1 * 0.62 + " Miles" + "\nDate- " + time2 + "\nTime- " + timeHourMinuteSecondMarker);
                    }
                    break;
                case 3:
//                    String continueChoice2;

                    System.out.println("\nEnter the values For Personal Health Data ");
                    System.out.println("1. Enter Temperature- ");
                    System.out.println("2. Enter Weight- ");
                    System.out.println("3. Enter Distance- ");

                    int choiceNew = sc.nextInt();
                    switch (choiceNew) {
                        case 1:
                            System.out.println("Enter Temperature- ");
                            if (ISMODE1) {
                                System.out.println("In Celcius:");
                                temperatureType1 = sc.nextDouble();
                            } else {
                                System.out.println("In Fahrenheit:");
                                temperatureType2 = sc.nextDouble();
                                temperatureType1 = (float) temperatureType2 / 1.8;
                            }
                            break;
                        case 2:
                            System.out.println("Enter Weight- ");
                            if (ISMODE1) {
                                System.out.println("In Kilogram:");
                                weightType1 = sc.nextDouble();
                            } else {
                                System.out.println("In Pounds:");
                                weightType2 = sc.nextDouble();
                                weightType1 = (float) weightType2 / 2.2;
                            }
                            break;
                        case 3:
                            System.out.println("Enter Distance- ");
                            if (ISMODE1) {
                                System.out.println("In Kilometre:");
                                distanceType1 = sc.nextDouble();
                            } else {
                                System.out.println("In Miles:");
                                distanceType2 = sc.nextDouble();
                                distanceType1 = (float) distanceType2 / 0.62;
                            }
                            break;
                        default:
                            System.out.println("Error... value you entered, " + choiceNew + " is invalid ");
                    }
                    if (choiceNew == 1 || choiceNew == 2 || choiceNew == 3) {
                        if (ISMODE1) {
                            System.out.println("\nNew Data is as Follows " +
                                    " \nTemperature is " + temperatureType1 + " degree Celcius \nWeight "
                                    + weightType1 + "  \nDistance " + distanceType1 + " Kilometre" + "\nDate " +
                                    strDate + "\nTime " + timeHourMinuteSecond);
                        } else {
                            System.out.println("\nNew Data is as Follows " +
                                    " \nTemperature is " + temperatureType1 * 1.8 + " degree Fahrenheit \nWeight-"
                                    + weightType1 * 2.2 + " pounds \nDistance- " + distanceType1 * 0.62 + " Miles" +
                                    "\nDate- " + time2 + "\nTime- " + timeHourMinuteSecondMarker);
                        }
                    } else {
                        System.out.println(" ");
                    }
                    break;
                case 0:
                    System.out.println("Exiting the system.......\nSuccessful");
                    System.exit(0);
                    break;
            }
            System.out.print("\nWant to Continue? (y/n): ");
            continueChoice = sc.next();
        } while (continueChoice.equals("y"));
    }
}