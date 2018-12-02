package tim2015.ruinfre.jasper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ReportActionListener implements ActionListener{


	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ParamsDialog  paramsDialog=new ParamsDialog();
		paramsDialog.setVisible(true);
		
		String oznakaUstanove = paramsDialog.getOznakaUstanove();
		Connection conn = DBConnection.getInstance().getConn();
		
		Map<String, Object> mpParams = new HashMap<String, Object>();
		mpParams.put("PR_SIFRA", oznakaUstanove);
		//mpParams.put("SUBREPORT_DIR", "E:\\RAF_NASTAVA\\2011\\Projektovanje baza podataka\\Termin12i13\\PBPTermin12i13\\reports\\");
		mpParams.put("SUBREPORT_DIR", "reports\\");

							        
			 
		JasperDesign jasperDesign;
		try {
			jasperDesign = JRXmlLoader.load("reports/Pokusaj6.jrxml");
		
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
							           
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,mpParams,conn);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, "C://sample_report.pdf");
			
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C://sample_report.pdf");
			//JasperViewer.viewReport(jasperPrint);
		
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
			e1.printStackTrace();
		} 

	}

}
