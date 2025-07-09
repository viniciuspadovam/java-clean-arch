# CodeChella

App de simulação de um site para venda de ingressos de eventos diversos criado para aprender sobre o Clean Architeture.

## Clean architecture

Proposta por *Robert C. Martin*, também conhecido como "Uncle Bob", a clean architecture (literalmente arquitetura limpa em inglês) visa criar sistemas que sejam independentes de frameworks, UIs e bancos de dados. Ela define uma arquitetura em camadas, com o núcleo da aplicação contendo as regras de negócio mais importantes e as camadas externas contendo detalhes de implementação.

Seus princípios fundamentais:

- **Independência de frameworks**: o código-fonte não deve depender de nenhum framework específico. Os frameworks são ferramentas externas e voláteis que podem mudar com o tempo, então a arquitetura deve ser projetada de forma a isolar o código da aplicação dessas mudanças.
- **Independência de interface do usuário**: a lógica de negócios da aplicação não deve ser diretamente ligada à interface do usuário (UI). Isso permite que diferentes interfaces de usuário (como interfaces web, APIs REST, interfaces de linha de comando etc.) sejam facilmente conectadas à mesma lógica de negócios.
- **Independência de banco de dados**: assim como a UI, o código de acesso a dados não deve ser diretamente acoplado à lógica de negócios. Isso permite que diferentes sistemas de armazenamento de dados (como bancos de dados SQL, NoSQL, serviços de armazenamento em nuvem etc.) sejam facilmente substituídos ou alterados sem afetar a lógica de negócios.
- **Independência de políticas (ou agentes externos)**: a regra de negócios deve ser independente de detalhes de implementação, como políticas de persistência, políticas de UI- , políticas de segurança etc. Isso permite que diferentes políticas sejam facilmente alternadas ou modificadas sem alterar o núcleo da aplicação.

Com base nesses princípios, a clean architecture organiza o código em camadas concêntricas, em que o núcleo da aplicação (conhecido como "entidades de negócio" ou "domínio") é cercado por camadas que contêm detalhes de implementação, como interfaces com o usuário, acesso a dados etc. As camadas são organizadas em um formato de anéis concêntricos, com o núcleo da aplicação no centro e as camadas externas ao redor.

As camadas típicas em uma clean architecture incluem:

![Clean Architeture Model](./public/assets/clean_arch.webp)

- **Entidades de negócio (entities)**: é a camada mais interna e contém as entidades de domínio ou objetos de negócio que representam conceitos do domínio da aplicação. As entidades de negócio encapsulam o estado e o comportamento da aplicação e são independentes de qualquer detalhe de implementação.
- **Casos de uso (use cases ou interactors)**: esta camada contém os casos de uso da aplicação, ou seja, serviços e operações que a aplicação oferece aos usuários. Os casos de uso orquestram a execução das operações de negócio, utilizando as entidades de domínio e coordenando a interação com as camadas externas.
- **Controladores, presenters e gateways**: são as camadas externas responsáveis por traduzir as entradas e saídas da interface do usuário para os casos de uso da aplicação e vice-versa. Eles adaptam os dados e os eventos entre a UI e os casos de uso, garantindo a separação de responsabilidades e a independência entre essas camadas.

**Interfaces do usuário (UI), frameworks e drivers**: esta camada contém as interfaces com o usuário, como interfaces web, APIs REST, interfaces de linha de comando etc. Ela é responsável por receber as solicitações do usuário, apresentar informações e coletar entradas, mas não contém lógica de negócios. Esta camada também contém os detalhes de implementação específicos, como frameworks, bibliotecas e drivers. Ela inclui código para lidar com detalhes de infraestrutura, como acesso a dados, comunicação de rede etc. Esses detalhes são encapsulados e isolados das camadas internas da aplicação.

## 🔨 Objetivos do projeto

- Conhecer os diferentes tipos de arquitetura de software;
- Aprender os princípios da Clean Architecture;
- Implementar um projeto com separação de responsabilidades e isolamento do domínio;
- Entender sobre entidades, objetos de valor, casos de uso, repositórios e controladores;
- Analisar os prós e contras de arquiteturas que utilizam muitas camadas de abstração.


