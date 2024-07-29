package com.botticelli.bot.request.types;

public enum RandomEmojis {

    DICE("\uD83C\uDFB2"), BULLSEYE("\uD83C\uDFAF"), BASKET("🏀"), SOCCER("⚽️");


    private String emoji;
    /**
     * Private constructor for incapsulate the emoji
     * @param emoji
     */
    private RandomEmojis(String emoji)
    {
        this.emoji=emoji;
    }

    @Override
    public String toString()
    {
        return emoji;
    }
    /**
     * Metodo per poter costruire l'enum da Stringa
     * @param text
     * @return
     *
     */


}
