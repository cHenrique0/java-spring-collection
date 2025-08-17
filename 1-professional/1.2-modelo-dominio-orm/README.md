# 1.2 - Modelo de Domínio e ORM

## 📚 Conteúdo Estudado
- Revisão de Álgebra Relacional e SQL
- Super revisão de OO e SQL com Java e JDBC
- Nivelamento ORM - JPA e Hibernate
- Documento de requisitos do sistema DSCommerce
- Criação de projeto Spring Boot DSCommerce
- Entidade User, banco H2
- Order, Enum, relacionamento muitos-para-um
- Payment, relacionamento um-para-um
- Muitos-para-muitos, column unique e text
- Muitos-para-muitos com classe de associação
- Seeding da base de dados

## 🎯 Objetivos de Aprendizado
- [x] Dominar mapeamento objeto-relacional (ORM)
- [x] Implementar relacionamentos JPA complexos
- [x] Configurar banco H2 para desenvolvimento
- [x] Criar modelo de domínio robusto
- [x] Entender estratégias de relacionamento N:N

## 🔧 Projetos/Exercícios
- **dscommerce/**: Projeto principal do e-commerce
- **desafio-modelo-dominio/**: Desafio prático de ORM
- **sql-exercises/**: Exercícios de SQL e álgebra relacional

## 📝 Anotações Importantes
### Conceitos chave aprendidos
- Ao usar `spring.profiles.active=test` no `resources/application.properties`, cria-se um perfil de projeto com o nome `test`. Em seguida, é preciso criar um arquivo `application-test.properties` dentro da pasta `resources` para o perfil (ambiente) de teste.
- O relacionamento é realizado utilizando `annotations`. Elas auxiliam no mapeamento do relacionamento para o banco de dados. Algumas permitem configurar a tabela ou a coluna. Outras são usadas para indicar o papel da coluna na tabela.
- Quando houver um relacionamento `muitos-para-muitos`, os atributos que correspondem à coleção do relacionamento devem ser instanciados como um `Set` para evitar a repitição de dados.
- Um relacionamento `muitos-para-muitos` exige uma tabela de associação e, quando houver dados adicionais além das chaves estrangeiras é necessário implementar uma classe para essa tabela.
- A classe de associação possui chave primária multipla, ou seja, as duas chaves estrangeiras das entidades do relacionamento são exatamente as chaves primárias das entidades. Nesse caso, é necessário implementar uma classe para esta chave primária composta.

### Comandos importantes
- **@Entity**: mapea o objeto para o banco de dados.
- **@Table**: possibilita a customização da tabela no banco de dados.
- **@Id** e **@GeneratedValue**: indicam que o campo `id` é a chave primária e criado automaticamente pelo banco de dados.
- **@ManyToOne** e **@JoinColumn**: estabele um relacionamento muitos-para-um.
    - Usando **@JoinColumn(name = “foreign_key_name”)** indica que a coluna `foreign_key_name` é a chave estrangeira.
- **@OneToMany(mappedBy = “client”)**: Define um relacionamento de um-para-muitos entre duas tabelas. O atributo `mappedBy` indica que a classe possui o campo `client` que mantém o relacionamento.
- **@Column**: Possibilita a configuração personalizada de uma coluna marcada com a annotation.
- **@OneToOne** e **@MapsId**: estabelecem uma relação um-para-um.
- **@ManyToMany(mappedBy = “categories”)**: Estabelece um relacionamento muitos-para-muitos com a outra entidade. O `mappedBy` indica que a entidade atual é o proprietário do relacionamento.
- **@ManyToMany** e **@JoinTable**: configuram o relationamento muitos-para-muitos, especificando a tabela de junção `tb_product_category` e as chaves estrangeiras de ambas as entidades.
    - O parametro `joinColumns` recebe o valor `@JoinColumn` com o id da entidade que está estabelecendo o relacionamento.
    - O parametro `inverseJoinColumns` recebe o valor `@JoinColumn` com o id da entidade da outra ponta do relacionamento.
- **@Embeddable**: Marca a classe como incorporável em outras entidades
- **@EmbeddedId**: Utiliza a classe da chave primária como chave primária da entidade, aproveitando as configurações de chave composta.
- **@**:

### Links úteis
- [Revisão de Álgebra Relacional e SQL](https://www.youtube.com/watch?v=GHpE5xOxXXI)
- [Revisão de OO e SQL com Java e JDBC](https://www.youtube.com/watch?v=xC_yKw3MYX4)
- [Nivelamento ORM - JPA e Hibernate](https://www.youtube.com/watch?v=CAP1IPgeJkw)
- [Date-time em Java](https://www.youtube.com/watch?v=WnJUI-jMQGE) (LocalDate, LocalDateTime e Instant)


## ✅ Status
- [ ] Concluído
- [x] Em andamento
- [ ] Não iniciado
