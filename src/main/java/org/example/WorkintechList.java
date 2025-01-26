package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkintechList extends ArrayList<Object> {

    // Constructor
    public WorkintechList() {
        super(); // Call the parent constructor to initialize the ArrayList
    }

    // Method to add an item to the list, ensuring no duplicates
    @Override
    public boolean add(Object value) {
        if (!this.contains(value)) { // Check for duplicates
            return super.add(value);
        }
        return false;
    }

    // Method to remove an item from the list and then sort the list
    @Override
    public boolean remove(Object value) {
        if (this.contains(value)) {
            super.remove(value);
            sort(); // Re-sort the list after removal
            return true; // Return true if the item was successfully removed
        }
        return false; // Return false if the item was not found
    }

    // Method to sort the items in the list (String and numeric)
    public void sort() {
        List<String> strings = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        // Separate items into strings and numbers
        for (Object item : this) {
            if (item instanceof String) {
                strings.add((String) item);
            } else if (item instanceof Number) {
                numbers.add((Integer) item);
            }
        }

        // Sort both lists
        Collections.sort(strings); // Sort strings alphabetically (A-Z)
        Collections.sort(numbers);  // Sort numbers (0 -> ∞)

        // Clear the list and add the sorted items back
        this.clear();
        this.addAll(strings);
        this.addAll(numbers);
    }
}
