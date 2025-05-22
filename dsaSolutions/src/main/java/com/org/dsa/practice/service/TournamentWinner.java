package com.org.dsa.practice.service;

import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {
    private Map<String,String> competitions;
    private int[] results;

    public TournamentWinner (Map<String,String> competitions, int[] results) {
        this.competitions = competitions;
        this.results = results;
    }

    public String tournamentWinner() {
        if(!validateResults()){
            throw new IllegalArgumentException("Invalid competitions or results");
        }
        String currentBestTeam = "";
        int currentBestScore = 0;
        Map<String, Integer> scores = new HashMap<>();
        int index = 0;
        for(Map.Entry team: competitions.entrySet()) {
            String homeTeam = (String) team.getKey();
            String awayTeam = (String) team.getValue();
            int result = results[index];
            index++;
            String winningTeam;
            if(result == 0){
                winningTeam = homeTeam;
                updateScores(homeTeam, scores);
            } else if(result == 1) {
                winningTeam = awayTeam;
                updateScores(awayTeam, scores);
            } else{
                System.out.println("Invalid Scoring, moving to next competition results :{}"+ result + " for competition: "+ team);
                break;
            }
            if (scores.get(winningTeam) > currentBestScore) {
                currentBestScore = scores.get(winningTeam);
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }

    private boolean validateResults(){
        return competitions != null && !competitions.isEmpty() && results != null && results.length == competitions.size();
    }
    private void updateScores(String winningTeam, Map<String, Integer> scores) {
        if (!scores.containsKey(winningTeam)) {
            scores.put(winningTeam, 0);
        }
        scores.put(winningTeam, scores.get(winningTeam) + 3);
    }
}
