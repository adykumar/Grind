
public class Main {
	public static void main(String args[]){
		Trie t= new Trie();
		t.insert("fail");
		t.insert("pass");
		t.insert("pas");
		System.out.println(t.search("fail"));
		System.out.println(t.startswith("passs"));
	}
}
