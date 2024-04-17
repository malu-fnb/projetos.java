# projetos.java

- Problemática: 

Objetivo: Desenvolver um sistema bancário básico com funcionalidades de conta, depósito, saque e consulta de saldo.
Requisitos Mínimos:
· Implementar classes (somente com atributos, como se fosse structs em C) para representar diferentes tipos de contas bancárias (corrente, poupança, etc.).
· Utilizar arrays para armazenar informações sobre diferentes contas bancárias.
· Validar transações para evitar saldos negativos.

Avaliação:
· Correta implementação dos requisitos mínimos.
· Eficiência na manipulação de arrays.
· Lógica precisa para validação de transações.

- Comentários do código:

01. buscaConta(ObjectInputStream inputStream, String numeroConta): Este método procura uma conta com um determinado número de conta no arquivo. Se encontrado, retorna a posição da conta no arquivo.

02. cadastrarConta(ObjectOutputStream outputStream, String numeroConta): Este método é usado para criar uma nova conta. Ele solicita detalhes da conta ao usuário e, em seguida, grava a nova conta no arquivo.

03. consultarSaldo(ObjectInputStream inputStream, String numeroConta): este método recupera e exibe o saldo de uma conta especificada.

04. fazerDeposito(ObjectOutputStream outputStream, ObjectInputStream inputStream, String numeroConta): Este método permite aos usuários depositar dinheiro em uma conta específica.

05. fazerSaque(ObjectOutputStream outputStream, ObjectInputStream inputStream, String numeroConta): Este método permite aos usuários sacar dinheiro de uma conta específica.

06. exibirContas(ObjectInputStream inputStream): Este método exibe todas as contas armazenadas no arquivo.

07. removerConta(ObjectOutputStream outputStream, ObjectInputStream inputStream, String numeroConta): este método remove uma conta especificada do arquivo.

08. limparCadastro(ObjectOutputStream outputStream): este método limpa todos os dados da conta do arquivo.
