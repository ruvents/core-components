package com.ruvents.components.builders;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder<K, T>
{
	private final HashMap<K, T> map
		= new HashMap<>();
	
	public static MapBuilder<String, Object> create() {
		return new MapBuilder<>();
	}
	
	public MapBuilder<K, T> put(K param, T value) {
		if (param == null)
			throw new IllegalArgumentException("Название параметра не может быть пустым");
		
		map.put(param, value);
		
		return this;
	}
	
	public MapBuilder<K, T> putOptional(K param, T value) {
		if (param == null)
			throw new IllegalArgumentException("Название параметра не может быть пустым");
		
		if (value != null)
			map.put(param, value);
		
		return this;
	}
	
	public Map<K, T> build() {
		return map;
	}
}
