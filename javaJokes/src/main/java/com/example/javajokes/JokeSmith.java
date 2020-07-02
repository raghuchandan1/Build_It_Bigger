package com.example.javajokes;

import java.util.Random;

public class JokeSmith {
    String jokes[];
    public JokeSmith(){
        String[] jokes = {"Why did the chicken cross the road?"+System.getProperty("line.separator")+"To get to the other side!","The world tongue-twister champion just got arrested. I hear they're gonna give him a really tough sentence.","Did you hear about the semi-colon that broke the law? He was given two consecutive sentences.","Money talks. But all mine ever says is goodbye.","Why are eggs not very much into jokes? Because they could crack up.\n" +
                "\n" +
                "Source: https://short-funny.com/one-liners.php","Chocolate is the best investment. You buy 100 g – you gain 2 kg!\n" +
                "\n" +
                "Source: https://short-funny.com/one-liners-4.php","It’s all a matter of viewpoint. 250 lbs here on Earth is 94.5 lbs on Mercury. Fat? No. I’m just not on the right planet.\n" +
                "\n" +
                "Source: https://short-funny.com/one-liners-4.php"};
        this.jokes = jokes;
    }
    public String getJoke() {
        Random random = new Random();
        int position = random.nextInt(jokes.length);
        return jokes[0];
    }
}