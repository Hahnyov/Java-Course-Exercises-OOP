package Exercises.Ex6_Reflections.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String command=scanner.nextLine();
		Field[] fields = RichSoilLand.class.getDeclaredFields();

		Consumer<Field> printer = field -> System.out.println(String.format("%s %s %s",
				Modifier.toString(field.getModifiers()),
				field.getType().getSimpleName(),
				field.getName()));

		while(!command.equals("HARVEST")){
			String currentInput=command;
			Field[] requestedFields= Arrays.stream(fields).filter(field ->
				Modifier.toString(field.getModifiers()).equals(currentInput)
			).toArray(Field[]::new);
			if(requestedFields.length!=0){
				Arrays.stream(requestedFields).forEach(printer);
			}else{
				Arrays.stream(fields).forEach(printer);
			}
			command=scanner.nextLine();
		}

	}
}
