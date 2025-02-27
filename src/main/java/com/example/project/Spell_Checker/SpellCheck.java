package com.example.project.Spell_Checker;

public class SpellCheck {
    public static void main(String[] args) {
        SpellChecker check = new SpellChecker();
        System.out.println(check.binarySpellCheck("zyzzyvas"));
        System.out.println(check.getLoopCounter());
    }
}