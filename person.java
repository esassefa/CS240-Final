/*************************************************************************
  Winter 2017 CS 240 Programming Exam : Person

 Author: Elshaday Assefa    

 Dependencies: Stack, Queue, Dictionary

 Description:  Models a person, a list of messages that they can
               read, and a list of their friends, so that when you
               post a message, all your friends can read it too.
 * @param <T>

**************************************************************************/

public class Person { 
	
	private StackLinkedArray<Person> friendList;
	private String[] name;
	private int numberOfNames;
	private int numberOfNames2;
	private StackLinkedArray<String> messageList;

	private Person firstPerson;
	


    // Create a new Person with this name.
    public Person(String name) {
    	Person firstPerson = name;
        friendList = new StackLinkedArray<Person>();
        
    }

    // Make these two people become friends with each other.
    // Throw an exception if you try to meet yourself.
    // We are allowed to assume we didn't meet this person yet.
    public void meet(Person otherPerson) {
    	if (otherPerson == firstPerson ) {
    		 throw new RunTimeException(" you are trying to meet yourself"); 
    	} else {
    		friendList.push(otherPerson);
    	}
    	numberOfNames++;
    	StackLinkedArray<Person> newPerson = new StackLinkedArray<Person>();
    	newPerson.push(firstPerson);
    	
    	
    
    }

    // Are these two people friends?
    // Throw an exception if you ask about knowing yourself.
    public boolean knows(Person otherPerson) {
       if (otherPerson == firstPerson) {
    	   throw  new RunTimeException(" you already know yourself lmao");
       } else {
    	   StackLinkedList<Person> temp = new StackLinkedList<Person>();
    	   while( friendList != null) {
    	   if (friendList.peek() != otherPerson) {
    		   Person temp = friendList.pop();
    		   temp.push(temp);
    		   else { return true;
    		   }
    	   }
       }
       
    }

    // Post a message to my list and the lists of all my friends
    public void post(String message) {
    	if( messageList == null) {
    		messageList.push = message;
    	}else {
    		for( int i = 0; i < friendList.length; i++) {
    				
    		} 
    	}
    }

    // Print a header, then all messages this Person can read, newest first
    public void listMessages() {
       System.out.println("First Person's messages:");
       
       for(int i = messageList.length; i >= 0; i--) {
    	   System.out.println(messageList[i] + " ");
       }
    }
}