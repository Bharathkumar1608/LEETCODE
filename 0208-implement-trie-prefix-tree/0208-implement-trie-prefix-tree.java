class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.links[ch-'a']==null){
                node.links[ch-'a']=new TrieNode();
            }
            node=node.links[ch-'a'];
        }
        node.flag=true;
    }
    
    public boolean search(String word) {
        TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(node.links[ch-'a']==null){
                return false;
            }
            node=node.links[ch-'a'];
        }
        return node.flag;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node =root;
        for(int i=0;i<prefix.length();i++){
            char ch=prefix.charAt(i);
            if(node.links[ch-'a']==null){
                return false;
            }
            node=node.links[ch-'a'];
        }
        return true;
    }
}

class TrieNode{
    boolean flag;
    TrieNode[] links;

    TrieNode(){
        flag=false;
        links=new TrieNode[26];
    }
}