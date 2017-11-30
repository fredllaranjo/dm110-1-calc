# dm110
Trabalho de conclus�o Desenvolvimento JavaEE - DM110 - P�S-GRADUA��O EM DESENVOLVIMENTO DE APLICA��ES PARA DISPOSITIVOS M�VEIS E CLOUD COMPUTING

## Detalhes da interface REST:

### Somar:

* URL: /calculadora/rest/calc/sum
* M�todo: GET
* Par�metros:
  * `first` (par�metro de query)
  * `second` (par�metro de query)
* Resposta: JSON com os par�metros e o resultado ( `{ "first": "1", "second": "2", "result": "3" }` ).

### Subtrair:

* URL: /calculadora/rest/calc/subtract
* M�todo: POST
* Par�metros:
  * `first` (par�metro de formul�rio)
  * `second` (par�metro de formul�rio)
* Resposta: JSON com os par�metros e o resultado ( `{ "first": "1", "second": "2", "result": "-1" }` ).
