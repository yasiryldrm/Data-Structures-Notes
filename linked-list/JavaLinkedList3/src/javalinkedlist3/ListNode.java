/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalinkedlist3;

/**
 *
 * @author İhsan
 */
public class ListNode { 
int data; 
ListNode next; 

ListNode() { 
this.data = -1; 
this.next = null; } 

ListNode(int data) { 
this.data = data; 
this.next = null; } 

ListNode(int data, ListNode next) { 
this.data = data; 
this.next = next; }
}
