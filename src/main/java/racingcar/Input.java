package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Input {

    public List<Car> askCarList(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        List<String> cars = splitName(input);
        validateName(cars);

        return stringToCar(cars);
    }

    public int askTimes(){
        System.out.println("시도할 회수는 몇회인가요?");
        String times = Console.readLine();
        return stringToInteger(times);
    }

    public List<String> splitName(String names){
        return Arrays.asList(names.split(","));
    }

    public List<Car> stringToCar(List<String> cars){
        List<Car> result = new ArrayList<>();
        for (String name : cars) {
            Car car = new Car(name);
            result.add(car);
        }
        return result;
    }

    public int stringToInteger(String str){
        return Integer.parseInt(str);
    }

    public void validateName(List<String> names){
        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("The name must not be more than 5 characters.");
            }
        }
    }
}
