package com.company;

public class Trie {
    public Node root;

    public Trie(){
        this.root = new Node();
    }

    public void insert(String word){
        Node currentNode = this.root;

        for(int i = 0; i < word.length(); i++ ){
            Character currentChar = word.charAt(i);
            Node child = currentNode.children.get(currentChar);
            if(child == null){
                child = new Node();
                currentNode.children.put(currentChar, child);
            }
            currentNode = child;
        }
        currentNode.isCompleted = true;
    }
}
