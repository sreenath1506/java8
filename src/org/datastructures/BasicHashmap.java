package org.datastructures;

import java.util.HashMap;

public class BasicHashmap<X,Y> {

    private HashEntry[] data;
    private int capacity;
    private int size;

    public BasicHashmap(int tableSize)
    {
        this.data = new HashEntry[tableSize];
        this.capacity= tableSize;
        this.size =0;
    }

    public Y getKey(X key)
    {
        int hash = calcuateHash(key);
        if(data[hash] == null)
        {
            return null;
        }
        else
        {
            return (Y)data[hash].getValue();
        }
    }

    public void put(X key,Y value)
    {
        int hash = calcuateHash(key);
        data[hash] = new HashEntry<X,Y>(key,value);
        size++;
    }

    private int calcuateHash(X key)
    {
        int hash = (key.hashCode()% this.capacity);
        while(data[hash]!=null && !data[hash].getKey().equals(key))
        {
            hash = (hash+1)%capacity;
        }
        return  hash;
    }

    private class HashEntry<X,Y> {
        private X key;

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }

        private Y value;

        public HashEntry(X key,Y value)
        {
            this.key= key;
            this.value=value;
        }


    }

    public static void main(String[] args) {
        BasicHashmap <String,String> basicHashmap = new BasicHashmap<>(11);
        basicHashmap.put("AAAAAAAAAAAAAAdfsdfgdfgsfgs","A");
        basicHashmap.put("B","B");
        basicHashmap.put("C","B");
        basicHashmap.put("D","B");
        basicHashmap.put("E","B");
        basicHashmap.put("F","B");
        basicHashmap.put("G","B");
        basicHashmap.put("H","B");
        basicHashmap.put("I","B");
        basicHashmap.put("J","B");
        basicHashmap.put("k","B");
    }
}
