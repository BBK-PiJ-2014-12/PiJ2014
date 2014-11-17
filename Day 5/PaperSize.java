import java.util.Scanner;

class PaperSize{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String type = in.next();
		
		Paper paper = new Paper();
		paper.paperSize(type);
		System.out.println(paper.sizeA + "mm + " + paper.sizeB + "mm");
	}	
}