class Solution:
    def isPalindrome(self, s: str) -> bool:

        # bring strin gto lowercase, remove spaces & non alnum char
        s = s.lower()
        s = s.strip(' ')
        c = ""
        for i in range(len(s)):
            if(s[i].isalnum()):
                c = c + s[i]
        

        # check if pallindrome

        slen = len(c)
        for i in range(int(slen/2)):
            if (c[i] == c[slen-i-1]):
                continue
            else: 
                return False
        
        return True


