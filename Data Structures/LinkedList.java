package dsa;

public class LinkedList {
	
	private class Node {
		private String name;
		private String artist;
		private Node next; //Link to next node
	}
	
	private Node head; //First song in the playlist
	
	// ---- Methods to add, remove, traverse nodes ----
	
    public void addSong(String name, String artist) {
    	Node newNode = new Node(); //Created node
    	newNode.name = name;
    	newNode.artist = artist;
    	newNode.next = null; //Initially, it doesn't point to anything
    	
    	if (head == null) {
    		head = newNode; // the new node becomes the first song
    		return;	//no need to traverse
    	} 
    	
    	Node current = head;	//Initially the first node
    	
    	while (current.next != null) {
    		current = current.next;	// move until we reach the last node
    	}
    	
    	current.next = newNode;	//Last node now points to new song
    }
    
    public void removeSong(String name) {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next; // move head
            return;
        }

        // Traverse to find the node before the one to remove
        Node current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next; // skip over the node
        } else {
            System.out.println("Song not found: " + name);
        }
    }

    public void traversePlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        Node current = head;  // start at the first node
        while (current != null) {
            System.out.println(current.name + " by " + current.artist);
            current = current.next;  // move to next node
        }
    }

    public static void main(String[] args) {
    	//creating my play list object
    	LinkedList playlist = new LinkedList();
    	
    	//Adding songs
    	playlist.addSong("Into you", "Tamia");
    	playlist.addSong("Nonchalant", "6lack");
    	playlist.addSong("Pink + White", "Frank Ocean");
    	playlist.addSong("Pretty Little Fears", "6lack ft J. Cole");
    	playlist.addSong("Un-thinkable (I'm Ready)", "Alicia Keys ft Drake");
    
    	// Traversing play list
    	System.out.println("Current playlist: ");
    	playlist.traversePlaylist();
    	
    	//Remove a song
    	playlist.removeSong("Nonchalant");
    	playlist.removeSong("Into you");
    	
    	//Traverse again to see updated play list
        System.out.println("\nUpdated Playlist:");
        playlist.traversePlaylist();
    }
}
