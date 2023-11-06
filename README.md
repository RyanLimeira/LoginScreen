# Sistema de Autenticação Simples

Este é um sistema de autenticação simples desenvolvido em Java. Ele consiste em duas classes principais:

## `LoginScreen`

A classe `LoginScreen` é responsável por gerenciar a autenticação de usuários. Ela inclui os seguintes métodos:

- `login(username, password)`: Tenta autenticar um usuário com um nome de usuário e senha fornecidos. Retorna `true` se a autenticação for bem-sucedida e `false` caso contrário.
- `addUser(username, password)`: Adiciona um novo usuário à base de dados.

### Exemplo de Uso:

```java
LoginScreen loginScreen = new LoginScreen();
boolean isAuthenticated = loginScreen.login("john", "password123");
if (isAuthenticated) {
    // Autenticação bem-sucedida
} else {
    // Autenticação falhou
}
```

## `LoginScreenTest`

A classe `LoginScreenTest` contém testes unitários para a classe `LoginScreen`. Os testes incluem:

- `testSucessfulLogin()`: Testa a autenticação bem-sucedida.
- `testFailedLogin()`: Testa a autenticação com senha incorreta.
- `testAddUser()`: Testa a adição de um novo usuário à base de dados.

### Executando Testes:

```java
@Test
public void testSucessfulLogin() {
    LoginScreen loginScreen = new LoginScreen();
    assertTrue(loginScreen.login("john", "password123"));
}
