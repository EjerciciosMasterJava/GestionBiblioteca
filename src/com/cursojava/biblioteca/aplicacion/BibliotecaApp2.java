package com.cursojava.biblioteca.aplicacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.cursojava.biblioteca.bibliotecarepositorio.Biblioteca;
import com.cursojava.biblioteca.bibliotecarepositorio.GestionBiblioteca;
import com.cursojava.biblioteca.usuarios.Bibliotecario;
import com.cursojava.biblioteca.utilidad.BibliotecaEnums.TipoUsuario;
import com.cursojava.biblioteca.usuarios.*;
import com.cursojava.biblioteca.documentos.*;
import com.cursojava.biblioteca.menu.MenuBiblioteca;
import com.cursojava.biblioteca.menu.MenuBiblioteca2;
import com.cursojava.biblioteca.mysql.*;

public class BibliotecaApp2 {

	public static void main(String[] args) {

		try {
			
			Scanner scan = new Scanner(System.in);
			
			Connection conn = ConexionMysql.getConexion();
			
			Biblioteca biblioteca = GestionBiblioteca.getBibliotecaPrueba();

			MenuBiblioteca2.menu(conn, biblioteca, scan);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	
	}
}
