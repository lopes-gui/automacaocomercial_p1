package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id_pessoa;
		 private String login;
		 private String senha;
		 private String email;
		 private String nome;

		 

			public Pessoa() {
				
			}



			public Integer getId_pessoa() {
				return id_pessoa;
			}



			public void setId_pessoa(Integer id_pessoa) {
				this.id_pessoa = id_pessoa;
			}



			public String getLogin() {
				return login;
			}



			public void setLogin(String login) {
				this.login = login;
			}



			public String getSenha() {
				return senha;
			}



			public void setSenha(String senha) {
				this.senha = senha;
			}



			public String getEmail() {
				return email;
			}



			public void setEmail(String email) {
				this.email = email;
			}



			public String getNome() {
				return nome;
			}



			public void setNome(String nome) {
				this.nome = nome;
			}



			public static long getSerialversionuid() {
				return serialVersionUID;
			}



			public Pessoa(Integer id_pessoa, String login, String senha, String email, String nome) {
				super();
				this.id_pessoa = id_pessoa;
				this.login = login;
				this.senha = senha;
				this.email = email;
				this.nome = nome;
			}



			public Compra[] getCompras() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
	}

