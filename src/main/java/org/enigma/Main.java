package org.enigma;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]){
        ArrayList<EnigmaSpecifications> list = new ArrayList<>();
        list.add(EnigmaSpecifications.ROTORC_I);
        int[] startPositions = new int[list.size()];

        for(int i = 0; i < startPositions.length; i++){
            startPositions[i] = 0;
        }

        Machine m = new Machine(list, startPositions);
        String msg = m.processMessage("ciao");

        System.out.println(msg);
        Machine n = new Machine(list, startPositions);
        msg = n.processMessage(msg);
        System.out.println(msg);
    }

}