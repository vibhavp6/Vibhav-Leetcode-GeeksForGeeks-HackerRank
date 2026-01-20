import java.util.Stack;

class Solution {
    private StringBuilder doc;
    private Stack<Character> redoStack;

    public Solution() {
        doc = new StringBuilder();
        redoStack = new Stack<>();
    }

    // Append character to document
    public void append(char x) {
        doc.append(x);
        redoStack.clear(); // New operation clears redo history
    }

    // Undo last change
    public void undo() {
        if (doc.length() > 0) {
            char lastChar = doc.charAt(doc.length() - 1);
            doc.deleteCharAt(doc.length() - 1);
            redoStack.push(lastChar);
        }
    }

    // Redo last undone change
    public void redo() {
        if (!redoStack.isEmpty()) {
            doc.append(redoStack.pop());
        }
    }

    // Read the document
    public String read() {
        return doc.toString();
    }
}