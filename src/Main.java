import telephoneDirectory.Telephone;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("ДЗ1 Задание-1.");
        Telephone phone1 = new Telephone("Дмитрий Большаков","9(699)407-84-86");
        Telephone phone2 = new Telephone("Владимир Серебряков","6(186)156-27-09");
        Telephone phone3 = new Telephone("Фёдор Лазарев","9(042)441-06-90");
        Telephone phone4 = new Telephone("Александра Белкина","9(968)185-92-46");
        Telephone phone5 = new Telephone("Ульяна Головина","3(350)928-61-81");
        Telephone phone6 = new Telephone("Александр Носов","8(643)387-63-36");
        Telephone phone7 = new Telephone("Ксения Николаева","3(443)396-11-30");
        Telephone phone8 = new Telephone("Анастасия Маслова","9(748)872-40-50");
        Telephone phone9 = new Telephone("Григорий Серов","8(401)548-16-95");
        Telephone phone10 = new Telephone("Елена Андреева","4(879)277-42-70");
        Telephone phone11 = new Telephone("Наталья Богданова","+7(812)100-37-85");
        Telephone phone12 = new Telephone("Мария Румянцева","+7(812)429-49-10");
        Telephone phone13 = new Telephone("Иван Кондратьев","+7(812)970-68-20");
        Telephone phone14 = new Telephone("Андрей Сорокин","+7(812)339-03-26");
        Telephone phone15 = new Telephone("Виктория Юдина","+7(812)378-06-33");
        Telephone phone16 = new Telephone("Кира Любимова","+7(812)535-55-68");
        Telephone phone17 = new Telephone("Ксения Кудрявцева","+7(812)491-22-21");
        Telephone phone18 = new Telephone("Алиса Сергеева","+7(812)515-84-22");
        Telephone phone19 = new Telephone("Кирилл Сидоров","+7(812)017-64-17");
        Telephone phone20 = new Telephone("Анастасия Гордеева","+7(812)536-00-55");

        Map<String,String> guide = new HashMap<>();
        guide.put(phone1.getName(),phone1.getNumber());
        guide.put(phone2.getName(),phone2.getNumber());
        guide.put(phone3.getName(),phone3.getNumber());
        guide.put(phone4.getName(),phone4.getNumber());
        guide.put(phone5.getName(),phone5.getNumber());
        guide.put(phone6.getName(),phone6.getNumber());
        guide.put(phone7.getName(),phone7.getNumber());
        guide.put(phone8.getName(),phone8.getNumber());
        guide.put(phone9.getName(),phone9.getNumber());
        guide.put(phone10.getName(),phone10.getNumber());
        guide.put(phone11.getName(),phone11.getNumber());
        guide.put(phone12.getName(),phone12.getNumber());
        guide.put(phone13.getName(),phone13.getNumber());
        guide.put(phone14.getName(),phone14.getNumber());
        guide.put(phone15.getName(),phone15.getNumber());
        guide.put(phone16.getName(),phone16.getNumber());
        guide.put(phone17.getName(),phone17.getNumber());
        guide.put(phone18.getName(),phone18.getNumber());
        guide.put(phone19.getName(),phone19.getNumber());
        guide.put(phone20.getName(),phone20.getNumber());

        for (Map.Entry<String, String> stringStringEntry : guide.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " / " + stringStringEntry.getValue());
        }
        System.out.println("################");


        System.out.println("ДЗ1 Задание-3.");
        Map<String,Integer> str = new HashMap<>();
        putStr(str,"число",14);
        putStr(str,"число",16);
        putStr(str,"число1",14);
        putStr(str,"число2",15);

        for (Map.Entry<String, Integer> stringIntegerEntry : str.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " / " + stringIntegerEntry.getValue());
        }
        System.out.println("################");


        System.out.println("ДЗ2 Задание-1.");
        Map<String, List<Integer>> listMap = new HashMap<>();
        listMap.put("string1",List.of(11,12,13));
        listMap.put("string2",List.of(17,14,139));
        listMap.put("string3",List.of(112,342,89));
        listMap.put("string4",List.of(15,772,190));
        listMap.put("string5",List.of(6,15,999));

        Map<String, Integer> listMap1 = new HashMap<>();
        for (Map.Entry<String, List<Integer>> stringListEntry : listMap.entrySet()) {
            listMap1.put(stringListEntry.getKey(), stringListEntry.setValue(stringListEntry.getValue()).stream().reduce(0, Integer::sum));
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : listMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " / " + stringIntegerEntry.getValue());
        }
        System.out.println("################");

        System.out.println("ДЗ2 Задание-1.");
        Map<Integer, String> someNumbers = new LinkedHashMap<>();
        someNumbers.put(1,"Number1");
        someNumbers.put(2,"Number2");
        someNumbers.put(3,"Number3");
        someNumbers.put(4,"Number4");
        someNumbers.put(5,"Number5");
        someNumbers.put(6,"Number6");
        someNumbers.put(7,"Number7");
        someNumbers.put(8,"Number8");
        someNumbers.put(9,"Number9");
        someNumbers.put(10,"Number10");

        for (Map.Entry<Integer, String> integerStringEntry : someNumbers.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " / " + integerStringEntry.getValue());
        }
        System.out.println("################");

    }
    public static void putStr(Map<String,Integer> str,String s,Integer i) {
        if (str.containsKey(s) && str.containsValue(i)){
            throw new RuntimeException(str + " ключ уже есть и значения совпадают.");
        }
        str.put(s,i);
    }
}