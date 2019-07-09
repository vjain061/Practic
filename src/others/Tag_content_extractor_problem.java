package others;

import java.util.LinkedList;
import java.util.List;

public class Tag_content_extractor_problem {

	public static void main(String[] args) {
		String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		List<String> tagList = new LinkedList<>();
		
		for (int i = 0; i < line.length(); i++) {
			
			if (line.charAt(i) == '<') {
				String tag = "";
				
				for (int j = i + 1; j < line.length(); j++) {
					if (line.charAt(j) != '>') {
						tag += line.charAt(j);
					} else  {
						break;
					}
				}
				
				tagList.add(tag);
			}
		}
		
		Object[] arrayOfTagList =  tagList.toArray();
		for (int i = 0; i < arrayOfTagList.length; i++) {
			for (int j = i+1; j < arrayOfTagList.length; j++) {
				if(arrayOfTagList[i].toString().length()+1 == arrayOfTagList[j].toString().length()){
					
					String firstString = arrayOfTagList[i].toString();
					String secondString = arrayOfTagList[j].toString().substring(1, arrayOfTagList[j].toString().length());
					if(firstString.equals(secondString)){
						arrayOfTagList[i] = "0";
						arrayOfTagList[j] = "0";
						break;
					}
				}
			}
		}
		
		int checkTheTag = 1;
		for (int i = 0; i < arrayOfTagList.length; i++) {
			if(arrayOfTagList[i].toString().equals("0")){
				checkTheTag = 0;
			}else{
				checkTheTag = 1;
				break;
			}
			
		}
		
		if (checkTheTag == 0) {
			for (int i = 0; i < line.length(); i++) {

				if (line.charAt(i) == '>' && i != line.length() - 1 && line.charAt(i + 1) != '<') {
					for (int j = i + 1; j < line.length(); j++) {
						if (line.charAt(j) == '<') {
							break;
						}
						System.out.print(line.charAt(j));
					}
					System.out.println();
				}

			}
		}else{
			System.out.println("None");
		}
		
		
	}

}
