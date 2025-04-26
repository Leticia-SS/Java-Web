package datas;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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

        Locale pt = new Locale("pt");
        System.out.println(Month.FEBRUARY.getDisplayName(TextStyle.FULL,pt));
        System.out.println(Month.FEBRUARY.getDisplayName(TextStyle.SHORT,pt));
        System.out.println(Month.FEBRUARY.getDisplayName(TextStyle.NARROW,pt));

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String formatado = now.format(formatter);
        System.out.println(formatado);

        String data = "14/11/1998";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate transformado = LocalDate.parse(data, formatter1);
        System.out.println(transformado);

        //================== API ANTIGA
        Calendar instance = Calendar.getInstance();
        instance.set(2014,Calendar.FEBRUARY, 30);
        System.out.println(instance.toString());

        //LocalDate.of(2014,Month.FEBRUARY,30); DATA INVALIDA
        //LocalDate.now().atTime(25,0); HORA INVALIDA

        System.out.println("==================");

        LocalDate now1 = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(1988,Month.NOVEMBER,19);
        System.out.println(ChronoUnit.DAYS.between(dataNascimento,now1));
        System.out.println(ChronoUnit.MONTHS.between(dataNascimento,now1));
        System.out.println(ChronoUnit.YEARS.between(dataNascimento,now1));
        System.out.println(ChronoUnit.DECADES.between(dataNascimento,now1));

        System.out.println(ChronoUnit.YEARS.between(anoAntigo,now1));









    }
}
