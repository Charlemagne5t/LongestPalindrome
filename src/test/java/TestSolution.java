import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {
    @Test
    public void longestPalindromeTest1(){
        Assert.assertEquals(7 , new Solution().longestPalindrome("abccccdd"));
    }

    @Test
    public void longestPalindromeTest2(){
        Assert.assertEquals(3 , new Solution().longestPalindrome("ccc"));
    }
    @Test
    public void longestPalindromeTest3(){
        Assert.assertEquals(4 , new Solution().longestPalindrome("cccc"));
    }
}
