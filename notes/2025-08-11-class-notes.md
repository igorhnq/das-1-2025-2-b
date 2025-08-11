- Princípio de Inversão de Dependências: A ideia é trocar as dependências: em vez de depender de classes concretas, clientes devem depender de interfaces.

- Prefira Composição a Herança: Devido ao forte acomplamento que existe entre subclasses e superclasses, a solução por meio de herança não é recomendada.

- Princípio de Demeter ou  Princípio do Menor Conhecimento: Defende que a implementação de um método deve invocar apenas os seguintes outros métodos:

de sua própria classe (caso 1)

de objetos passados como parâmetros (caso 2)

de objetos criados pelo próprio método (caso 3)

de atributos da classe do método (caso 4)

- Princípio Aberto/Fechado: Uma classe deve estar fechada para modificações e aberta para extensões. 