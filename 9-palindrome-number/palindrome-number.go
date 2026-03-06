func isPalindrome(x int) bool {
    a:= strconv.Itoa(x)
    y:=len(a)-1
    for i:=0; i<len(a)/2;i++{
        if a[i]!= a[y]{
            return false    
        }
        y--
    }
    return true
}