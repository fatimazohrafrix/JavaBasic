package ma.education.tp5.collections;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<Integer>();
        list1.add(12);
        list1.add(23);
        list1.add(23);
        list1.add(12);
        // La boucle for avancée
        System.out.println("La boucle for each ou for avancée");
        for(Integer e :list1){
            System.out.println(" element "+e);
        }
        // Un iterateur
        System.out.println("La boucle iterateur");
        Iterator<Integer> iter = list1.iterator();
        while(iter.hasNext()){
            Integer e = iter.next();
            System.out.println("element : "+e);
        }
        // La méthode forEach de la List
        System.out.println("La méthode forEach de la List");
        list1.forEach(i-> System.out.println(" element "+i));
        System.out.println("-------------------list 2-------------------------------------------");

        List<Integer> list2= Arrays.asList(1,5,6,9,16);
        list2.stream().map(i->i*i).filter(i->i>37).forEach(i->System.out.println(i));


        System.out.println("----------------------------list 3----------------------------------");
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(i-> System.out.println(i));

    }
}
