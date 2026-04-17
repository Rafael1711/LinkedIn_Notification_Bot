# 🔔 LinkedIn Notification Bot

Automação inteligente que monitora seu LinkedIn em tempo real e envia notificações por e-mail com o status das suas mensagens — eliminando a necessidade de checagem manual.

---

## 🚀 Problema resolvido

Verificar constantemente o LinkedIn para não perder mensagens importantes é improdutivo e facilmente negligenciado.

👉 Este projeto automatiza esse processo, garantindo que você seja notificado sempre que houver algo pendente.

---

## ⚡ O que essa solução entrega

- 🔐 Login automatizado no LinkedIn
- 📩 Detecção de mensagens não lidas via análise do DOM
- 📧 Notificação automática por e-mail (com ou sem pendências)
- 🤖 Execução rápida e pronta para ser agendada

---

## 🧠 Diferenciais técnicos

- Identificação de estados dinâmicos da interface (badge de notificações)
- Uso de seletores resilientes para reduzir quebra de automação
- Separação de responsabilidades com Page Object Model (POM)
- Leitura segura de credenciais externas (boa prática de segurança)
- Integração backend com serviço de e-mail (Jakarta Mail)

---

## 🛠️ Stack utilizada

- Java
- Selenium WebDriver
- Jakarta Mail

---

## ⚙️ Fluxo da automação

1. Acessa o LinkedIn
2. Realiza login com credenciais externas
3. Verifica a presença do indicador de mensagens não lidas
4. Dispara um e-mail com o resultado da verificação

---

## 📬 Output da automação

**📩 Com mensagens pendentes**
> Você tem novas mensagens no LinkedIn. Acesse para verificar.

**✅ Sem pendências**
> Nenhuma nova mensagem encontrada. Tudo em dia!

---

## 💡 Valor prático

- Evita perda de oportunidades (networking, recrutamento, negócios)
- Reduz necessidade de checagens manuais
- Base pronta para evolução em sistemas de monitoramento e alertas

---

## 🔮 Possíveis evoluções

- 📱 Notificações via WhatsApp ou Telegram
- ⏱️ Execução automática com scheduler (cron)
- ☁️ Deploy em ambiente cloud (execução contínua)
- 📊 Dashboard com histórico de verificações

---

## 👨‍💻 Autor

Rafael