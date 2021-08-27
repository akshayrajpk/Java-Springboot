package com.example.javabasic.day11_12.springCore.program3;

public class TextEditor {
    private SpellChecker spellChecker;

    // a getter method to inject the dependency.
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // a setter method to inject the dependency.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}
