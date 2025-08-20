# 1.3 - API REST, camadas, CRUD, exceções, validações

## 📚 Conteúdo Estudado
- O que é uma API REST
- Recursos, URL, parâmetros de consulta e de rota
- Padrões de URL, verbos HTTP, códigos de resposta
- Padrão camadas (Controller, Service, Repository)
- Repository pattern
- Criando DTO e estruturando camadas
- ModelMapper para conversão DTO
- Operações CRUD completas
- Busca paginada
- Inserção, atualização e deleção
- ResponseEntity para customização de respostas
- Exceções de serviço customizadas
- Tratamento de exceções com respostas customizadas
- Validação com Bean Validation
- Customização da resposta de validação

## 🎯 Objetivos de Aprendizado
- [ ] Projetar APIs REST seguindo boas práticas
- [x] Implementar padrão de camadas corretamente
- [x] Criar DTOs para transferência de dados
- [ ] Desenvolver CRUD completo com validações
- [ ] Implementar tratamento de exceções profissional
- [x] Configurar paginação eficiente

## 🔧 Projetos/Exercícios
- **api-crud-exemplo/**: Implementação de CRUD básico
- **desafio-crud-clientes/**: Desafio prático do módulo
- **dto-examples/**: Exemplos de padrão DTO
- **exception-handling/**: Tratamento de exceções

## 📝 Anotações Importantes
### Conceitos chave aprendidos

##### Idempotência

Uma **operação idempotente** é uma operação que não causa novos efeitos quando executadas várias vezes. Por exemplo, quando se utiliza o verbo http **PUT** para atualizar um dado. Ao contrário do **PUT** o metódo **PATCH** não é idempotente, ou seja, várias requisições idênticas executadas em sequência podem obter efeitos distintos. Porém, é possível realizar requisições **PATCH** de modo que sejam idempotentes.

##### Padrão de camadas

- O **padrão camadas** organiza os _componentes_ do sistema em partes chamadas de **camadas**.
- Cada camada possuí sua própria responsabilidades
- Componente de uma camada só podem depender de componentes da mesma camada ou da camada inferior
- Responsabilidades:
    - Controller: responder as interações do usuário (requisições)
    - Service: executar operações de négocio
    - Repository: realizar operações individuais de acesso ao banco de dados

##### JPA Repository

Interface do _Spring Data_ que fornece métodos **CRUD** para manipulação de entidades de forma simplificada. Ao estender esta interface em um _repository_ do Spring, pode-se acessar um conjunto de métodos, como _save_, _delete_, _findById_, entre outros, além de permitir a definição de consultas customizadas usando apenas assinaturas de métodos.

### Comandos importantes
- **@RestController**: Marca a classe como um controlador, onde cada método retorna um domínio de objeto em vez de uma vista. A classe está pronta para processar requisições web.
- **@RequestMapping(value = "nomeRota")**: Define que todas as requisições que chegam para a rota _nomeRota_ serão tratadas por este controlador.
- **@GetMapping**: Especifica que o método anotado deve responder a requisições **GET**. Quando não se especifica uma rota dentro da anotação _@GetMapping_, o método anotado responde pela rota definida no _@RequestMapping_ da classe.
- **@Transactional(readOnly = true)**: Usada para definir as características da transação no banco de dados.
    - readOnly = true: significa que a transação é somente leitura. Informa ao gerenciador de transações e ao banco de dados que a operação não irá realizar nenhuma alteração no estado dos dados. I
    - A anotação também garante que se ocorrerem exceções durante a operação, será feito um _rollback_ da transação, mantendo a consistência dos dados.
- **@PathVariable**: usada para mapear o **path param** do endpoint para o argumento da função.
- **@PostMapping**: especifica que o método anotado deve responder a requisições **POST**.
- **@RequestBody**: utilizada para mapear o **body** da requisição para o argumento da função do endpoint.
- **@**: 

### Links úteis
- [REST API](https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api)
- [Metódos HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Methods)
- [Status HTTP](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status)
- [Model Mapper](https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application)

## ✅ Status
- [ ] Concluído
- [x] Em andamento
- [ ] Não iniciado
