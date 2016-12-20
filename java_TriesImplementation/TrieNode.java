import java.util.*;
public class TrieNode {
	char c;
	HashMap<Character, TrieNode> children= new HashMap<Character, TrieNode>();
	boolean eow;
	public TrieNode(){}
	public TrieNode(char c){
		this.c= c;
	}
}
