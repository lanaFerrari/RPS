package com.nology;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Type your name to play!");
        String userName = input.nextLine();
        Person player = new Person(userName);
        playGame(player);
    }

    public static String computerAnswer() {
        List<String> rps = Arrays.asList("rock", "paper", "scissors");
        Random rand = new Random();
        return rps.get(rand.nextInt(rps.size()));
    }

    public static String playerAnswer() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock, paper or scissors?");
        String userInput = input.nextLine();
        if (!Objects.equals(userInput, "rock") && !Objects.equals(userInput, "scissors") && !Objects.equals(userInput, "paper")) {
            throw new Exception("Wrong input!");
        }
        return userInput;
    }

    public static void playGame(Person player) throws Exception {
        for (int i = 0; i < 3; i++) {
            String userInput = playerAnswer();
            String computerInput = computerAnswer();
            System.out.println(computerInput);

            if (Objects.equals(userInput, computerInput)) {
            } else if (Objects.equals(userInput, "rock") && Objects.equals(computerInput, "scissors")) {
                player.setScore();
            } else if (Objects.equals(userInput, "paper") && Objects.equals(computerInput, "rock")) {
                player.setScore();
            } else if (Objects.equals(userInput, "scissors") && Objects.equals(computerInput, "paper")) {
                player.setScore();
            }

        }
//        player.setTotalScore();
//        System.out.println(player.totalScore);
        System.out.println(player.score);
    }
}
