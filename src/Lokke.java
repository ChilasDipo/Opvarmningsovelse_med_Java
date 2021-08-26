import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lokke {
    int counter = 0;
    double number=0;
    ArrayList<Double> numberList = new ArrayList<>();


    public static void main(String[] args) {
        Lokke lokke = new Lokke();
        boolean stop = false;
        while (!stop){
            Scanner s = new Scanner(System.in);
            System.out.println("INput et tail");
            String input = s.nextLine();
            String temp = lokke.program(input);
            if (temp.equals("Stop")){
                System.out.println("Killing You Now");
                stop = true;
            }

            System.out.println(temp);

        }


    }
        public String program(String input){
            double gennemsnitTal;
                if (input.equals("q") | input.equals("Q")) {
                    System.out.println("Killing You Now");
                    return "Stop";
                }
                Pattern p = Pattern.compile("[a-z&&[^qQ]]");  //Checks if input is between a and z except Q And q
                // Pattern p = Pattern.compile("[0-9]"); // dosent work with nubmers higher than 9
                Matcher m = p.matcher(input);
                if (m.matches()) {
                    System.out.println("Fail");
                    return "Fail";
                } else {
                    System.out.println("Not fail");
                    numberList.add(Double.parseDouble(input));
                }

            gennemsnitTal = gennemsnitTal(numberList);
                System.out.println("Gennemsnit er " + gennemsnitTal);

            return  String.valueOf(gennemsnitTal(numberList));
        }

        double gennemsnitTal(ArrayList<Double> numberList){
            double gennemsnitTal = 0;
            for (int i = 0; i <numberList.size() ; i++) {
                gennemsnitTal += numberList.get(i);
            }
            return gennemsnitTal/numberList.size();
        }



        }








