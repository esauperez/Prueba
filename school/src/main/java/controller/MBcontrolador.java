package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
//es un POJO(una clase que tiene un constructor publico sin argumentos con Getters and Setter
@SessionScoped
public class MBcontrolador implements Serializable{ //serializable->clase controlador 
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String usuario;
	private String password;
	private String var;
    
	
	//para que inicialise las variables antes que aparesca en la vista 
	 @PostConstruct
     public void  init (){
    	 var="conexcion";
    	 
    	// System.out.println("imprime " + usuario + password );
    	 
     }
	 
	 
	 public void validate (){
		 
		 System.out.println("asdad" +this.usuario  +this.password);
	 }
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
}
