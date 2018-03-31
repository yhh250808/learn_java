package text1;

import java.util.*;

public class Text1 {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);  
        System.out.print("请输入年份：");
        int year = sb.nextInt();
        System.out.print("请输入月份：");
        int month = sb.nextInt();
        int leap_year = 0;
        int[] month_code = {6,2,2,5,0,3,5,1,4,6,2,4};
        int[] month_day = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year % 100 != 0 && year % 4 == 0)||(year % 100 == 0 && year % 4 == 0)){
            leap_year = 1;
            month_code[0] = 5;
            month_code[1] = 1;
            month_day[1] = 29;
        }
        int year_code = year%100;
        year_code += year_code/4;
        year_code%=7;
        int week = (month_code[month-1] + year_code +1) % 7;
        System.out.print("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日\n");
        for(int i = 0;i<week - 1;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=month_day[month-1];i++){
           if(i<10) System.out.print("  " + i +"     " );
           else System.out.print("  " + i +"    " );
            week++;
            if(week == 8){System.out.print('\n');week = 1;}
        }
        sb.close();
    }
    
}
