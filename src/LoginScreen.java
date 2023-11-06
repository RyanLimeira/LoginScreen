import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
	private Map<String, String> userDatabase;
	
	/**
     * Construtor da classe LoginScreen.
     * Inicializa a base de dados de usuários com valores padrão.
     */
	public LoginScreen() {
		
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
     * Tenta autenticar um usuário com o nome de usuário e senha fornecidos.
     *
     * @param username Nome de usuário a ser autenticado.
     * @param password Senha a ser verificada para autenticação.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if(storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}
	
    /**
     * Adiciona um novo usuário à base de dados.
     *
     * @param username Nome de usuário do novo usuário.
     * @param password Senha do novo usuário.
     */

	public void addUser(String username, String password) {
		
		userDatabase.put(username, password);
	}
}
