# Sistema de Conta Bancária (Console Application)

Este é um sistema de simulação bancária desenvolvido em **Java**, focado na aplicação prática de conceitos de **Programação Orientada a Objetos (POO)** e na organização estruturada de camadas (Clean Code).

O projeto simula de forma interativa a criação de uma conta, depósitos, saques (com aplicação de taxa) e consulta de dados, rodando diretamente no terminal.

## 🚀 Funcionalidades
* **Abertura de Conta:** Cadastro de número da conta e titular, com opção de depósito inicial flexível.
* **Depósitos:** Operação validada para aceitar apenas valores positivos.
* **Saques com Taxa:** Realização de saques com cobrança fixa de taxa administrativa (R$ 5,00), incluindo validação prévia de saldo insuficiente.
* **Tratamento de Exceções:** Sistema robusto que impede o fechamento inesperado da aplicação em caso de dados inválidos.

## 📦 Arquitetura e Organização do Código
O projeto foi estruturado utilizando pacotes para garantir a **Separação de Conceitos (Separation of Concerns)**:

* `application`: Contém a classe `Program`, responsável por iniciar e orquestrar o ciclo de vida da aplicação.
* `entities`: Contém a classe `Account`, que encapsula o estado e os dados da conta bancária.
* `services`: Contém a classe `AccountService`, responsável por isolar toda a lógica de negócio, validações e regras de depósito/saque.
* `menu`: Contém a classe `Menu`, que cuida exclusivamente da interface de usuário via console, leituras de teclado e controle do fluxo do `Scanner` (evitando bugs de buffer).

## 🛠️ Tecnologias Utilizadas
* **Java SE 25**
* **Scanner API** (com tratamento de localização `Locale.US` para compatibilidade de pontos decimais)

## 🔧 Como Executar o Projeto

1. Clona o repositório:
   ```bash
   git clone [https://github.com/pedrHRN/system-contabanca.git](https://github.com/pedrHRN/system-contabanca.git)
