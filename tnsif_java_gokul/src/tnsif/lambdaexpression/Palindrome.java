//Program to define generic functional interface Palindrome

package tnsif.lambdaexpression;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
