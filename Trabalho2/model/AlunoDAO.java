package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.Aluno;


public class AlunoDAO {

	public ArrayList<Aluno> selecionar() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement r = 
		    conexao.prepareStatement("select * from aluno order by nome");

			ResultSet resultado = r.executeQuery();

			while (resultado.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setNome(resultado.getString("nome"));
				aluno.setMatricula(resultado.getString("matricula"));
				aluno.setVertente(resultado.getString("vertente"));
				alunos.add(aluno);
				
			}

			conexao.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return alunos;
	}

	
	public int inserir(Aluno a) {
		int resp =0;
		try {
			Connection conexao = new Conexao().getConexao();

			PreparedStatement inserir = 
			conexao.prepareStatement("insert into aluno "
					+ "(nome, cpf,matricula, vertente) "
					+ "values (?,?,?,?)");
			
			inserir.setString(1, a.getNome());
			inserir.setString(2, a.getCpf());
			inserir.setString(3, a.getMatricula());
			inserir.setString(4, a.getVertente());
				
		resp = inserir.executeUpdate();

			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}

}
