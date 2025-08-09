# 1.1 - Componentes e Injeção de Dependência

## 📚 Conteúdo Estudado
- Preparação de ambiente
- Sistema e componentes
- Inversão de controle e injeção de dependência
- Frameworks (Spring Boot)
- Criação de projeto Spring Boot
- Implementação de componentes no Spring Boot

## 🎯 Objetivos de Aprendizado
- [x] Aprender a preparar um ambiente para desenvolvimento com Java e Spring
- [x] Construir componentes coesos e desacoplados
- [x] Aprender a delegar o controle de dependências
- [x] Aprender a utilizar a injeção de dependências
- [x] Apreder sobre framekworks
- [x] Criar um projeto com Spring Boot
- [x] Implementar componentes utilizando Spring

## 🔧 Projetos/Exercícios
- **desafio-componentes/**: Desafio prático do módulo
- **exemplos-spring-boot/**: Exemplos básicos de configuração
- **ioc-examples/**: Demonstrações de inversão de controle

## 📝 Anotações Importantes
### Conceitos
- Um sistema é composto por **componentes**
    - Cada componente é uma parte do sistema.
    - Componentes devem ser coesos e desacoplados entre si.
    - Um componente deve ter uma única responsabilidade.
    - Essa abordagem facilita a manitenção e aumenta a flexibilidade.
- A **inversão de controle** garante que os componentes se mantenham desacoplados
    - Um componente não deve ter controle sobre suas dependências.
    - O controle da dependência é geralmente passado para um _framework_ ou container.
- A **injeção de dependência** é utilizada quando um sistema utiliza a _inversão de controle_.
    - A dependência deve ser injetada no componente
    - Algumas formas de injeção: construtor, método set, _frameworks_
- **Framework** é um conjunto de ferramentas com uma infraestrutura que possibilita a produtividade no desenvolvimento de sistemas. A infraestrutura pode incluir:
    - Injeção de dependência
    - Transações no banco de dados
    - O ciclo de vida e o escopo de componentes
    - Configurações
    - Integrações
    - Outras funcionalidades

### Comandos importantes
- **@SpringBootApplication**: prepara o projeto Java para ser uma aplicação Spring Boot.
- **@Component**: annotation do pacote _org.springframework.stereotype_. Registra uma classe como componente do sistema.
- **@Service**: Registra o componente sematicamente como um serviço do sistema.
- **@Autowired**: injeta as dependências.

### Links úteis
- [Spring Initializr](https://start.spring.io/)

## ✅ Status
- [x] Concluído
- [ ] Em andamento
- [ ] Não iniciado
