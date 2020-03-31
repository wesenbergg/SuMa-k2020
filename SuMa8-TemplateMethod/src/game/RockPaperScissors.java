package game;

import java.util.Scanner;

public class RockPaperScissors extends Game {
	@Override
	public void initializeGame() {
		playerChoices = new Choice[2];
		scanner = new Scanner(System.in);
	}

	@Override
	public void makePlay(int player) {
		while(playerChoices[player] == null) scanSelection(player);
	}

	@Override
	public boolean endOfGame() {
		return (playerChoices[0] != null && playerChoices[1] != null);
	}

	@Override
	public void printWinner() {
		boolean isP1Winner = false;
		
		if(playerChoices[0] == playerChoices[1]) {
			System.out.println("TIE");
			return;
		}

		if (playerChoices[0] == Choice.ROCK) isP1Winner = (playerChoices[1] == Choice.SCISSORS);
		if (playerChoices[0] == Choice.PAPER) isP1Winner = (playerChoices[1] == Choice.ROCK);
		if (playerChoices[0] == Choice.SCISSORS) isP1Winner = (playerChoices[1] == Choice.PAPER);
		
		System.out.println("P1 chose " + playerChoices[0] + ", P2 chose " + playerChoices[1]);
		System.out.println(isP1Winner ? "P1 won with " + playerChoices[0]: "P2 won with " + playerChoices[1]);
		scanner.close();
	}
	
	private void scanSelection(int player) {
		System.out.println("P"+(player+1)+" choose:\n1. Rock\n2. Paper\n3. Scissors");
		try { playerChoices[player] = choices[scanner.nextInt()-1]; } catch (IndexOutOfBoundsException e) {}
	}
	
	private static final Choice[] choices = { Choice.ROCK, Choice.PAPER, Choice.SCISSORS };
	private Choice[] playerChoices;
	private Scanner scanner;
}

enum Choice { ROCK, PAPER, SCISSORS }