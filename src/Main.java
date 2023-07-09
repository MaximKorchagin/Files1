import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File src = new File("/Users/maximkorchagin/Documents/Games/src");
        if (src.mkdir()) {
            sb.append("Создан каталог src\n");
        }
        File res = new File("/Users/maximkorchagin/Documents/Games/res");
        if (res.mkdir()) {
            sb.append("Создан каталог res\n");
        }
        File savegames = new File("/Users/maximkorchagin/Documents/Games/savegames");
        if (savegames.mkdir()) {
            sb.append("Создан каталог savegames\n");
        }
        File temp = new File("/Users/maximkorchagin/Documents/Games/temp");
        if (temp.mkdir()) {
            sb.append("Создан каталог temp\n");
        }
        File main = new File("/Users/maximkorchagin/Documents/Games/src/main");
        if (main.mkdir()) {
            sb.append("Создана директория main в каталоге src\n");
        }
        File test = new File("/Users/maximkorchagin/Documents/Games/res/test");
        if (test.mkdir()) {
            sb.append("Создана директория test в подкаталоге src\n");
        }

        File mainJava = new File("/Users/maximkorchagin/Documents/Games/src/main/Main.java");
        try {
            if (mainJava.createNewFile())
                sb.append("Файл Main.java был создан\n");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File utilsjava = new File("/Users/maximkorchagin/Documents/Games/src/main/Utils.java");
        try {
            if (utilsjava.createNewFile())
                sb.append("Файл Utils.java был создан\n");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File drawables = new File("/Users/maximkorchagin/Documents/Games/res/drawables");
        if (drawables.mkdir()) {
            sb.append("Создана директория drawables в подкаталоге res\n");
        }

        File vectors = new File("/Users/maximkorchagin/Documents/Games/res/vectors");
        if (vectors.mkdir()) {
            sb.append("Создана директория vectors в подкаталоге res\n");
        }

        File icons = new File("/Users/maximkorchagin/Documents/Games/res/icons");
        if (icons.mkdir()) {
            sb.append("Создана директория icons в подкаталоге res\n");
        }

        File tempTxt = new File("/Users/maximkorchagin/Documents/Games/temp/temp.txt");
        try {
            if (tempTxt.createNewFile())
                sb.append("Файл temp.txt был создан\n");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //String logfile = sb.toString();

        try (FileOutputStream fos = new FileOutputStream("/Users/maximkorchagin/Documents/Games/temp/temp.txt")) {
            byte[] bytes = sb.toString().getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}