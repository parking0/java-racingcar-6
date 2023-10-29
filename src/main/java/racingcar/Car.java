package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Car {
    public static final int LIMIT_NUMBER = 4;

    private final String name;
    private int move;

    public Car(String name){
        this.name = name;
        this.move = 0;
    }

    public void run(){
        int randomNum = getRandomNumber();
        if(canMove(randomNum)){
            addMove();
        }
    }

    public void addMove(){
        this.move++;
    }

    public String getName(){
        return this.name;
    }

    public int getMove(){
        return this.move;
    }

    private int getRandomNumber(){
        return Randoms.pickNumberInRange(0,9);
    }

    private boolean canMove(int randomNum){
        return randomNum >= LIMIT_NUMBER;
    }

}