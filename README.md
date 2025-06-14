# 🌪️ GS Android – ClimApp - Gerenciador de Eventos Extremos

**GS Android - ClimApp** é um aplicativo Android desenvolvido para **monitorar, registrar e gerenciar eventos extremos** como enchentes, deslizamentos e outros desastres naturais. Seu objetivo é auxiliar instituições, voluntários e usuários comuns no controle e visualização desses eventos, promovendo uma resposta mais rápida e eficaz.

---

## 🔍 Funcionalidades principais

- 📍 **Registro de eventos extremos:** permite cadastrar novos eventos com informações como tipo (enchente, incêndio etc.), localização e descrição.
- 🗺️ **Visualização geográfica:** integração com mapas para exibir os eventos registrados por localização.
- 🧾 **Listagem e filtros:** apresenta todos os eventos registrados em uma lista, com opções de filtro por tipo e data.
- 📝 **Edição e remoção de eventos:** permite atualizar ou excluir registros existentes.
- 📶 **Integração futura com APIs externas:** base preparada para conectar com bases de dados meteorológicas ou sistemas públicos de alerta.

---

## 🛠️ Tecnologias utilizadas

- **Kotlin** – linguagem principal
- **Android SDK** – framework nativo
- **Jetpack Components** – para arquitetura moderna (ViewModel, LiveData)
- **Google Maps API** *(opcional)* – para visualização dos eventos no mapa

---

## 🚀 Funcionamento

Tela 01 - Tela incial do ClimApp

![image](https://github.com/user-attachments/assets/2f5c8491-e7a9-4e62-bccf-fe6d9e6e94a9)

Tela 02 - Tela logo após a inclusão do primeiro evento extremo

![image](https://github.com/user-attachments/assets/670c4237-cfb4-4410-9600-f27bf9dae7da)

Tela 03 - Tela após a inclusão do segundo evento extremo

![image](https://github.com/user-attachments/assets/7e6b5806-fedb-4349-b2ed-ce6a2292e897)

Tela 04 - Tela após a exclusão do evento extremo 2

![image](https://github.com/user-attachments/assets/2a7e9369-32e2-4284-b6a6-c0cec962eb99)

Tela 5 - Tela após a tentativa de incluir um evento extremo sem todos os dados - Exemplo de funcionamento de validação de dados

![image](https://github.com/user-attachments/assets/641dc644-7e75-4fee-8e0d-c1d2dc8a1a44)

Tela 6 - Tela após a tentativa de incluir um evento extremo com 0 pessoas afetadas - Exemplo de validação de dados do campo

![image](https://github.com/user-attachments/assets/8667f2f1-cf2d-477a-a3bf-7743d87a8b68)

Tela 7 - Tela ao clicar no botão participantes, ao clicar em voltar retornamos para tela incial

![image](https://github.com/user-attachments/assets/e17d15d0-876d-47cd-8901-d7778ae1854b)

Tela 8 - Tela antes do filtro do tipo de evento extremo

![image](https://github.com/user-attachments/assets/140900bd-f820-4c82-a594-1d98f42b1755)

Tela 9 - Tela após a filtragem por tipo de evento extremo

![image](https://github.com/user-attachments/assets/5f4c23a4-7905-4586-86a4-f009e8c9aecc)

Tela 10 - Tela após clicar no botão limpar (o filtro é removido e voltam todos os eventos)

![image](https://github.com/user-attachments/assets/38339f81-161c-4d8c-8d18-5ff9258a2d0e)

