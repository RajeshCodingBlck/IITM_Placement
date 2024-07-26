package HashMap_demo;

import java.util.LinkedList;

public class MyHashMap {

	LinkedList<Entry>[] arr;

	MyHashMap() {
		arr = new LinkedList[5];
		for (int i = 0; i < 5; i++) {

			arr[i] = new LinkedList();
			// System.out.println(arr[i]);
		}
	}

	public int hashFunction(String key) {

		int hashValue = key.hashCode();
		int index = Math.abs(hashValue) % arr.length;
		return index;

	}
	// Behaviour

	public boolean containsKey(String key) {

		int index = hashFunction(key);
		LinkedList<Entry> list = arr[index];

		for (Entry e : list) {

			if (e.key.equals(key)) {
				return true;
			}
		}
		return false;
	}

	public void put(String key, int value) {

		int index = hashFunction(key);
		LinkedList<Entry> list = arr[index];
		if (containsKey(key) == true) {
			for (Entry e : list) {
				if (e.key.equals(key)) {
					e.value = value;
				}
			}
		} else {
			Entry e = new Entry(key, value);
			list.add(e);
		}
	}

	public int get(String key) {

		int index = hashFunction(key);
		LinkedList<Entry> list = arr[index];
		for (Entry e : list) {

			if (e.key.equals(key)) {
				return e.value;
			}
		}
		return -1;
	}

	public int size() {

		int size = 0;
		for (int i = 0; i < arr.length; i++) {

			LinkedList<Entry> list = arr[i];
			size += list.size();
		}
		return size;

	}

	@Override
	public String toString() {

		String ans = "[";
		for (int i = 0; i < arr.length; i++) {

			LinkedList<Entry> list = arr[i];
			
			for( Entry e : list) {
				
				String currEntry= "{"+ e.key+ "="+ e.value+ "}";
				ans+= ","+ currEntry;
			}
		}
		ans+="]";
		
		return ans;
	}

}
