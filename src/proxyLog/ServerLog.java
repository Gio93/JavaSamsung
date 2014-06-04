package proxyLog;


public class ServerLog implements Service {

	private Server servidor;
	
	public ServerLog(){
		this.servidor = null;
	}
	
	@Override
	public void service() {
		 if (this.servidor == null) {
	            this.servidor = new Server();
	     } 
		 System.out.println("[Server:service] "+new java.util.Date().toString());
		 int enviado = (int) new java.util.Date().getTime();
	     this.servidor.service();
	     System.out.println((int)new java.util.Date().getTime()-enviado);
	}

}
