package oop.inheritanceExample.modArrayList;

import java.util.ArrayList;

public class ModArrayLIst<D> extends ArrayList<D> {

    public D getIsngMod(int index){
        int validIndex = Math.abs(index)%this.size();
        return this.get(validIndex);
    }



}
