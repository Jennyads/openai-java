# openai-java
GPT e Java: integre uma aplicação com a OpenAI


## Erros da API
401 - Invalid Authentication

Causa: a autenticação fornecida é inválida.
Solução: verifique se a chave de API correta e a organização solicitante estão sendo usadas. Certifique-se de que a autenticação esteja configurada corretamente para a chamada da API.
401 - Incorrect API key provided

Causa: a chave de API fornecida não está correta.
Solução: verifique se a chave de API usada está correta. Se houver problemas persistentes, você pode tentar limpar o cache do navegador ou gerar uma nova chave de API válida.
401 - You must be a member of an organization to use the API

Causa: sua conta não faz parte de uma organização.
Solução: entre em contato com a equipe de suporte da OpenAI para te adicionar em uma nova organização. Outra alternativa é pedir a alguém da sua organização para te convidar para fazer parte dela.
429 - Rate limit reached for requests

Causa: você está enviando solicitações com muita rapidez, excedendo o limite da taxa.
Solução: diminua a velocidade das suas solicitações para cumprir os limites de taxa. Consulte o guia de limite de taxa fornecido pela OpenAI (em inglês) para entender as diretrizes.
429 - You exceeded your current quota, please check your plan and billing details

Causa: você atingiu o limite máximo de gastos mensais (limite rígido) definido para sua conta.
Solução: se você deseja aumentar esse limite, pode solicitar um aumento de quota à OpenAI. Verifique também seus detalhes de plano e faturamento.
500 - The server had an error while processing your request

Causa: houve um problema nos servidores da OpenAI ao processar sua solicitação.
Solução: espere por um curto período e tente enviar a solicitação novamente. Se o problema persistir, entre em contato com a equipe de suporte da OpenAI e verifique se há informações adicionais na página de status da OpenAI.
503 - The engine is currently overloaded, please try again later

Causa: os servidores da OpenAI estão enfrentando um alto tráfego e estão sobrecarregados.
Solução: aguarde por um curto período e tente novamente mais tarde. Isso geralmente ocorre quando há um grande volume de solicitações sendo processadas simultaneamente.