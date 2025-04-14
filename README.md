# Conversor de Moedas

Este projeto é um **Conversor de Moedas** que utiliza uma API de taxas de câmbio para realizar conversões entre diferentes moedas.  
Ele foi desenvolvido em **Java** utilizando o **Maven** como gerenciador de dependências e segue os princípios do **SOLID** para garantir um código modular, escalável e de fácil manutenção.

---

## 📖 Análise de Linguagem Ubíqua

### Contexto
O sistema é um conversor de moedas que permite ao usuário realizar conversões entre diferentes moedas com base em taxas de câmbio obtidas de uma API externa.

### Termos Principais
- **Moeda (Currency):** Representa o tipo de dinheiro usado em um país, como USD (Dólar Americano), BRL (Real Brasileiro), EUR (Euro), etc.
- **Taxa de Câmbio (Exchange Rate):** O valor que define a relação entre duas moedas, usado para calcular a conversão.
- **Conversão (Conversion):** O processo de transformar um valor em uma moeda para o valor equivalente em outra moeda.
- **API de Taxas de Câmbio (Exchange Rate API):** Serviço externo que fornece as taxas de câmbio atualizadas.

### Fluxo Principal
1. O usuário escolhe as moedas de origem e destino.
2. O usuário insere o valor a ser convertido.
3. O sistema consulta a API de taxas de câmbio para obter a taxa de conversão.
4. O sistema calcula o valor convertido e exibe o resultado ao usuário.

---

## 🚀 Como Clonar e Executar o Projeto

### Pré-requisitos
- **Java 17** ou superior instalado.
- **Maven** instalado.
- Uma conta em um serviço de API de taxas de câmbio (ex.: ExchangeRate-API) para obter a chave de API.
- Configuração de variáveis de ambiente para `API_KEY` e `BASE_URL`.

### Passos para Clonar o Repositório
1. Abra o terminal e navegue até o diretório onde deseja clonar o projeto.
2. Execute o comando abaixo para clonar o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>