# 💰 Desafio — Simulador de Conta Bancária em Java

Este projeto é um **simulador simples de conta bancária** desenvolvido em **Java**.
Ele permite que o usuário crie uma conta, consulte o saldo, realize transferências e receba valores, tudo de forma interativa pelo console.

---

## 🚀 Funcionalidades

O programa oferece as seguintes opções no menu principal:

1. **Consultar saldo** — Exibe o saldo atual da conta.
2. **Transferir valor** — Permite transferir um valor para outro CPF, descontando do saldo.
3. **Receber valor** — Permite adicionar um valor ao saldo (simula um depósito).
4. **Sair** — Encerra o programa.

---

## 🧩 Estrutura do Programa

O programa realiza os seguintes passos:

1. Solicita os dados iniciais do cliente:

   * **Nome do dono da conta**
   * **Tipo de conta** (Corrente ou Poupança)
   * **Saldo inicial**
2. Exibe as informações da conta.
3. Mostra o menu de operações.
4. Executa as operações escolhidas até o usuário optar por sair.

---

## 💻 Exemplo de Execução

```
Digite o Nome do dono da conta:
João Silva
Digite o Tipo da conta: Corrente ou Poupança
Corrente
Digite o valor inicial da sua conta
1500.00
***********************

Nome do cliente: João Silva
Tipo conta: Corrente
Saldo atual: R$1500.0

***********************

** Digite sua opção **
1 - Consultar saldo
2 - Transferir valor
3 - Receber valor 
4 - Sair
```

### ➤ Exemplo de operação:

```
2
Digite o CPF pra quem você quer transferir
123.456.789-00
Esse é o CPF pra quem você vai transferir 123.456.789-00
Saldo atual: R$1500.0
Digite o valor que você quer transferir
200
Saldo atual: R$1300.0
```

---

## 🧠 Conceitos Utilizados

* **Entrada de dados com `Scanner`**
* **Estrutura de repetição `while`**
* **Estruturas condicionais (`if/else`)**
* **Interpolação de strings e blocos de texto (`"""`)**
* **Operações aritméticas simples com variáveis `Double`**

---

## 🛠️ Como Executar

1. Certifique-se de ter o **Java instalado** (versão 17 ou superior recomendada).

2. Salve o código em um arquivo chamado `Desafio.java`.

3. Compile o código no terminal:

   ```bash
   javac Desafio.java
   ```

4. Execute o programa:

   ```bash
   java Desafio
   ```

---

## 📦 Tecnologias

* **Linguagem:** Java
* **Entrada/Saída:** Console
* **Bibliotecas externas:** Nenhuma (usa apenas `java.util.Scanner`)

---

## ✨ Melhorias Futuras (Sugestões)

* Adicionar verificação de saldo insuficiente na transferência.
* Criar um sistema de autenticação (com número da conta e senha).
* Permitir múltiplas contas e operações entre elas.
* Armazenar o histórico de transações.

---

## 👨‍💻 Autor

**João Pedro Lacerda Sousa**
📧 Email: [jpedro121256@gmail.com](mailto:jpedro121256@gmail.com)
📅 Projeto criado para fins de aprendizado.

---

Quer que eu adicione um **banner visual com emojis e cor (estilo markdown decorado)** no topo para deixar o README mais bonito (tipo README de GitHub moderno)?
