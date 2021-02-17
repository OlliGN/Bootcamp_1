#### Map interface
A Map is an object that maps keys to value.
A map cannot contain duplicate keys.

## HashMap
HashMap maps a key and a value. 
It does not guarantee any order of the elements stored internally in the map.
HashMap is faster than TreeMap, bc not sorted.

## TreeMap
TreeMap also maps a key and a value. 
But it guarantees the order in which keys or values are iterated - which is the sort order of the keys or values. 

# put()
map.put(key, value) ---> adds an element to the Map.
A given key can only occur in a Java Map one time.
If you call put() more than once with the same key,the latest value replaces the existing value for the given key.
You can use the value null as a key in a Java Map

# get()
map.get(key) ---> retrieves the stored value for a key, or null if that key is not present in the map.

# containsKey()
map.containsKey(key) ---> returns true if the key is in the map, false otherwise.

# remove()
map.remove(key) ---> removes the key/value pair for this key if present. 
Does nothing if the key is not present.