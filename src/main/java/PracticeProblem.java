public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String [] selectionSortName(String [] names, int [] ages){
		int tempNum;
		String tempName;
		int min;
		for (int i = 0;i < names.length - 1;i ++){
			min = i;
			for (int j = i + 1;j < names.length;j++){
				if ((names[j].compareToIgnoreCase(names[min]) < 0)){
					min = j;
				}
			}
			tempName = names[min];
			names[min] = names[i];
			names[i] = tempName;
			tempNum = ages[min];
			ages[min] = ages[i];
			ages[i] = tempNum;
		}
		return names;
	}
	public static int [] selectionSortAge(String [] names, int [] ages){
		int tempNum;
		String tempName;
		int min;
		for (int i = 0;i < names.length - 1;i++){
			min = i;
			for(int j = i + 1;j < names.length;j++){
				if (ages[j] < ages[min]){
					min = j;
				}
			}
			tempName = names[min];
			names[min] = names[i];
			names[i] = tempName;
			tempNum = ages[min];
			ages[min] = ages[i];
			ages[i] = tempNum;
		}
		return ages;
	}
}