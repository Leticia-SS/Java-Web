package datas;

import java.sql.SQLOutput;
import java.time.*;
import java.util.Calendar;

public class Ex1 {
    public static void main(String[] args){
        // ANTES JAVA 8
        Calendar mesQeuqVem = Calendar.getInstance();
        mesQeuqVem.add(Calendar.MONTH, 1);

        // A PARTIR DO JAVA 8
        LocalDate.now(); // data de agora
        LocalDate anoRetrasado = LocalDate.now().minusYears(1);

        LocalDate agora = LocalDate.now();
        System.out.println(agora); // formato aaaa-mm-dd

        LocalDateTime meioDiaeMeia =  LocalDate.now().atTime(12,30); // passa hora e minuto
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));

        LocalDate anoAntigo = LocalDate.now().withYear(1789);
        System.out.println(anoAntigo); // alterou o ano da data

        // Comparando
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1); // adiciona 1 dia

        System.out.println(hoje.isBefore(amanha)); // true
        System.out.println(hoje.isAfter(amanha)); // false
        System.out.println(hoje.equals(amanha)); // false

        System.out.println("Hoje é dia: " + MonthDay.now().getDayOfMonth());
        YearMonth yearMonth = YearMonth.from(LocalDate.now());

        System.out.println(yearMonth.getMonth() + " " + yearMonth.getYear());

        System.out.println(LocalDate.of(2014,12,25));
        System.out.println(LocalDate.of(2014, Month.JULY,25));
        System.out.println("=======================");
        System.out.println(Month.DECEMBER.firstMonthOfQuarter());

    }
}
