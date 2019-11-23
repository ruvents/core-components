package com.ruvents.components.utils;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Map;

public class StringUtils
{
	/**
	 * Используется для {@link StringUtils#formatMap(Map)}
	 */
	private static final CharSequence DELIMITER
		= "\n\t - ";
	
	/**
	 * Преобразование переданного Map в удобочитаемый вид.
	 */
	public static String formatMap(@NonNull Map map) {
		var result
			= new ArrayList<String>();
		
		var maxKeyLength = 0;
		for (var key : map.keySet())
			if (maxKeyLength < key.toString().length())
				maxKeyLength = key.toString().length();
		
		for (var key : map.keySet())
			result.add(String.format("%1$" + maxKeyLength + "s: %s",
				key,
				map.get(key)));
		
		return DELIMITER + String.join(DELIMITER, result);
	}
}
