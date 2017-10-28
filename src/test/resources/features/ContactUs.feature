#language: pt
#encoding: iso-8859-1
Funcionalidade: Selenium Teste Exemplo

  @selenium
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "automationpractice.com/index.php" 
    E pesquiso pelo produto "Dress" 
    Quando clico no botão "Add to cart"
    Entao deve apresentar a mensagem "Product sucessfully added to "
    
  @treinamento
  Cenario: Enviar mensagem via Contact Us
    Dado que estou na homepage do site "http://automationpractice.com/index.php"
    Quando clico no botão "Contact Us"
    E clicar no botão Subject Heading no campo "id_contact"
    E selecionar a opção "selector focus hover"
    E inserir o email "automacaotreinamento@gmail.com" no campo "email"
    E inserir o texto "Teste" no campo "message"
    E clicar no campo "submitMessage"
    Entao irá confirmar o envio com a mensagem "alert alert-success"