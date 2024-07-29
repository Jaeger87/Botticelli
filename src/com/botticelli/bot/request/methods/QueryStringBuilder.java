package com.botticelli.bot.request.methods;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

class QueryStringBuilder {
	
	
	public static String createToQueryString(Map<String,Object> map)
	{
		StringBuilder sb = new StringBuilder();
		if (map == null || map.isEmpty())
			return "";
		
		for(Entry<String, Object> e : map.entrySet())
		{
			if(e.getValue() != null && e.getKey() != null )
				try {
					sb.append('&'
							+ e.getKey()
							+ '='
							+ URLEncoder.encode(e.getValue().toString(),
									"UTF-8"));
				} catch (UnsupportedEncodingException e1) {
					e1.printStackTrace();
				}
		}
		return sb.toString().length() > 0 ? sb.toString().substring(1, sb.toString().length()) : "";
	}
}
