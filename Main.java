import com.sanek228.utils.Console;
import com.sanek228.utils.Mathem;
import com.sanek228.utils.Test;
import com.sanek228.utils.Env;
import com.sanek228.utils.Static;
import com.sanek228.utils.FileManager;
import com.sanek228.execs.*;
import com.sanek228.utils.*;
class Main {
  public static void main(String[] args) {
		Console console = new Console();
		console.log("Hello World!");
    float math = console.calc(10,'+',5); // 1 параметр - 1чило, 2параметр - метод,3параметр - 2число
		console.log("Результат: " + math);
		Mathem mathem = new Mathem(5, 5); // В параметрах 2числа,с которыми происходят действия
		float res = mathem.plus(); /*
    mathem.mult() = умножить
    mathem.del() = разделить
    methem.minus() = отнять
    mathem.plus() = прибавить
		*/
		console.log("Результат 2: " + res);
		Test enums = new Test();
		char cls = enums.getClass("medium");
    console.log("Класс енам'а: " + cls);
		Env env = new Env();
		String secret = env.getEnv("Test");
		console.log("Секретная переменная: " + secret);
		  FileManager fileManager = new FileManager("test.txt");
		  fileManager.writeFile("Test123");
			fileManager.readFile(); /*
writeFile = написать что-то в файл;
readFile = вывести весь текст файла в консоль;
createFile(в конструкторе имя файла должно быть none) = создаьб файл с указанным именем в директории ./com/sanek228/files
		  */
		  Dateplus date = new Dateplus();
		  System.out.println("Текущая дата:" + date.getCurrentDate());
  }
}