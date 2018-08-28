package com.github.yin4thewin;

import org.javacord.api.*;

public class Main{
    public static void main(String[] args) {
        String token = "NDgwNDcyMTM1MjA3MjIzMzA5.DloTJQ.JnueS34xWotnqdDNVWuP88V0350";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        api.setMessageCacheSize(10, 60 * 60);

        api.addListener(new BotListener());

    }
}
