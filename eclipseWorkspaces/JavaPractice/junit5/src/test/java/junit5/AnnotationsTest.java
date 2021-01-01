package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("helloWorld")
class AnnotationsTest {

	@Test
	void test() {
		List<Integer> integersList = new ArrayList<>();
		integersList.add(1);
		integersList.add(2);
		List<Integer> integersListDoubled = integersList.stream().map((x) -> 2*x ).collect(Collectors.toList());
		integersListDoubled.stream().forEach((x) -> ( System.out.print(x)));
	}

}
