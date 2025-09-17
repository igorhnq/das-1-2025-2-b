- Princípio de Substituição de Liskov (LSP): Objetos de uma superclasse devem ser substituíveis por objetos de suas subclasses sem quebrar a funcionalidade do programa. Isso significa que uma subclasse deve poder ser usada em qualquer lugar onde sua superclasse é esperada, sem alterar o comportamento esperado.

- O princípio garante que a herança seja usada corretamente, mantendo a consistência comportamental entre classes pai e filhas. Se uma subclasse não pode substituir completamente sua superclasse, então a relação de herança está mal projetada.

- Exemplo de violação: Uma classe `Pinguim` que herda de `Ave` mas não pode voar, enquanto a classe `Ave` tem um método `voar()`. Isso viola o LSP porque nem todas as aves podem voar, mas o contrato da superclasse sugere que sim.

- Para respeitar o LSP, devemos garantir que:
  - Pré-condições de métodos da subclasse não sejam mais restritivas que as da superclasse
  - Pós-condições de métodos da subclasse não sejam mais fracas que as da superclasse
  - Invariantes da superclasse sejam preservadas na subclasse
