
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        TourList tourList = new TourList();
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        int choice;
//        Testing:
//        Domestic domesticTour2 = new Domestic("DOM103", "HA NOI", 2000, true, df.parse("2020/1/3"), df.parse("2021/4/5"), 200);
//        Domestic domesticTour3 = new Domestic("DOM102", "DA NANG", 3000, false, df.parse("2019/1/3"), df.parse("2020/4/5"), 300);
//        Inter inter = new Inter("INT101", "SAI GON", 3000, true, df.parse("2018/1/3"), df.parse("2019/4/5"), 300, 400);
//        Inter inter2 = new Inter("INT102", "HOI AN", 5000, false, df.parse("2015/3/3"), df.parse("2016/4/5"), 300, 400);
//        tourList.addTourToList(domesticTour2);
//        tourList.addTourToList(domesticTour3);
//        tourList.addTourToList(inter);
//        tourList.addTourToList(inter2);
        do {
            menu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Current tour list:");
                    for (Tour tour : tourList.getList()) {
                        System.out.println(tour);
                    }
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("    1. Domestic Tour");
                    System.out.println("    2. International Tour");
                    System.out.print("    Your tour: ");
                    int choiceTour = sc.nextInt();
                    switch (choiceTour) {
                        case 1:
                            sc.nextLine();
                            Domestic domesticTour = new Domestic();
                            System.out.print("Code: ");
                            domesticTour.setCode(sc.nextLine().toUpperCase());
                            System.out.print("Title: ");
                            domesticTour.setTitle(sc.nextLine().toUpperCase());
                            System.out.print("Price: ");
                            domesticTour.setPrice(sc.nextDouble());
                            sc.nextLine();
                            System.out.print("Transport: ");
                            domesticTour.setTransport(sc.nextBoolean());
                            sc.nextLine();
                            System.out.print("Start day, (yyyy/m/d): ");
                            domesticTour.setStartDate(df.parse(sc.nextLine()));
                            System.out.print("End day,(yyyy/m/d): ");
                            domesticTour.setEndDay(df.parse(sc.nextLine()));
                            System.out.print("Tour guide tip: ");
                            domesticTour.setTourGuideTip(sc.nextDouble());
                            tourList.addTourToList(domesticTour);
                            System.out.println("");
                            break;
                        case 2:
                            sc.nextLine();
                            Inter interTour = new Inter();
                            System.out.print("Code: ");
                            interTour.setCode(sc.nextLine().toUpperCase());
                            System.out.print("Title: ");
                            interTour.setTitle(sc.nextLine().toUpperCase());
                            System.out.print("Price: ");
                            interTour.setPrice(sc.nextDouble());
                            sc.nextLine();
                            System.out.print("Transport: ");
                            interTour.setTransport(sc.nextBoolean());
                            sc.nextLine();
                            System.out.print("Start day, (yyyy/m/d): ");
                            interTour.setStartDate(df.parse(sc.nextLine()));
                            System.out.print("End day,(yyyy/m/d): ");
                            interTour.setEndDay(df.parse(sc.nextLine()));
                            System.out.print("Aviation tax: ");
                            interTour.setAviationTax(sc.nextDouble());
                            System.out.print("Entry fee: ");
                            interTour.setEntryFee(sc.nextDouble());
                            tourList.addTourToList(interTour);
                            System.out.println("");
                            break;
                    }
                    break;
                case 2:
                    for (Tour t : tourList.domesticsTour()) {
                        System.out.println(t);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Average tourcharge of all international: ");
                    System.out.println(tourList.averageTourChargeOfInter());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("    1. Search tour by Code");
                    System.out.println("    2. Search tour by Title");
                    System.out.println("    3. Search tour by Start date");
                    System.out.println("    4. Search tour by Transport");
                    System.out.print("    Your search: ");
                    int choiceSearch = sc.nextInt();
                    switch (choiceSearch) {
                        case 1:
                            sc.nextLine();
                            System.out.print("Enter code to search: ");
                            String code = sc.nextLine();
                            System.out.println(tourList.searchCode(code));
                            System.out.println("");
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.print("Enter title to search: ");
                            String title = sc.nextLine();
                            for (Tour tour : tourList.searchTitle(title)) {
                                System.out.println(tour);
                            }
                            System.out.println("");
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.print("Enter start date to search, (yyyy/m/d): ");
                            String date = sc.nextLine();
                            for (Tour tour : tourList.searchStartDate(df.parse(date))) {
                                System.out.println(tour);
                            }
                            System.out.println("");
                            break;
                        case 4:
                            sc.nextLine();
                            System.out.print("Enter transport to search: ");
                            boolean transport = sc.nextBoolean();
                            for (Tour tour : tourList.searchTransport(transport)) {
                                System.out.println(tour);
                            }
                            System.out.println("");
                            break;
                    }
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("The first occurrence of the tour having minimum tour charge: ");
                    System.out.println(tourList.firstMinTourCharge());
                    System.out.println("");
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Enter code you want to remove: ");
                    String code = sc.nextLine();
                    tourList.removeCode(code);
                    System.out.println("Remove successfully!");
                    System.out.println("");
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Enter date you want to remove, (yyyy/m/d): ");
                    String date = sc.nextLine();
                    tourList.removeDate(df.parse(date));
                    System.out.println("Remove successfully!");
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("After sort:");
                    tourList.sortTour();
                    for (Tour tour : tourList.getList()) {
                        System.out.println(tour);
                    }
                    System.out.println("");
                    break;
                case 9:
                    System.out.print("Enter code to update tour's information: ");
                    tourList.updateTour();
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("Saving tours to file successfully!");
                    try{
                        tourList.saveTourToFile("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Assignment\\src\\savingTour.txt");
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("Loading tours from file successfully!");
                    try{
                        tourList.loadTourFromFile("C:\\Users\\Dell La\\Desktop\\JavaMaterial\\Assignment\\src\\savingTour.txt");
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Thank you for using Nguyen Tran's service! Have a nice day!");
                    break;
            }
        } while (choice <= 11 && choice >= 0);

    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("  0. Show current list");
        System.out.println("  1. Add tour");
        System.out.println("  2. List all domestic tours");
        System.out.println("  3. Compute the average tour charge of all international tours");
        System.out.println("  4. Search tour");
        System.out.println("  5. Search the first occurrence of the tour having minimum tour charge");
        System.out.println("  6. Remove the tour having given code");
        System.out.println("  7. Remove tours with start date after the specified date");
        System.out.println("  8. Sort all tours of list");
        System.out.println("  9. Update tour information");
        System.out.println("  10. Saving tours to file");
        System.out.println("  11. Loading tours from file");
        System.out.println("  -1. Exit");
    }
}
