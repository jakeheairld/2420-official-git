package assign09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K,V> implements Map<K,V> {

	final private int loadFactorThreshold = 10;
	private int capacity; // The number of cells in the hash table
	private int elemCount; // The number of items in the HashTable (N)
	private ArrayList<LinkedList<MapEntry<K,V>>> backArray; // The backing array for the HashTable
	
	//Assignment 9 requirement, keep load factor less than 10.
	//With a hash table using chaining, its operations are O(load factor) so if load factor is less than 10 it is O(1).
	//If load factor is 10 or more we have to increase the number of cells.
	
	public HashTable() {
		backArray = new ArrayList<LinkedList<MapEntry<K,V>>>();
		capacity = 10;
		for(int i = 0; i < capacity; i++) {
			backArray.add(new LinkedList<MapEntry<K,V>>());
		}
	}
  
	public void rehash() {
		
		
	}
	
	public int hash(int value) {
		return (Integer)value%capacity;
	}
	
	@Override
	public void clear() {
		backArray = new ArrayList<LinkedList<MapEntry<K,V>>>();
		capacity = 10;
		for(int i = 0; i < capacity; i++) {
			backArray.add(new LinkedList<MapEntry<K,V>>());
		}
	}

	@Override
	public boolean containsKey(K key) {
		
		
		
		
		return false;
	}

	@Override
	public boolean containsValue(V value) {
		int index = hash(value.hashCode())%capacity;
		LinkedList<MapEntry<K,V>> list = backArray.get(index);
		
		
		

		return false;
	}

	@Override
	public List<MapEntry<K, V>> entries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V put(K key, V value) {
		this.elemCount++;
		if((double)elemCount/capacity > loadFactorThreshold) {
			capacity *= 2;
			rehash();
		} 

		
		
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
