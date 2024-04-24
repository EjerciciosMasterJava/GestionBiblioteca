package com.cursojava.biblioteca.utilidad;

public class BibliotecaEnums {

	/**
	 * Plazos de devolucion en funcion del tipo de usuario
	 * @author Wendel
	 *
	 */
	public static enum Plazos {
		
		OCASIONAL(15), SOCIO(30);
		
		private Integer dias;

		public Integer getDias() {
			return dias;
		}

		private Plazos(Integer dias) {
			this.dias = dias;
		}
		
	}
	
	public static enum TipoUsuario{
		SOCIO, OCASIONAL
	}
	
	public static enum TipoDocumento{
		LIBRO, REVISTA
	}
	
}
