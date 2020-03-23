package io.turntablUnit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
public class Register {
    private final Level nameables;
    private List<Nameable> Nameables;

    public Register(Level nameables){
        this.nameables = nameables;
    }
   
    public List<String> getRegisterByLevel(Level level) {
        List<String> names = new ArrayList<>();
        this.Nameables.stream()
                .filter(nameable -> nameable.getLevel()
                        .equals(level))
                .forEach(nameable -> names.add(nameable.getName()));
        return names;
    }

    public String PrintPReport(){
        if (this.nameables.size()== 1){
            return this.nameables.get(0).getName;
        }
        return this.nameables
                .stream()
                .sorted(Comparator.comparing(Nameables::getLevel))
                .reduce("", (MidResults, nameable) -> MidResults + nameable.getName() + "," , String::concat);

    }
}
