package uploadDemo;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.frontend.ClientProxy;

import javax.activation.FileDataSource;
import javax.activation.DataSource;
import javax.activation.DataHandler;

import java.io.File;

import javax.xml.ws.BindingProvider;

public final class UploadDemoClient {

	

	public static void main(String args[]) throws Exception {
	
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
	
		factory.setServiceClass(ResumeUploadService.class);
		factory.setAddress
		(
		// "http://localhost:8081/cxfdemo/services/uploadDemo"	
		"https://localhost:8443/cxfdemo/services/uploadDemo"	
		);
		
		ResumeUploadService client = (ResumeUploadService) factory.create();
		
		// disable cn check (use in https) >> start
		
		HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(client).getConduit();

		TLSClientParameters tlsCP = new TLSClientParameters();
		// other TLS/SSL configuration like setting up TrustManagers
		tlsCP.setDisableCNCheck(true);
		httpConduit.setTlsClientParameters(tlsCP);
		
		// disable cn check (use in https) << end
		
		// http auth >> start
		
		String BASIC_USER= "acheung";
    String BASIC_PWD = "nopass";
		
		BindingProvider bp = (BindingProvider)client;
    bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, BASIC_USER);
    bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, BASIC_PWD);
		
		// http auth << end
		
		Resume resume=new Resume();
		resume.setCandidateName("upload_via_jax_ws");
		resume.setResumeFileType("docx");
	
		// DataSource source = new FileDataSource(new File("D:\\Users\\c7183\\TEMP\\upload.doc"));
		
		File f = new File("D:/Users/c7183/TEMP/upload.docx");
		
		if (f.exists())
		{
			System.out.println("f.length : " + f.length());
			System.out.println("f.getAbsolutePath : " + f.getAbsolutePath());
			
			DataSource source = new FileDataSource(f) ;
			resume.setDocData(new DataHandler(source));
			client.uploadResume(resume);
		
		}	else {
			System.out.println("File not exists!");
		}
		
		// resume.setResume(new DataHandler(source));
		
		
		System.exit(0);
	}

}
