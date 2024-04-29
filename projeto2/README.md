# Contexto:

Uma biblioteca precisa de um sistema para gerenciar seus livros, clientes e empréstimos. O sistema deve permitir o cadastro de livros e clientes, bem como o controle de empréstimos.

# Explicação do código:

**- Classe `Biblioteca`:**

permite operações como adicionar/remover clientes, adicionar/remover livros, emprestar/devolver livros e exibir informações sobre os livros disponíveis.


1. `adicionar_cliente(String nome, String endereco, String tel, String id, String senha, ArrayList<Pessoa> clientes)`:
   - Este método adiciona um cliente à lista de clientes da biblioteca. Ele recebe como parâmetros o nome, endereço, telefone, ID, senha e a lista de clientes.
   - Cria um novo objeto `Cliente`, define suas informações usando os parâmetros fornecidos e adiciona à lista de clientes.

2. `remover_cliente(Scanner scanner)`:
   - Este método remove um cliente da lista de clientes da biblioteca.
   - Exibe uma lista numerada de clientes com seus IDs, nomes e telefones.
   - Solicita ao usuário que digite o número correspondente ao cliente que deseja remover.
   - Remove o cliente selecionado da lista.

3. `add_livro(Scanner scanner)`:
   - Este método adiciona um livro à lista de livros da biblioteca.
   - Solicita ao usuário que insira o título, autor e ID do livro.
   - Cria um novo objeto `Livro`, define suas informações usando as entradas do usuário e adiciona à lista de livros.

4. `remover_livro(Scanner scanner)`:
   - Este método remove um livro da lista de livros da biblioteca.
   - Exibe uma lista numerada de livros com seus IDs, títulos, autores e status de disponibilidade.
   - Solicita ao usuário que digite o número correspondente ao livro que deseja remover.
   - Remove o livro selecionado da lista.

5. `mostrar_livros()`:
   - Este método mostra informações sobre todos os livros na biblioteca.
   - Para cada livro na lista de livros, exibe seu ID, título, autor e status de disponibilidade.

6. `Emprestar_livro(Cliente cliente, Scanner scanner)`:
   - Este método permite que um cliente empreste um livro da biblioteca.
   - Mostra uma lista de todos os livros disponíveis na biblioteca.
   - Solicita ao usuário que digite o número correspondente ao livro que deseja emprestar.
   - Adiciona o livro selecionado à lista de livros emprestados pelo cliente e atualiza o status do livro para indisponível.

7. `Devolver_Livro(Cliente cliente, Scanner scanner)`:
   - Este método permite que um cliente devolva um livro à biblioteca.
   - Mostra uma lista dos livros atualmente emprestados pelo cliente.
   - Solicita ao usuário que digite o número correspondente ao livro que deseja devolver.
   - Atualiza o status do livro para disponível e remove o livro da lista de livros emprestados pelo cliente.


**- Classe `Cliente`:**

Basicamente permite que um objeto Cliente seja capaz de gerenciar seus próprios empréstimos de livros, adicionando, removendo e imprimindo os livros que possui emprestados.


1. `void setId(String id):`
   - Este método recebe um ID como parâmetro e define o ID do cliente.

2. `String getId()`:
   - Este método retorna o ID do cliente.

3. `void emprestarLivro(String nomeLivro)`:
   - Este método recebe o nome de um livro como parâmetro e o adiciona à lista de livros emprestados pelo cliente.

4. `void imprimirLivros()`:
   - Este método imprime os livros atualmente emprestados pelo cliente.
   - Se a lista de livros estiver vazia, exibe uma mensagem informando que o cliente não possui livros emprestados.
   - Caso contrário, exibe cada livro emprestado, numerando-os.

5. `void devolverLivro(int numero)`:
   - Este método recebe um número correspondente ao livro que o cliente deseja devolver.
   - Se o número estiver dentro do intervalo válido (1 até o tamanho da lista de livros emprestados), remove o livro correspondente da lista.
   - Caso contrário, exibe uma mensagem informando que o número do livro é inválido e nenhum livro é removido.
  

 **- Classe `Funcionario`:**

essa classe permite obter e difinir informações sobre um funcionário da biblioteca. O método setInfo é usado para inicializar as informações do funcionário, enquanto o método get_info é usado para imprimir essas informações quando necessário.

1. `void setInfo(String nome, String end, String tel, String turno)`:
   - Este método recebe como parâmetros o nome, endereço, telefone e turno de trabalho do funcionário.
   - Ele chama o método `setInfo` da classe `Pessoa` (que não está definida no código fornecido) para definir o nome, endereço e telefone do funcionário.
   - Define o turno de trabalho do funcionário.

2. `void get_info()`:
   - Este método imprime as informações do funcionário, incluindo nome, endereço, telefone, ID e turno de trabalho.
   - Ele chama o método `get_info` da classe `Pessoa` (que também não está definida no código fornecido) para imprimir as informações básicas do funcionário.
  
**- Classe `Livro`:**

Esses métodos permitem definir as informações de um livro, como título, autor e ID, bem como verificar e obter essas informações quando necessário. O método `setStatus` também permite alterar o status de disponibilidade do livro conforme necessário.


1. `void setInfo(String nomeLivro, String nomeAutor, String idLivro)`:
   - Este método recebe como parâmetros o título do livro, o nome do autor e o ID do livro.
   - Define as informações do livro usando os parâmetros fornecidos.
   - Define a disponibilidade inicial do livro como verdadeira, indicando que o livro está disponível para empréstimo.

2. `void setStatus(boolean disponivel)`:
   - Este método recebe um parâmetro booleano que representa o status de disponibilidade do livro.
   - Define o status de disponibilidade do livro como o valor fornecido.

3. `String getTitulo()`:
   - Este método retorna o título do livro.

4. `String getAutor()`:
   - Este método retorna o nome do autor do livro.

5. `String getId()`:
   - Este método retorna o ID do livro.

6. `String getStatus()`:
   - Este método retorna uma string indicando se o livro está disponível ou não.
   - Se o livro estiver disponível (status = true), retorna "SIM".
   - Se o livro não estiver disponível (status = false), retorna "NÃO".
  
     
**- Classe `Pessoa`:**


   - `setId(String id)`, `getId()`: Métodos para definir e obter o ID da pessoa.
   - `setSenha(String senha)`, `getSenha()`: Métodos para definir e obter a senha da pessoa.
   - `verificarSenha(String senha)`: Verifica se a senha fornecida corresponde à senha da pessoa.
   - `busca(ArrayList<Pessoa> pessoas, String input)`: Método estático que busca uma pessoa por ID em uma lista de pessoas.
   - `setInfo(String nome, String end, String tel)`: Define as informações básicas da pessoa.
   - `setNome(String nome)`, `getNome()`: Métodos para definir e obter o nome da pessoa.
   - `setEndereco(String endereco)`, `getEndereco()`: Métodos para definir e obter o endereço da pessoa.
   - `setTelefone(String telefone)`, `getTelefone()`: Métodos para definir e obter o telefone da pessoa.
   - `get_info()`: Imprime as informações básicas da pessoa.
   - `menu(Scanner scan)`: Um espaço reservado para implementar um menu específico para cada tipo de pessoa.



