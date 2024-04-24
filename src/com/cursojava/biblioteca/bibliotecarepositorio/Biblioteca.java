package com.cursojava.biblioteca.bibliotecarepositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cursojava.biblioteca.documentos.Documento;
import com.cursojava.biblioteca.prestamos.Prestamo;
import com.cursojava.biblioteca.usuarios.Bibliotecario;
import com.cursojava.biblioteca.usuarios.Persona;

public class Biblioteca {

	private String nombre;
	
	private Bibliotecario bibliotecario;
	
	// Mapa con todos los usuarios de la biblioteca
	private Map<String, Persona> usuarios;
	
	// Lista completa de los documentos de la biblioteca
	private List<Documento> documentos;
	
	// Documento seleccionado actualmente, para cualquier gestion hay que seleccionar primero un documento
	private Documento documentoSeleccionado;
	
	// Mapa con lista de prestamos para cada usuario
	private Map<Persona, List<Prestamo>> prestamosBiblioteca;

	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
		this.usuarios = new HashMap();
		this.documentos = new ArrayList();
		this.prestamosBiblioteca = new HashMap<Persona, List<Prestamo>>();
	}
	
	// Asignar un nuevo prestamo a un usuario
	public void agregarPrestamo(Persona usuario, Prestamo prestamo) {
		List<Prestamo> prestamosUsuario = null;
		try {
			prestamosUsuario = this.prestamosBiblioteca.get(usuario);
		} catch (Exception e) {
			this.prestamosBiblioteca.put(usuario, new ArrayList<Prestamo>());
		}
		prestamosUsuario.add(prestamo);
	}
	
	// Devolver un prestamo de un usuario
	public void devolverPrestamo(Persona usuario, Prestamo prestamo) {
		List<Prestamo> prestamosUsuario = null;
		try {
			prestamosUsuario = this.prestamosBiblioteca.get(usuario);
		} catch (Exception e) {
			this.prestamosBiblioteca.put(usuario, new ArrayList<Prestamo>());
		}
		prestamosUsuario.remove(prestamo);
	}
	
	public void mostrarTodosLosPrestamos() {
		this.prestamosBiblioteca.forEach((u, p) -> {
			System.out.println("Lista de prestamos del usuario: " + u);
			p.forEach(System.out::println);
			System.out.println("-----------");
		});
	}

	public Map<Persona, List<Prestamo>> getPrestamosBiblioteca() {
		return prestamosBiblioteca;
	}

	public void setPrestamosBiblioteca(Map<Persona, List<Prestamo>> prestamosBiblioteca) {
		this.prestamosBiblioteca = prestamosBiblioteca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Map<String, Persona> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Map<String, Persona> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public Documento getDocumentoSeleccionado() {
		return documentoSeleccionado;
	}

	public void setDocumentoSeleccionado(Documento documentoSeleccionado) {
		this.documentoSeleccionado = documentoSeleccionado;
	}
	
	public void agregarUsuario(Persona usuario) {
		this.usuarios.put(usuario.getDni(), usuario);
	}
	
	public void eliminarUsuario(Persona usuario) {
		this.usuarios.remove(usuario);
	}
	
	public void agregarDocumento(Documento documento) {
		this.documentos.add(documento);
	}
	
}
