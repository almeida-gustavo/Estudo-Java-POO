package date.desafio;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadorGravidez {

	private Date dataUltimoPeriodoMenstrual;

	public CalculadorGravidez(Date dataUltimoPeriodoMenstrual) {
		this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
	}
	

	private Calendar converterDateParaCalendar(Date data) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(data);
		return calendar;
	}
	
	public Date calcularDataEstimadaConcepcao() {
		// implementar c�lculo de data estimada da concep��o
		// 2 semanas ap�s a data do �ltimo per�odo menstrual
		Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 2);
		return dataEstimadaDaConcepcao.getTime();
		
	}
	
	public Date calcularDataEstimadaParto() {
		// implementar c�lculo de data estimada para parto
		// 40 semanas ap�s a data do �ltimo per�odo menstrual
		Calendar dataEstimadaDaConcepcao = this.converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
		dataEstimadaDaConcepcao.add(Calendar.WEEK_OF_YEAR, 40);
		return dataEstimadaDaConcepcao.getTime();
	}
	

}

