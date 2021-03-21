package ru.tinkoff.fintech.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    private static final ArrayList<Boy> boys = new ArrayList<>() {{
        add(new Boy("Николай", 68));
        add(new Boy("Пётр", 53));
        add(new Boy("Василий", 25));
        add(new Boy("Михаил", 19));
        add(new Boy("Алексей", 6));
        add(new Boy("Николай", 86));
        add(new Boy("Пётр", 35));
        add(new Boy("Михаил", 111));
        add(new Boy("Алексей", 22));
        add(new Boy("Михаил", 1));
        add(new Boy("Яков", 30));
    }};

    public static void main(String[] args) {

        List<Boy> fullAgeBoys = boys
                .stream()
                .filter(boy -> boy.getAge() >= 18)
                .collect(Collectors.toList());

        List<String> filtered = fullAgeBoys
                .stream()
                .map(boy -> boy.getName())
                .distinct()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());

        Map<String, Integer> boysInfo = new HashMap<String, Integer>();
        for (String name : filtered) {

            for (Boy boy1 : boys) {
                if (name.equals(boy1.getName())) {
                    if (!boysInfo.containsKey(name)) {
                        boysInfo.put(name, 0);
                    } else {
                        int count = boysInfo.get(name);
                        boysInfo.replace(name, ++count);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> item : boysInfo.entrySet()) {
            System.out.println(item.getKey() + " = " + item.getValue());
        }
    }

}



