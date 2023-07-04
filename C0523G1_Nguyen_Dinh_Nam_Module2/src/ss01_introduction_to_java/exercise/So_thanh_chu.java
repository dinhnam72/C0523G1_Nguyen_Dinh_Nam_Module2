package ss01_introduction_to_java.exercise;

import java.util.Scanner;

public class So_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int soNguyenDuong = sc.nextInt();
        int hangTram, hangChuc, hangDonVi, du100;
        hangTram = soNguyenDuong / 100;
        du100 = soNguyenDuong % 100;
        hangChuc = du100 / 10;
        hangDonVi = du100 % 10;
        String str = "";
        if (soNguyenDuong >= 0 && soNguyenDuong < 1000) {
            if (hangTram > 0) {
                switch (hangTram) {
                    case 1:
                        str += "one hundred";
                        break;
                    case 2:
                        str += "two hundred";
                        break;
                    case 3:
                        str += "three hundred";
                        break;
                    case 4:
                        str += "four hundred";
                        break;
                    case 5:
                        str += "five hundred";
                        break;
                    case 6:
                        str += "six hundred";
                        break;
                    case 7:
                        str += "seven hundred";
                        break;
                    case 8:
                        str += "eight hundred";
                        break;
                    case 9:
                        str += "nine hundred";
                        break;
                }
            }
            switch (hangChuc) {
                case 0:
                    break;
                case 1:
                    switch (hangDonVi) {
                        case 0:
                            str += "ten";
                        case 1:
                            str += "eleven";
                        case 2:
                            str += "twelve";
                        case 3:
                            str += "thirteen";
                        case 4:
                            str += "fourteen";
                        case 5:
                            str += "fifteen";
                        case 6:
                            str += "sixteen";
                        case 7:
                            str += "seventeen";
                        case 8:
                            str += "eighteen";
                        case 9:
                            str += "nineteen";
                    }
                    break;
                case 2:
                    str += " twenty";
                    break;
                case 3:
                    str += " thirty";
                    break;
                case 4:
                    str += " forty";
                    break;
                case 5:
                    str += " fifty";
                    break;
                case 6:
                    str += " sixty";
                    break;
                case 7:
                    str += " seventy";
                    break;
                case 8:
                    str += " eighty";
                    break;
                case 9:
                    str += " ninety";
                    break;
            }
            switch (hangDonVi) {
                case 0:
                    if (hangChuc == 0 && hangTram == 0) {
                        str += "zero";
                    }
                    break;
                case 1:
                    str += " one";
                    break;
                case 2:
                    str += " two";
                    break;
                case 3:
                    str += " three";
                    break;
                case 4:
                    str += " four";
                    break;
                case 5:
                    str += " five";
                    break;
                case 6:
                    str += " six";
                    break;
                case 7:
                    str += " seven";
                    break;
                case 8:
                    str += " eight";
                    break;
                case 9:
                    str += " nine";
                    break;
            }
        } else {
            System.out.println("out of ability");
        }

        System.out.println(str);

    }
}


