Aula 02: Conexão com banco de dados usando Springboot

Criação da Classe Principal (TodolistApplication)

Inicializa a aplicação Spring Boot.
Utiliza a anotação @SpringBootApplication para configurar a aplicação.
Executa o método main para iniciar o contexto do Spring.
Criação do Modelo (UserModel)

Definida a classe UserModel como uma entidade JPA usando a anotação @Entity.
Usado @Id e @GeneratedValue(generator = "UUID") para definir o campo id como chave primária gerada automaticamente como UUID.
Anotado @Column(unique = true) para garantir que o campo username seja único no banco de dados.
Utilizado @CreationTimestamp para registrar a data e hora da criação do registro.
Criação do Repositório (IUserRepository)

Criada a interface IUserRepository que estende JpaRepository.
Definido o método findByUsername para buscar usuários pelo nome de usuário.
Criação do Controlador (UserController)

Definida a classe UserController como um controlador REST usando a anotação @RestController.
Mapeado o controlador para a URL /users com @RequestMapping.
Usado @Autowired para injetar a dependência do repositório IUserRepository.
Criado o método create para lidar com requisições POST e criar novos usuários.
Implementada lógica para verificar se o username já existe e salvar um novo usuário no banco de dados se não existir.
Como Funciona
Inicialização

Execute a classe TodolistApplication para iniciar a aplicação Spring Boot.
Requisição HTTP

Envie uma requisição HTTP POST para http://localhost:8080/users/ com os dados do usuário no corpo da requisição em formato JSON.
Processamento da Requisição

O controlador UserController recebe a requisição e verifica se o username já existe no banco de dados usando IUserRepository.
Se o username não existir, o controlador salva o novo usuário no banco de dados e retorna o objeto UserModel criado.
Se o username já existir, o controlador retorna null e imprime uma mensagem informando que o usuário já existe.

