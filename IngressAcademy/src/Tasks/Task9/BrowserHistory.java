package Tasks.Task9;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory(String homepage) {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homepage;
        System.out.println("Current Page : " + currentPage);
    }

    public void visit(String url) {
        backStack.push(currentPage); // Mövcud səhifəni geri stack-ə atırıq
        currentPage = url;           // Yeni səhifəyə keçirik
        forwardStack.clear();        // İrəli keçid imkanlarını sıfırlayırıq
        System.out.println("Visited " + url);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage); // Mövcud səhifəni irəli stack-ə atırıq
            currentPage = backStack.pop();  // Geri stack-dən yeni cari səhifə alırıq
            System.out.println("Returned to  " + currentPage);
        } else {
            System.out.println("No page to go back to.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);     // Mövcud səhifəni geri stack-ə atırıq
            currentPage = forwardStack.pop();// İrəli stack-dən yeni cari səhifə alırıq
            System.out.println("Forwarded to " + currentPage);
        } else {
            System.out.println("No page to go forward to.");
        }
    }

    public void printCurrentPage() {
        System.out.println("Current Page : " + currentPage);
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home");

        browser.visit("www.google.com");
        browser.visit("www.openai.com");
        browser.back();
        browser.forward();
        browser.printCurrentPage();
    }
}
