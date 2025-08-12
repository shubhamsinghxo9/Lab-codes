#include <iostream>
using namespace std;
class Node{
public:
    int val;
    Node* next;
    Node(int val){
        this->val=val;
        this->next=next;
    }
};
class Linkedlist{
public:
   Node* head;
   Node* tail;
   int size;
   Linkedlist(){
       head=tail=NULL;
       size=0;
       
   }
   void inseratedatend(int val){
       Node* temp=new Node(val);
   }

}