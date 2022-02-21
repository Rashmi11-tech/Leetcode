class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
         List<List<String>> ans= new ArrayList<>();
        
        TreeMap<Integer, Map<String,Integer>> map = new TreeMap<>();
        
        
       for(List<String> o : orders){
            int table = Integer.valueOf(o.get(1));
            String foodName = o.get(2);
           if(map.containsKey(table)) {
        	   Map<String,Integer> foodMap = map.get(table);
        	   if(foodMap.containsKey(foodName)) {
        		   foodMap.put(foodName, foodMap.get(foodName) + 1);
        	   }else {
        		   foodMap.put(foodName, 1);
        	   }
           }else {
        	   Map<String,Integer> foodMap = new HashMap<>();
        	   foodMap.put(foodName, 1);
        	   map.put(Integer.valueOf(table), foodMap);
           }
        }
        
        Set<String> headerSet = new HashSet<>();
        for(Integer key : map.keySet()) {
        	for(String k : map.get(key).keySet()) {
        		headerSet.add(k);
        	}
        }
        
        List<String> header = new ArrayList<>();
        for(String s : headerSet) {
        	header.add(s);
        }
        Collections.sort(header);
        header.add(0, "Table");
        ans.add(header);
        for(Integer key : map.keySet()) {
        	List<String> body = new ArrayList<>();
        	Map<String, Integer> food = map.get(key);
        	body.add(String.valueOf(key));
        	List<String> fo = new ArrayList<>();
        	for(String k : food.keySet()) {
        		fo.add(k);
        	}
        	Collections.sort(fo);
        	
        	for(String s : header) {
        		if(!s.equals("Table")) {
	        		if(fo.contains(s)) {
	        			body.add(String.valueOf(food.get(s)));
	        		}else {
	        			body.add("0");
	        		}
        		}
        	}
        	ans.add(body);
        }
        
        
        return ans;
    }
}