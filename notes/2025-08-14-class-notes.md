## Princípio de Substituição de Liskov (LSP)

O Princípio de Substituição de Liskov é o terceiro princípio do SOLID, formulado por Barbara Liskov. Estabelece que objetos de uma superclasse devem poder ser substituídos por objetos de suas subclasses sem alterar a funcionalidade do programa.

**Definição:** Se S é um subtipo de T, então objetos do tipo T podem ser substituídos por objetos do tipo S sem quebrar as propriedades do programa.

### Violações Comuns

- **Fortalecimento de pré-condições:** Quando subclasses impõem restrições mais rigorosas que a classe base.
- **Enfraquecimento de pós-condições:** Quando subclasses oferecem garantias mais fracas que a classe base.
- **Lançamento de exceções:** Métodos sobrescritos que lançam exceções não previstas na classe base.

### Exemplos de Violação

- **Retângulo/Quadrado:** Um quadrado que herda de retângulo pode quebrar a expectativa de que largura e altura sejam independentes.
- **Ave/Pinguim:** Um pinguim que herda de ave mas não consegue voar viola a expectativa do método voar().

### Como Identificar Violações

- Uso de verificações de tipo (instanceof) antes de usar objetos
- Métodos vazios ou que lançam exceções em subclasses
- Comportamentos inesperados ao substituir objetos

### Benefícios da Aplicação Correta

O LSP garante que o polimorfismo funcione de forma confiável, facilitando testes, manutenção e extensibilidade do sistema. Promove hierarquias de classes bem projetadas onde as substituições são seguras e previsíveis.
