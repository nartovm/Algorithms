class Trie {
    TrieNode startNode = new TrieNode();

    class TrieNode {
        boolean endOfWord = false;
        TrieNode[] listOfConnections = new TrieNode[26];
    }

    public Trie() {

    }

    public void insert(String word) {
        char[] arr = word.toCharArray();
        TrieNode current = startNode;
        for (char c : arr) {
            TrieNode next = current.listOfConnections[c - 97];
            if (next == null) {
                next = new TrieNode();
                current.listOfConnections[c - 97] = next;
            }
            current = next;
        }
        current.endOfWord = true;
    }

    private TrieNode innerSearch(String word) {
        char[] arr = word.toCharArray();
        TrieNode current = startNode;
        for (char c : arr) {
            TrieNode next = current.listOfConnections[c - 97];
            if (next == null) {
                return null;
            } else {
                current = next;
            }
        }
        return current;
    }

    public boolean search(String word) {
        TrieNode current = innerSearch(word);
        if (current == null) {
            return false;
        }
        return current.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = innerSearch(prefix);
        return current != null;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}