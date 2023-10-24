package view;

import camp.nextstep.edu.missionutils.Console;
import controller.ComputerController;

public class GameView {

    private static ComputerController computerController = new ComputerController();

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void guessNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        computerController.guessNumber(Console.readLine());
    }
}
