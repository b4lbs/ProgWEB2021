package exemplo;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Contador {

private static int contagem; 
static ArrayList<String> datas = new ArrayList<>();

public static void novo_acesso() {

contagem += 1;

}

public static int getQntdacesso() { 
	return contagem;

}

public static Object getDataInicial() {
	return datas.get(0);

}
public static String getDateTime() {
	DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date= new Date();
	datas.add(dateFormat.format(date)); 
	return dateFormat.format(date);
}

String date =  request.getParameter("Data");{
	
}
}
	
	