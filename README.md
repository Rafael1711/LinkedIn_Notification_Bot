# 🔔 LinkedIn Notification Bot

Automação inteligente que monitora seu LinkedIn em tempo real, envia notificações por e-mail e fornece feedback visual da execução — eliminando completamente a necessidade de checagem manual.

---

## 🚀 Problema resolvido

Verificar constantemente o LinkedIn para não perder mensagens importantes é improdutivo e facilmente negligenciado.

👉 Este projeto automatiza esse processo, garantindo visibilidade imediata do status das suas mensagens.

---

## ⚡ O que essa solução entrega

- 🔐 Login automatizado no LinkedIn
- 📩 Detecção de mensagens não lidas via análise do DOM
- 📧 Notificação automática por e-mail (com ou sem pendências)
- 🖥️ Feedback visual em tempo real via interface (Java Swing)
- 🤖 Execução rápida e pronta para ser agendada

---

## 🧠 Diferenciais técnicos

- Identificação de estados dinâmicos da interface (badge de notificações)
- Uso de seletores resilientes para reduzir quebra de automação
- Arquitetura baseada em Page Object Model (POM)
- Leitura segura de credenciais externas (boa prática de segurança)
- Integração backend com serviço de e-mail (Jakarta Mail)
- 💬 Feedback interativo via modais (status, envio e resultado da operação)

---

## 🛠️ Stack utilizada

- Java
- Selenium WebDriver
- Jakarta Mail
- Java Swing (interface de feedback)

---

## ⚙️ Fluxo da automação

1. Acessa o LinkedIn
2. Realiza login com credenciais externas
3. Verifica a presença do indicador de mensagens não lidas
4. Exibe feedback visual do status da verificação
5. Inicia envio de e-mail com notificação
6. Retorna feedback visual de sucesso ou erro

---

## 📬 Output da automação

### 📩 Com mensagens pendentes
> Você tem novas mensagens no LinkedIn. Acesse para verificar.

### ✅ Sem pendências
> Nenhuma nova mensagem encontrada. Tudo em dia!

### 🖥️ Feedback visual (interface)
- Status da verificação exibido em modal
- Indicador de envio de e-mail
- Confirmação de sucesso ou erro na entrega

---

## 💡 Valor prático

- Evita perda de oportunidades (networking, recrutamento, negócios)
- Reduz necessidade de checagens manuais
- Fornece visibilidade imediata da execução da automação
- Base pronta para evolução em sistemas de monitoramento e alertas

---

## 🔮 Possíveis evoluções

- 📱 Notificações via WhatsApp ou Telegram
- ⏱️ Execução automática com scheduler (cron)
- ☁️ Deploy em ambiente cloud (execução contínua)
- 📊 Dashboard com histórico de verificações
- 🔔 Sistema de alertas multicanal

---

## 👨‍💻 Autor

Rafael