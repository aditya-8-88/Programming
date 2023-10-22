class Solution {
public:
    string removeStars(string s) {
        int slow = 0; // slow pointer to track the resulting string
        int fast = 0; // fast pointer to iterate through the original string

        while (fast < s.length()) {
            if (s[fast] == '*') {
                if (slow > 0) {
                    // Skip the previous character if it exists
                    slow--;
                }
                fast++; // Skip the '*' character
            } else {
                s[slow++] = s[fast++]; // Copy non-star character to the result
            }
        }

        // Resize the string to the correct length
        s.resize(slow);

        return s;
    }
};
