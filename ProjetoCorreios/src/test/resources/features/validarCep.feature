
@tag
Feature: Buscar Cep
  Como usuario
  Quero acessar o site dos correios 
  Para validar Cep existentes 
  
  Background: Home do sistema 
   Given que esteja na home
   And clicar em aceitar cookies
   
  Scenario: Buscar Cep valido 
When informar um cep valido
And clicar na lupa de busca 
Then o sistema devera  as informacoes do cep informado 
  