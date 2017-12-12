# dm110
1º Exercício -  Desenvolvimento JavaEE - DM110 - PÓS-GRADUAÇÃO EM DESENVOLVIMENTO DE APLICAÇÕES PARA DISPOSITIVOS MÓVEIS E CLOUD COMPUTING

## Detalhes da interface REST:

### Somar:

* URL: /calculadora/rest/calc/sum
* Método: GET
* Parâmetros:
  * `first` (parâmetro de query)
  * `second` (parâmetro de query)
* Resposta: JSON com os parâmetros e o resultado ( `{ "first": "1", "second": "2", "result": "3" }` ).

### Subtrair:

* URL: /calculadora/rest/calc/subtract
* Método: POST
* Parâmetros:
  * `first` (parâmetro de formulário)
  * `second` (parâmetro de formulário)
* Resposta: JSON com os parâmetros e o resultado ( `{ "first": "1", "second": "2", "result": "-1" }` ).
