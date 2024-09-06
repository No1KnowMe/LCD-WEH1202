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

        // Знаки
        alphabet.put(' ', 0b00100000);
        alphabet.put('!', 0b00100001);
        alphabet.put('"', 0b00100010);
        alphabet.put('#', 0b00100011);
        alphabet.put('$', 0b00100100);
        alphabet.put('%', 0b00100101);
        alphabet.put('&', 0b00100110);
        alphabet.put('\'', 0b00100111);
        alphabet.put('(', 0b00101000);
        alphabet.put(')', 0b00101001);
        alphabet.put('*', 0b00101010);
        alphabet.put('+', 0b00101011);
        alphabet.put(',', 0b00101100);
        alphabet.put('-', 0b00101101);
        alphabet.put('.', 0b00101110);
        alphabet.put('/', 0b00101111);

        alphabet.put('0', 0b00110000);
        alphabet.put('1', 0b00110001);
        alphabet.put('2', 0b00110010);
        alphabet.put('3', 0b00110011);
        alphabet.put('4', 0b00110100);
        alphabet.put('5', 0b00110101);
        alphabet.put('6', 0b00110110);
        alphabet.put('7', 0b00110111);
        alphabet.put('8', 0b00111000);
        alphabet.put('9', 0b00111001);
        alphabet.put(':', 0b00111010);
        alphabet.put(';', 0b00111011);
        alphabet.put('<', 0b00111100);
        alphabet.put('=', 0b00111101);
        alphabet.put('>', 0b00111110);
        alphabet.put('?', 0b00111111);

        alphabet.put('A', 0b01000001);
        alphabet.put('B', 0b01000010);
        alphabet.put('C', 0b01000011);
        alphabet.put('D', 0b01000100);
        alphabet.put('E', 0b01000101);
        alphabet.put('F', 0b01000110);
        alphabet.put('G', 0b01000111);
        alphabet.put('H', 0b01001000);
        alphabet.put('I', 0b01001001);
        alphabet.put('J', 0b01001010);
        alphabet.put('K', 0b01001011);
        alphabet.put('L', 0b01001100);
        alphabet.put('M', 0b01001101);
        alphabet.put('N', 0b01001110);
        alphabet.put('O', 0b01001111);

        alphabet.put('P', 0b01010000);
        alphabet.put('Q', 0b01010001);
        alphabet.put('R', 0b01010010);
        alphabet.put('S', 0b01010011);
        alphabet.put('T', 0b01010100);
        alphabet.put('U', 0b01010101);
        alphabet.put('V', 0b01010110);
        alphabet.put('W', 0b01010111);
        alphabet.put('X', 0b01011000);
        alphabet.put('Y', 0b01011001);
        alphabet.put('Z', 0b01011010);
        alphabet.put('[', 0b01011011);
        alphabet.put(']', 0b01011101);
        alphabet.put('^', 0b01011110);
        alphabet.put('_', 0b01011111);

        alphabet.put('`', 0b01100000);
        alphabet.put('a', 0b01100001);
        alphabet.put('b', 0b01100010);
        alphabet.put('c', 0b01100011);
        alphabet.put('d', 0b01100100);
        alphabet.put('e', 0b01100101);
        alphabet.put('f', 0b01100110);
        alphabet.put('g', 0b01100111);
        alphabet.put('h', 0b01101000);
        alphabet.put('i', 0b01101001);
        alphabet.put('j', 0b01101010);
        alphabet.put('k', 0b01101011);
        alphabet.put('l', 0b01101100);
        alphabet.put('m', 0b01101101);
        alphabet.put('n', 0b01101110);
        alphabet.put('o', 0b01101111);

        alphabet.put('p', 0b01110000);
        alphabet.put('q', 0b01110001);
        alphabet.put('r', 0b01110010);
        alphabet.put('s', 0b01110011);
        alphabet.put('t', 0b01110100);
        alphabet.put('u', 0b01110101);
        alphabet.put('v', 0b01110110);
        alphabet.put('w', 0b01110111);
        alphabet.put('x', 0b01111000);
        alphabet.put('y', 0b01111001);
        alphabet.put('z', 0b01111010);

        // Русские символы
        alphabet.put('А', 0b01000001);
        alphabet.put('а', 0b01100001);
        alphabet.put('Б', 0b10100000);
        alphabet.put('б', 0b10110010);
        alphabet.put('В', 0b01000010);
        alphabet.put('в', 0b10110011);
        alphabet.put('Г', 0b10100001);
        alphabet.put('г', 0b10110100);
        alphabet.put('Д', 0b11100000);
        alphabet.put('д', 0b11100011);
        alphabet.put('Е', 0b01000101);
        alphabet.put('е', 0b01100101);
        alphabet.put('Ё', 0b10100010);
        alphabet.put('ё', 0b10110101);
        alphabet.put('Ж', 0b10100011);
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