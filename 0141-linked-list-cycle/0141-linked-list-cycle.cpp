class Solution {
public:
    // Floyd's Cycle Detection
    bool hasCycle(ListNode *head) {
    
        // Code
        ListNode *slow = head;
        ListNode *fast = head;

        while(fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;

            if(slow == fast) return true;
        }
        return false;
    }
};