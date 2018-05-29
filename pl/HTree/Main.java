package pl.HTree;

public class Main {

	public static void main(String[] args) {
		String text = "ala ma lale";

		
		int[] charFrequencies = new int[256];
		for (char c : text.toCharArray()) {
			charFrequencies[c]++;
		}


		System.out.println(text);
		HuffmanTree tree = HuffmanTree.buildHuffmanTree(charFrequencies);
		System.out.printf("size before compression = %d%n", text.length() * 8);
		String incoded = tree.incode(text);
		System.out.println("incoded result = " + incoded);
		System.out.printf("size after compression = %d%n", incoded.length());
		String decoded = tree.decode(incoded);
		System.out.println(decoded);

		tree.printCodes();
	}

}
