package 그리디;

import java.util.*;
import java.util.Map.Entry;

public class 단어수학 {
	
	static ArrayList<String> arr=new ArrayList<>();
	static ArrayList<String> result=new ArrayList<>();
	static HashMap<String, Integer> map=new HashMap<String, Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n;
		int max=0, index=0;
		int ct=9, sum=0;
		n=scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String m=scan.nextLine();
			arr.add(m);
			result.add(m);
		}
		String bat[]= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for (int i = 0; i < bat.length; i++) {
			map.put(bat[i], 0);
		}
		
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).length(); j++) {
				Double ten=Math.pow(10, arr.get(i).length()-1-j);
				map.put(arr.get(i).substring(j,j+1), map.get(arr.get(i).substring(j,j+1))+ten.intValue());
			}
		}
		
		List<Entry<String, Integer>> entrylist=new LinkedList<>(map.entrySet());
		entrylist.sort(new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}
		});
		for (Entry<String, Integer> entry : entrylist) {
			map.put(entry.getKey(), ct);
			ct--;
		}
		
		for (int i = 0; i < result.size(); i++) {
			String s="";
			for (int j = 0; j < result.get(i).length(); j++) {
				s+=map.get(result.get(i).substring(j,j+1));
			}
			sum+=Integer.parseInt(s);
		}
		
		System.out.println(sum);
	}
}
