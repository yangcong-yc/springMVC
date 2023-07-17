package com.yangcong.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateConverter  时间类型转换器
 * @Description TODO
 * @date 2023/7/5 16:07
 * @Version 1.0
 */
public class DateConverter implements Converter<String, Date> {

    private String parttern;


    public DateConverter(String parttern){
        this.parttern = parttern;
    }

    @Override
    public Date convert(String s) {

        SimpleDateFormat sdf = new SimpleDateFormat(parttern);
        try {
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
