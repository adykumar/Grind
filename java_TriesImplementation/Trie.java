import java.util.*;
public class Trie {
	private TrieNode root;
	public Trie(){
		root= new TrieNode();
	}
	
	// insert a word into the trie
	public void insert(String word){
		HashMap<Character,TrieNode> children= root.children;
		for(int i=0;i<word.length();i++) {
			char c= word.charAt(i);
			
			TrieNode t;
			if(children.containsKey(c)){
				t= children.get(c);
			}
			else{
				t= new TrieNode(c);
				children.put(c, t);
			}
			children= t.children;
			if (i== word.length()-1) t.eow= true;
		}
	}
	// search if word in trie
	public boolean search(String word){
		TrieNode t= root;		
		for(int i=0;i<word.length();i++) {
			char c= word.charAt(i);
			if(t.children.containsKey(c)) t=t.children.get(c);
			else return false;
		}
		return t.eow;
		
	}
	
	public boolean startswith(String word){
		TrieNode t= root;
		for(int i=0;i<word.length();i++){
			char c= word.charAt(i);
			if(t.children.containsKey(c)) t=t.children.get(c);
			else return false;
		}
		return true;
	}
}
