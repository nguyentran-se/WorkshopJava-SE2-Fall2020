
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class TourList{

    private ArrayList<Tour> list = new ArrayList<>();

    public ArrayList<Tour> getList() {
        return list;
    }

    public void addTourToList(Tour t) {
        list.add(t);
    }

    public ArrayList<Tour> domesticsTour() {
        ArrayList<Tour> domesticsList = new ArrayList<>();
        for (Tour tour : list) {
            if (tour instanceof Domestic) {
                domesticsList.add(tour);
            }
        }
        return domesticsList;
    }

    public double averageTourChargeOfInter() {
        double sumTourCharge = 0;
        int amount = 0;
        for (Tour tour : list) {
            if (tour instanceof Inter) {
                sumTourCharge += tour.tourCharge();
                amount++;
            }
        }
        return sumTourCharge / amount;
    }

    public Tour searchCode(String code) {
        code = code.toUpperCase();
        for (Tour tour : list) {
            if (tour.getCode().equals(code)) {
                return tour;
            }
        }
        return null;
    }

    public ArrayList<Tour> searchTitle(String title) {
        title = title.toUpperCase();
        ArrayList<Tour> listTitle = new ArrayList<>();
        for (Tour tour : list) {
            if (tour.getTitle().equals(title)) {
                listTitle.add(tour);
            }
        }
        return listTitle;
    }

    public ArrayList<Tour> searchStartDate(Date startDay) {
        ArrayList<Tour> listDate = new ArrayList<>();
        for (Tour tour : list) {
            if (startDay.compareTo(tour.getStartDate()) <= 0) {
                listDate.add(tour);
            }
        }
        return listDate;
    }

    public ArrayList<Tour> searchTransport(boolean transport) {
        ArrayList<Tour> listTransport = new ArrayList<>();
        for (Tour tour : list) {
            if (tour.isTransport() == transport) {
                listTransport.add(tour);
            }
        }
        return listTransport;
    }

    public Tour firstMinTourCharge() {
        double min = list.get(0).tourCharge();
        int temp = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).tourCharge() <= min) {
                min = list.get(i).tourCharge();
                temp = i;
            }
        }
        return list.get(temp);
    }

    public void removeCode(String code) {
        code = code.toUpperCase();
        for (Tour tour : list) {
            if (tour.getCode().equals(code)) {
                list.remove(tour);
                break;
            }
        }
    }
    
    public void removeDate(Date date){
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).getStartDate().compareTo(date) > 0){
                list.remove(i);
            }
        }
    }
    
    public void sortTour(){
        Collections.sort(list, new TourComparator(
                new SortByPrice(),
                new SortByTitle())
        );
    }
    
    public void updateTour() throws ParseException{
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy/m/d");
        String code = sc.nextLine();
        code = code.toUpperCase();
        Tour tour = searchCode(code);
        while(tour == null){
            System.out.print("Not found, enter CODE again: ");
            code = sc.nextLine();
            tour = searchCode(code);
        }
        System.out.print("Change code, -1 if you don't want to change: ");
        String temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setCode(temp.toUpperCase());
        System.out.print("Change title, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setTitle(temp.toUpperCase());
        System.out.print("Change price, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setPrice(Double.parseDouble(temp));
        System.out.print("Change transport, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setTransport(Boolean.parseBoolean(temp));
        System.out.print("Change start day, yyyy/m/d, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setStartDate(df.parse(temp));
        System.out.print("Change end day, yyyy/m/d, -1 if you don't want to change: ");
        temp = sc.nextLine();
        if(!temp.equals(String.valueOf(-1))) tour.setEndDay(df.parse(temp));
    }
    
    public void saveTourToFile(String fileName) throws IOException{
        FileOutputStream fout = new FileOutputStream(fileName);
        PrintWriter pw = new PrintWriter(fout);
        for (Tour tour : list) {
            pw.println(tour);
        }
        pw.close();
        fout.close();
    }
    
    public void loadTourFromFile(String fileName) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while(br.ready()){
            System.out.println(br.readLine());
        }
        br.close();
              
    }
}
