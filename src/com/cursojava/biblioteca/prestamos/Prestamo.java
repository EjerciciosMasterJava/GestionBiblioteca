package com.cursojava.biblioteca.prestamos;

import java.time.LocalDateTime;

import com.cursojava.biblioteca.documentos.Documento;
import com.cursojava.biblioteca.usuarios.Persona;

/**
 * Prestamo de la biblioteca
 * @author Wendel
 *
 */
public class Prestamo {
	
	// Fecha en la que se hace entrega del prestamo
	private LocalDateTime fechaPrestamo;
	
	// Fecha de devolucion del prestamo
	private LocalDateTime fechaDevolucion;

	// El documento a prestar
	private Documento documento;
	
	// El usuario al que se le presta el documento
	private Persona usuarioPrestamo;
	
	// Cantidad de dias que tiene el usuario antes de la devolucion,
	// segun el tipo de usuario varia
	private Integer diasPrestamo;

	public Prestamo() {
		super();
	}

	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDateTime getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Persona getUsuarioPrestamo() {
		return usuarioPrestamo;
	}

	public void setUsuarioPrestamo(Persona usuarioPrestamo) {
		this.usuarioPrestamo = usuarioPrestamo;
	}

	public Integer getDiasPrestamo() {
		return diasPrestamo;
	}

	public void setDiasPrestamo(Integer diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}
	
}
