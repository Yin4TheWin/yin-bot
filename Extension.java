package com.github.yin4thewin;

import org.javacord.api.*;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.util.logging.ExceptionLogger;

import java.awt.*;
import java.io.File;

public class Extension extends Trivia{
    String[] yt={"https://www.youtube.com/watch?v=dQw4w9WgXcQ","https://www.youtube.com/watch?v=L_jWHffIx5E","https://www.youtube.com/watch?v=L__Rfiy-zes","https://www.youtube.com/watch?v=iHzzSao6ypE","https://www.youtube.com/watch?v=mviTS_cIWXg","https://www.youtube.com/watch?v=fzprnDqPt6w","https://www.youtube.com/watch?v=oFOIBPk6Yqo","https://www.youtube.com/watch?v=Vb_e1zgCZao","https://www.youtube.com/watch?v=j19gtQn9Qnk","https://www.youtube.com/watch?v=cV542dRK3uk","https://www.youtube.com/watch?v=T6cdM1kubk4","https://www.youtube.com/watch?v=u8qEkbotdzY","https://www.youtube.com/watch?v=AGEI1sfeOEY","https://www.youtube.com/watch?v=ZT6dde0Tz2c","https://www.youtube.com/watch?v=ojJupoAyT58","https://www.youtube.com/watch?v=427rUyZ64Zo","https://www.youtube.com/watch?v=5Ce_954P20I"};
    String[] subject={"Sally","Bob","He","She","They","Bowser","A giant rainbow beaver","A wicked unicorn","The muffin man","Little Red Riding Hood","I","You","The creepy slipper man","The butter machine","The plant eating fly","Moe Mentum","Jim"};
    String[] adverb={"lovingly","angrily","happily","stupidly","murderously","intelligently","sing-songingly","creepily","poopily","spoopily","meme-ingly","all","elegantly","thrice","creatively","hither","splendidly","vociferously","unbearably","thereon","sequentially"};
    String[] verb={"ran","burped","farted","slipped","ate","went","crawled","punched","kicked","screamed","swam","used","spoke","hit","killed","drank","typed","declared","produced","embarrassed","modeled","repeated","reasoned","continued"};
    String[] extra={"down the hole.","away from home.","the loving cat.","the stinky sewer.","the ugly alligator that nobody loves.","that one.","in the darkness.","through the day.","the prorastinator begging on the street.","the cheerful cat that died a horrible death.","the funny clown that everyones loves but is secretly a murderer.","the adorable flowers","all through the night", "in the hall of fame","the bladed clipboard.","the strapping botanist.","the jellied dignitary.","the jewelled plethora of resources.","the republican donkey.","the democratic elephant.","the firearm.","the endowed occupant of 22 Jump St.","the ninetieth pine.","the faded omnibus.","the largest asteroid.","the world's greatest laxative.","the disloyal fish."};
    String[] adverb2={"happily","sadly","angrily","wickedly","stupidly"};
    String[] verb2={"ran","drove","hopped","rolled"};
    String[] extra2={"to the shore.","outside.","with the wicked clown.","over a sandwich."};
    String[] adverb3={"wickedly","intelligently","thrice","creatively"};
    String[] verb3={"painted","used","dodged","tossed"};
    String[] extra3={"a giant shovel.","the ancient flamethrower.","a Samurai helmet.","a sandwich."};
    String[] adverb4={"lovingly","angrily","happily","sadly","intelligently","sing-songily","subsequently"};
    String[] verb4={"said,","screamed,","replied,","added,","deduced,"};
    String[] extra4={"\"The British are coming!\"","\"You must've eaten my pie!\"","\"The time is now!\"","\"Don't give up on your dreams...keep sleeping!\"","\"He solemnly swore he was up to no good.\"","\"You're the culprit!\"","\"And I'm all out of gum.\"","\"It's 12 'o clock\"","\"Nobody ever does anything except when they do.\"","\"Life is like a box of chocolates.\"","\"Around and around and around and around we go. That's a song, right?\"","\"They say cheaters never win, but that's because the real cheaters are never caught.\"","\"If 1+1=2, then 2=2.\"","\"Lasagna.\"","\"Nothing. Nothing at all. Why is this even in quotes? Y'know I hate people who rant. Don't you hate that sometimes? You know what you could never hate though? Pidgeons. They're fluffy and adorable. Except when they carry rabies. Can they carry rabies? Not sure. Anyways, I hope you're having a nice day. You must have a real interesting life if you've been reading this whole thing. But then again, who am I to judge? I'm just a bot. I'm pretending to be whatever I'm pretending to be in this sentence, but I'm just a bot. Is this long enough? Do I ask to many questions? Did you notice I misspelled too? Did you just go back to check? Yada yada. Seriously though I hope this is long enough, but I'm not sure because coding this makes it hard for me to judge the length. Have a great day!\""};
    public Extension()
    {}
    public String randWackSent()
    {
        return subject[(int)(Math.random()*subject.length-1)+0]+" "+adverb[(int)(Math.random()*adverb.length-1)+0]+" "+verb[(int)(Math.random()*verb.length-1)+0]+" "+extra[(int)(Math.random()*extra.length-1)+0];
    }
    public String randSent()
    {
        if((int)(Math.random()*2)+1==1)
         return subject[(int)(Math.random()*subject.length-1)+0]+" "+adverb2[(int)(Math.random()*adverb2.length-1)+0]+" "+verb2[(int)(Math.random()*verb2.length-1)+0]+" "+extra2[(int)(Math.random()*extra2.length-1)+0];
        else if((int)(Math.random()*2)+1==1)
         return subject[(int)(Math.random()*subject.length-1)+0]+" "+adverb3[(int)(Math.random()*adverb3.length-1)+0]+" "+verb3[(int)(Math.random()*verb3.length-1)+0]+" "+extra3[(int)(Math.random()*extra3.length-1)+0];
        return subject[(int)(Math.random()*subject.length-1)+0]+" "+adverb4[(int)(Math.random()*adverb4.length-1)+0]+" "+verb4[(int)(Math.random()*verb4.length-1)+0]+" "+extra4[(int)(Math.random()*extra4.length-1)+0];
    }
    public String randYT()
    {
        return yt[(int)(Math.random()*yt.length-1)+0];
    }
}
