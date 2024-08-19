## Projeto de Extensão - Java

### Ideia principal: 
Aplicativo de cadastro pontos turísticos e perfil usuários para uma agência de viagens
### Detalhamento do projeto: 
O objetivo do projeto seria cadastrar no banco de dados pontos turísticos de diversos lugares e perfil de usuários com as suas preferências (tipos de atividades, orçamento e interesses) para que esses dados sejam usados posteriormente em um sistema de recomendação que sugere atividades, passeios e experiências de acordo com o interesse do usuário. 
### Relato da dor do cliente: 
A agente de turismo precisa fazer diariamente sugestões de guia de viagem para seus clientes e não possui as características do perfil de seus clientes. Ela também possui um planilha com informações dos melhores pontos turísticos e atrações de diferentes lugares, a qual ela sempre tem que ir procurando manualmente a melhor opção para seu cliente na planilha.
### Detalhamento do sistema que será desenvolvido:
Nesta fase do projeto será desenvolvido um CRUD de pontos turísticos com localização, valores, tipos de atividades (culinária, aventura, cultura) e horário de funcionamento dos pontos turísticos. Será permitido o cadastro de pontos turísticos individuais ou via planilha csv.
Além disso, um CRUD de perfil de usuários, incluindo nome, idade, preferências de tipos de atividades, preferências de países e estados e média de gasto estimado. Ambos sendo salvos em banco de dados relacional Postgresql usando a linguagem JAVA.
