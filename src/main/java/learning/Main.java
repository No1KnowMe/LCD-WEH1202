package learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(convert());
    }

    /**
     * Вызывает консоль для ввода текста и преобразует текст с кириллицы в числовой массив символов для LCD WEH1202.
     * @return {@code String} result – числовой массив символов
     * */
    public static String convert() {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> alphabet = new HashMap<>();

        alphabet.put('А', 0b01000001);
        alphabet.put('а', 0b01100001);
        alphabet.put('Б', 0b10100000);
        alphabet.put('б', 0b10110010);
        alphabet.put('В', 0b01000001);
        alphabet.put('в', 0b10110011);
        alphabet.put('Г', 0b10100001);
        alphabet.put('г', 0b10110100);
        alphabet.put('Д', 0b11100000);
        alphabet.put('д', 0b11100011);
        alphabet.put('Е', 0b01000101);
        alphabet.put('е', 0b01100101);
        alphabet.put('Ё', 0b10100010);
        alphabet.put('ё', 0b10110101);
        alphabet.put('Ж', 0b10010011);
        alphabet.put('ж', 0b10110110);
        alphabet.put('З', 0b10100100);
        alphabet.put('з', 0b10110111);
        alphabet.put('И', 0b10100101);
        alphabet.put('и', 0b10111000);
        alphabet.put('Й', 0b10100110);
        alphabet.put('й', 0b10111001);
        alphabet.put('К', 0b01001011);
        alphabet.put('к', 0b10111010);
        alphabet.put('Л', 0b10100111);
        alphabet.put('л', 0b10111011);
        alphabet.put('М', 0b01001101);
        alphabet.put('м', 0b10111100);
        alphabet.put('Н', 0b01001000);
        alphabet.put('н', 0b10111101);
        alphabet.put('О', 0b01001111);
        alphabet.put('о', 0b01101111);
        alphabet.put('П', 0b10101000);
        alphabet.put('п', 0b10111110);
        alphabet.put('Р', 0b01010000);
        alphabet.put('р', 0b01110000);
        alphabet.put('С', 0b01000011);
        alphabet.put('с', 0b01100011);
        alphabet.put('Т', 0b01010100);
        alphabet.put('т', 0b10111111);
        alphabet.put('У', 0b10101001);
        alphabet.put('у', 0b01111001);
        alphabet.put('Ч', 0b10101011);
        alphabet.put('ч', 0b11000000);
        alphabet.put('Ф', 0b10101010);
        alphabet.put('ф', 0b11100100);
        alphabet.put('Щ', 0b11100010);
        alphabet.put('щ', 0b11100110);
        alphabet.put('Ш', 0b10101100);
        alphabet.put('ш', 0b11000001);
        alphabet.put('Ъ', 0b10101101);
        alphabet.put('ъ', 0b11000010);
        alphabet.put('Ь', 0b01100010);
        alphabet.put('ь', 0b11000100);
        alphabet.put('Ы', 0b10101110);
        alphabet.put('ы', 0b11000011);
        alphabet.put('Э', 0b10101111);
        alphabet.put('э', 0b11000101);
        alphabet.put('Ю', 0b10110000);
        alphabet.put('ю', 0b11000110);
        alphabet.put('Я', 0b10110001);
        alphabet.put('я', 0b11000111);
        alphabet.put(' ', 0b00100000);

        System.out.print("Введите фразу для конвертации: ");
        String stroke = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        char[] nameArray = stroke.toCharArray();
        for (char c : nameArray) {
            result.add(alphabet.get(c));
        }
        result.add(0);  // Добавляем символ окончания строки
        return result.toString();
    }
}