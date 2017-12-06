/** An implementation of an ADT Dictionary using an array
	@author Elshaday Assefa
	@version 1.0
	*/
	import java.util.Arrays;
	import java.util.Iterator;
	import java.util.NoSuchElementException;
	
	public class SortedArrayDictionary<K extends Comparable<? super K>, V> implements DictionaryInterface<K,V> {
		private Entry<K,V>[] dictionary;
		private int numberOfEntries;
		private boolean initialized = false;
		private final static int DEFAULT_CAPACITY = 10;
		private final static int MAX_CAPACITY = 10000;
		
		
		
		public SortedArrayDictionary() {
			this(DEFAULT_CAPACITY);
			
		}
		
		public SortedArrayDictionary(int initialCapacity) {
			
			
			@SupressWarnings("unchecked")
			Entry<K, V>[] tempDictionary = (Entry<K, V>[])new Entry[initialCapacity];
			dictionary = tempDictionary;
			numberOfEntries = 0;
		}
		
		public V add(K key, V value) {
			
			if((key == null) || (value == null))
				throw new IllegalArgumentException("Cannot add null to a dictionary.");
			else
			{ 
				V result = null;
				int keyIndex = locateIndex(key);
				if(keyIndex < numberOfEntries)
				{
						result = dictionary[keyIndex].getValue();
						dictionary[keyIndex].setValue(value);
				}
				else
				{
					makeRoom(keyIndex);
					dictionary[keyIndex] = new Entry<>(key, value);
					numberOfEntries++;
					
				}
			return result;
			}
		}
		
		public V remove(K key) {
			
			V result = null;
			int keyIndex = locateIndex(key);
			if(keyIndex < numberOfEntries) {
				result = dictionary[keyIndex].getValue();
				dictionary[keyIndex] = dictionary[numberOfEntries - 1];
				dictionary[numberOfEntries - 1] = null;
			}
			return result;
		}
		
		public V getValue(K key) {
			
			int keyIndex = locateIndex(key);
			V result = null;
			
		}
		public boolean contains(K key) {
			int keyIndex = locateIndex(key);
			if((keyIndex < numberOfEntries) && (dictionary[keyIndex] != null)) {
				return true;
			}
		}
		
		public Iterator<K> getKeyIterator() {
			Iterator<K> iter = new Iterator<K>() {
				private int i  = 0;
				
				public boolean hasNext() {
					if( i< getSize()) {
						return true;
					}
					return false;
				}
				public K next() {
					return dictionary[i++].getKey();
				}
				public void remove() {
					// unsupported operation
				}
				
			};
			return iter;
		}
		
		public Iterator<V> getValueIterator() {
			Iterator<V> iter = new Iterator<V>() {
				private int i=0;
				public boolean hasNext() {
					if(i< getSize()) {
						return true;
					}
					return false;
				}
				public V next() {
					return dictionary[i++].getValue();
				}
				public void remove() {
					//unsupported operation
					}
				};
				return iter;
		}
		
		public int getSize() {
			return numberOfEntries;
		}
		
		public void clear() {
			for(int i = 0; i < dictionary.length; i++) {
				dictionary[i] = null;
			}
		}
		
		private int locateIndex(K key) {
			int index = 0;
			while((index < numberOfEntries) && key.compareTo(dictionary[index].getKey())) 
				index++;
			return index;
		}
		
		private void makeRoom(int keyIndex) {
			for(int i = numberOfEntries; i > keyIndex; i--) {
				dictionary[i] = dictionary[i-1];
			}
		}
		
		
		
		
		
		
 	private class Entry<K, V>
	
	{
		private K key;
		private V value;
		
		
		private Entry(K searchKey, V dataValue)
		{
			key = searchKey;
			value = dataValue;
		}
		
		private K getKey()
		{
			return key;
		}
		
		private V getValue()
		{
			return value;
		}
		
		
		private void setValue(V newValue)
		{
			 value = newValue;
		}
		
		
		
		
		private void removeEntry()
		{
			key = null;
			value = null;
			
		}
	}
 	
 	
 		
 		
 	
 		
 	}
 	
	}