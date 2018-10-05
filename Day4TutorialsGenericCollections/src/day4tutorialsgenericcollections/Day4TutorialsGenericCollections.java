/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4tutorialsgenericcollections;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


public class Day4TutorialsGenericCollections {

    public static void main(String[] args) {
        
//        List<String> names = getNames();
//        
//        for(String name : names){
//            System.out.println("the length of the name is " + name.length());
//        }
//        System.out.println(lotteryNumbers().size());
//        
        HashMap<Integer,TaxPayer> tp = getTaxPayer();
        
        for (Integer t : tp.keySet()) {
            System.out.println(tp.get(t));
            
        }
        double input = 32.4445435;
        System.out.println(getFormattedCurrency(Locale.UK, 32.9999));
        

    }
    
    private static HashMap<Integer,TaxPayer> getTaxPayer(){
        HashMap<Integer,TaxPayer> taxPayers = new HashMap<>();
        
        taxPayers.put(34563452, new TaxPayer());
        taxPayers.put(34563452, new TaxPayer());
        taxPayers.put(34563455, new TaxPayer());
        taxPayers.put(34563454, new TaxPayer());
        taxPayers.put(34563453, new TaxPayer());
        
        return taxPayers;
    }
    
    private static Set<Integer> lotteryNumbers(){
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);//values are boxed to reference types
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);    
        return numbers;
    }
    private static String getFormattedCurrency(Locale locale, double amount){
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            return currencyFormatter.format(amount);
    }

    protected static List<String> getNames() {
        List<String> names = new ArrayList(); //Instantiate the list
        //Add items to the list
        names.add("John");
        names.add("John");
        names.add("Johnny");
        
        return names;
    }
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
}
