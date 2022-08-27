package com.sanek228.utils;

import java.text.*;
import java.util.*;

public class Dateplus{
	public String getCurrentDate() {
		Date date1 = new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("dd число/MM месяц/yy год");
    return dateF.format(date1);
	}
}