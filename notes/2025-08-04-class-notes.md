- Coesão é a propriedade que indica que uma classe deve ter uma única responsabilidade ou funcionalidade. Todos os seus métodos e atributos devem estar relacionados a esse único propósito. Isso facilita o entendimento, manutenção, teste e reúso da classe, além de permitir uma melhor organização e divisão de responsabilidades no projeto. O conceito está diretamente ligado à separação de interesses, que também defende que cada classe deve tratar de apenas um único "interesse" ou responsabilidade.

- Acoplamento é o grau de dependência entre duas classes. Ele pode ser aceitável quando uma classe utiliza apenas métodos públicos e estáveis de outra classe, o que reduz o risco de impactos com mudanças. Já o acoplamento ruim ocorre quando alterações em uma classe afetam facilmente outra, como em casos de uso de variáveis globais ou interfaces instáveis.

Acoplamento ruim deve ser evitado, pois causa fragilidade no sistema. Idealmente, deve-se buscar maximizar a coesão (classes com responsabilidades bem definidas) e minimizar o acoplamento (reduzir dependências desnecessárias), sem eliminar totalmente a interação entre classes, já que ela é muitas vezes necessária.

