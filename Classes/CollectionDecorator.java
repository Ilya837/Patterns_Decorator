package com.JCF.Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionDecorator implements Collection{

    protected Collection Collect;

    public CollectionDecorator(Collection collect){
        Collect = collect;
    }

    private void log(String name) throws IOException {
        try(FileWriter writer = new FileWriter("D:\\Projects\\Patterns\\JCF\\src\\com\\JCF\\LogFile\\log.txt",true))
        {
            Calendar calendar = Calendar.getInstance();
            String text = calendar.getTime().toString() + " " + name + " " + this.hashCode() + '\n';
            writer.write(text);

            writer.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }


    @Override
    public int size() {
        try {
            this.log("size()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.size();
    }

    @Override
    public boolean isEmpty() {
        try {
            this.log("isEmpty()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        try {
            this.log("contains(Object o)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.contains(o);
    }

    @Override
    public Iterator iterator() {
        try {
            this.log("iterator()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.iterator();
    }

    @Override
    public Object[] toArray() {
        try {
            this.log("toArray()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.toArray();
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        try {
            this.log("toArray(IntFunction generator)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.toArray(generator);
    }

    @Override
    public boolean add(Object o) {
        try {
            this.log("add(Object o)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.add(o);
    }

    @Override
    public boolean remove(Object o) {
        try {
            this.log("remove(Object o)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        try {
            this.log("addAll(Collection c)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.addAll(c);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        try {
            this.log("removeIf(Predicate filter)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.removeIf(filter);
    }

    @Override
    public void clear() {
        try {
            this.log("clear()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Collect.clear();
    }

    @Override
    public Spliterator spliterator() {
        try {
            this.log("spliterator()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.spliterator();
    }

    @Override
    public Stream stream() {
        try {
            this.log("stream()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.stream();
    }

    @Override
    public Stream parallelStream() {
        try {
            this.log("parallelStream()");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.parallelStream();
    }

    @Override
    public boolean retainAll(Collection c) {
        try {
            this.log("retainAll(Collection c)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        try {
            this.log("removeAll(Collection c)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        try {
            this.log("containsAll(Collection c)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        try {
            this.log(" toArray(Object[] a)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Collect.toArray(a);
    }
}
