package com.JCF;

import com.JCF.Classes.CollectionDecorator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        CollectionDecorator a = new CollectionDecorator(new Vector<Long>());
        CollectionDecorator b = new CollectionDecorator(new Vector<Long>());
        a.add(2);
        b.add(2);

    }
}