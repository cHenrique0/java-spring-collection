# 1. Professional:

### 1.1 Componentes e injeção de dependência

- Preparação de ambiente
- Sistema e componentes
- Inversão de controle e injeção de dependência
- Trocando a dependência sem abrir o componente pai
- Frameworks
- Criação de projeto Spring Boot
- Implementação de componentes no Spring Boot
- DESAFIO: Componentes e Injeção de Dependência

### 1.2 Modelo de Domínio e ORM

- Revisão de Álgebra Relacional e SQL
- Super revisão de OO e SQL com Java e JDBC
- Nivelamento ORM - JPA e Hibernate
- Documento de requisitos do sistema DSCommerce
- Criando o projeto Spring Boot
- Entidade User, banco H2
- Order, Enum, relacionamento muitos-para-um
- Payment, relacionamento um-para-um
- Muitos-para-muitos, column unique e text
- Muitos-para-muitos com classe de associação PARTE 1
- Muitos-para-muitos com classe de associação PARTE 2
- Seeding da base de dados
- DESAFIO: Modelo de domínio e ORM

### 1.3 API REST, camadas, CRUD, exceções, validações

- O que é uma API REST
- Recursos, URL, parâmetros de consulta e de rota
- Padrões de URL, verbos HTTP, códigos de resposta
- Padrão camadas
- Acessando API
- Repository
- Criando DTO e estruturando camadas
- Dica da biblioteca ModelMapper para DTO
- CRUD
- Busca paginada
- Inserção com POST
- Customizando resposta com ResponseEntity
- Atualização com PUT
- Deleção com DELETE
- Criando exceções de serviço customizadas
- Tratando exceção com resposta customizada
- Validação com Bean Validation
- Customizando a resposta da validação
- DESAFIO: CRUD de clientes

### 1.4 JPA, consultas SQL e JPQL

- Sessão JPA e estados de entidades
- Salvando entidade associada para um
- Salvando entidades associadas para muitos
- Evitando degradação de performance
- Carregamento EAGER e LAZY
- Analisando o carregamento lazy de entidades
- Alterando o atributo fetch dos relacionamentos
- Otimizando consultas com a cláusula JOIN FETCH
- Entendendo Transactional e open-in-view
- Consultas com Query Methods
- Introdução sobre JPQL
- Polêmica vale a pena especializar na JPQL
- Preparando para os estudos de caso de consultas
- Estudo de caso URI 2602: consulta simples
- Estudo de caso URI 2611: INNER JOIN
- Estudo de caso URI 2621: BETWEEN LIKE
- Estudo de caso URI 2609: GROUP BY
- Estudo de caso URI 2737: UNION ALL, LEFT JOIN
- Estudo de caso URI 2990: NOT IN
- Estudo de caso: DSCommerce consulta de produtos por nome
- DESAFIO: Consulta vendas

### 1.5 Login e controle de acesso

- Ideia geral do login e controle de acesso
- Visão geral do OAuth2
- Login, credenciais e JWT
- Preparando projeto com bibliotecas
- Modelo de dados User e Role
- UserDetails, GrantedAuthority, UserDetailsService
- Armazenamento da senha codificada com BCrypt
- Checklist do OAuth2 com JWT no Spring Boot
- Requisição de login no Postman
- Deixando o Postman top
- Acessando recursos protegidos
- Controle de acesso aos endpoints
- Variáveis de ambiente no projeto
- Configuração de CORS
- Obtendo usuário logado
- Controle de acesso programático self ou admin
- Endpoint para buscar categorias
- DESAFIO: Projeto Spring Boot estruturado

### 1.6 Homologação e implantação com CI/CD

- Setup do ambiente local Postgresql e pgAdmin com Docker e Docker Compose
- Perfis de projeto: test, dev, prod
- Profile dev para homologação Postgresql
- Profile prod para projeto em produção na nuvem
- Geração de script de criação e seed da base de dados
- Procedimento deploy com CI/CD no Heroku
- Procedimento deploy com CI/CD no Railway

# 2. Expert:

### 2.1 CRUD e estruturação do projeto

- Setup do projeto DSCatalog
- Banco de dados H2, camadas
- Criação de entidades
- Transações e sessão JPA
- Seeding da base de dados
- DTO
- Criando um ambiente de execução no Postman
- Tratamento de exceções
- Operações de CRUD
- Métodos GET, POST, PUT, DELETE
- Dados de auditoria
- Paginação
- Revisão modelo relacional N-N
- Mapeamento JPA N-N

### 2.2 Testes automatizados

- Tipos de teste
- Benefícios dos testes automatizados
- O que é TDD
- Boas práticas para testes
- JUnit
- Testes Java vanilla
- Padrão de projeto Factory para instanciar objetos
- Exercícios JUnit vanilla
- Testes com Spring, principais annotations
- Testes de repository
- Fixtures no JUnit, BeforeEach
- Exercício com repository
- Mockito vs MockBean
- Testes de unidade da camada Service
- Imports estáticos do Mockito
- Simulando comportamentos diversos com Mockito
- Exercício testes de unidade com Mockito
- Testes na camada web
- Legibilidade e negociação de conteúdo
- Exercício testes na camada web
- Testes de integração
- Teste de integração na camada web
- Implementando o desafio TDD resolvido

### 2.3 Validação e segurança

- Implementando entidades User e Role, ORM, seed
- Introdução ao Bean Validation
- Anotações básicas
- Tratando exceção MethodArgumentNotValidException
- Resposta customizada para erro de validação
- Implementando um ConstraintValidator customizado
- Inclusão de segurança ao projeto
- OAuth2, JWT
- Pré-autorizando métodos por perfil de usuário

### 2.4 Casos de uso, signup, finalização

- Consulta detalhada de produtos
- Problema N+1 consultas
- Busca paginada com SQL padrão
- Correção nos testes automatizados após mudanças
- Configuração de CORS
- Caso de uso signup
- Envio de email com SMTP do Gmail
- Fluxo de recuperação de senha
- Obtenção do usuário logado

### 2.5 Cobertura de testes com Jacoco

- Setup do Jacoco no projeto Spring Boot
- Seleção de pacotes para cobertura
- Fluxos de cobertura, caixa branca
- Análise e implementação de testes de unidade
- Mock de dependências com Mockito
- Mocks relacionados a segurança
- Relatório de cobertura

### 2.6 Testes de API com MockMvc e RestAssured

- Setup do Spring Boot com RestAssured
- Domain-specific language (DSL) do RestAssured
- Análise e implementação de testes de API
- Considerações de integração e seed da base de dados
- Paralelo MockMvc e RestAssured

# 3. Reference:

### 3.1 Modelo de domínio complexo

- Setup do projeto DSLearn
- Implementação de entidades e relacionamentos
- Seeding da base de dados
- Relacionamentos 1-N
- Relacionamentos N-N
- Relacionamentos N-N com classe de associação
- Relacionamentos de Herança

### 3.2 Envio de email

- Emails transacionais
- Configuração do SendGrid
- Tratamento de exceções
- Padrão de projetos Strategy

### 3.3 Upload de arquivos no Amazon AWS S3

- Setup da conta AWS e do bucket S3
- Configurações de permissão
- Setup de projeto Spring Boot com Amazon S3
- Objeto MultipartFile
- Upload básico usando API do S3
- Upload via endpoint
- Finalização de deploy

### 3.4 Documentação de API com Swagger e Readme

- Fundamentos do Swagger
- Setup de projeto Spring Boot com Swagger
- Classes de configuração
- Swagger-UI
- Annotations para controllers
- Annotations para endpoints
- Annotations para models
- Meta dados
- Integração com validação e
- BeanValidatorPluginsConfiguration
- Integração com Spring Security

### 3.5 Versionamento de API

- Fundamentos de versionamento de API
- Versionamento via URI
- Vesionamento via Media Type
- Estudo de caso projeto prático

### 3.6 Spring Hateoas

- Fundamentos Hypermedia as the Engine of Application State
- Características do Hateoas
- Níveis de maturidade REST
- Setup de projeto Spring Boot Hateoas
- Estudo de caso projeto com Hateoas

### 3.7 Workshop NoSQL MongoDB

- Bancos de dados NoSQL
- Modelo de dados com agregados
- Setup MongoDB local com Docker
- MongoDB Compass
- Setup de projeto Spring Boot MongoDB
- Implementação de entidades
- Database seeding
- Operações de CRUD
- Busca de dados
- Tratamento de exceções
- Busca detalhada

### 3.8 Workshop NoSQL Cassandra

- Banco de dados família de colunas
- Modelagem query-driven
- Setup Cassandra local com Docker
- Terminal cqlsh
- Setup de projeto Spring Boot Cassandra
- Implementação de entidades
- Database seeding
- Operações de CRUD
- Busca de dados
- Busca por texto com plug-in

### 3.9 Spring Webflux com MongoDB

- Introdução ao Spring Webflux
- Programação reativa
- Spring MVC vs. Spring Webflux
- Setup projeto Spring Webflux e MongoDB
- Entidades
- Database seeding
- Operações de CRUD
- Consultas detalhadas

### 3.10 Spring Batch

- Processamento em lote
- Tempo, integridade, execução, monitoramento
- Componentes Spring Batch
- Setup de projeto Spring Batch
- Job launcher, job, step, job repository
- Item reader, item processor, item writer
- Metadados
- Estudo de caso: leitura paginada
- Estudo de caso: envio de email

