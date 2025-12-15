class WordDictionary {

    public static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean endOfWord = false;
    }

    private final TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = this.root;
        char[] wordArray = word.toCharArray();
        for (char c : wordArray) {
            int index = c - 97;
            TrieNode next = current.children[index] != null ? current.children[index] : new TrieNode();
            current.children[index] = next;
            current = next;
        }
        current.endOfWord = true;
    }

    public boolean search(String word) {
//        return searchInner(word, this.root);
        char[] wordArr = word.toCharArray();
        return searchFromNode(wordArr, 0, this.root);
    }

    public boolean searchFromNode(char[] wordArr, int index, TrieNode node) {
        if (index == wordArr.length) {
            return node.endOfWord;
        } else if (wordArr[index] == '.') {
            for (TrieNode next : node.children) {
                if (next != null) {
                    if (searchFromNode(wordArr, index+1, next)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            int letter = (wordArr[index] - 'a');
            TrieNode next = node.children[letter];
            if (next == null) {
                return false;
            } else {
                return searchFromNode(wordArr, index + 1, next);
            }
        }
    }

    public static void main(String[] args) {
        // Helper-функция для красивого вывода тестов
        class Tester {
            static void testSearch(WordDictionary wd, String word, boolean expected) {
                boolean actual = wd.search(word);
                // Форматированный вывод для наглядного сравнения
                System.out.printf("search(\"%s\"): Actual: %b | Expected: %-5b | %s\n",
                        word, actual, expected, actual == expected ? "PASS" : "FAIL");
            }
        }

        // --- Начало тестового сценария ---

        // ["WordDictionary"] -> null
        WordDictionary wordDictionary = new WordDictionary();
        System.out.println("1. WordDictionary created.");
        System.out.println("---------------------------------------------------");

        // ["addWord", "at"] -> null
        wordDictionary.addWord("at");
        // ["addWord", "and"] -> null
        wordDictionary.addWord("and");
        // ["addWord", "an"] -> null
        wordDictionary.addWord("an");
        // ["addWord", "add"] -> null
        wordDictionary.addWord("add");
        System.out.println("2-5. Added words: \"at\", \"and\", \"an\", \"add\"");
        System.out.println("---------------------------------------------------");

//         ["search", "a"] -> false
        Tester.testSearch(wordDictionary, "a", false);

        // ["search", ".at"] -> false (на данный момент нет слов, подходящих под шаблон ".at")
        Tester.testSearch(wordDictionary, ".at", false);
        System.out.println("---------------------------------------------------");

        // ["addWord", "bat"] -> null
        wordDictionary.addWord("bat");
        System.out.println("8. Added word: \"bat\"");
        System.out.println("---------------------------------------------------");

        // ["search", ".at"] -> true (теперь шаблон ".at" совпадает со словом "bat")
        Tester.testSearch(wordDictionary, ".at", true);

        // ["search", "an."] -> true (шаблон "an." совпадает со словом "and")
        Tester.testSearch(wordDictionary, "an.", true);

        // ["search", "a.d."] -> false (нет слов, подходящих под шаблон "a.d.")
        Tester.testSearch(wordDictionary, "a.d.", false);

        // ["search", "b."] -> false (нет слов, подходящих под шаблон "b.")
        Tester.testSearch(wordDictionary, "b.", false);

        // ["search", "a.d"] -> true (шаблон "a.d" совпадает со словом "add")
        Tester.testSearch(wordDictionary, "a.d", true);


        // ["search", "."] -> false (нет слов из одной буквы)
        Tester.testSearch(wordDictionary, ".", false);
        Tester.testSearch(wordDictionary, "...", true);
        System.out.println("---------------------------------------------------");
    }

    public static void main2(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("apple");
        wordDictionary.addWord("bpple");
        wordDictionary.addWord("abble");
        wordDictionary.search("abble");
//        wordDictionary.search("a");
//        wordDictionary.search("a.ble");
//        wordDictionary.search("a");
        wordDictionary.addWord("at");
        System.out.println(wordDictionary.search(".t"));
        System.out.println();
    }
}