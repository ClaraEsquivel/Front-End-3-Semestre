const listaDeNumeros = [-2, -1, 2, 3, 4]

//const numerosPositivos = listaDeNumeros.filter(n => n > 0)
//const somaPositivos = numerosPositivos.reduce((soma, total) => soma + total, 0)

const numerosPositivosSoma = listaDeNumeros.filter(n => n > 0).reduce((soma, total) => soma + total , 0)

const numerosNegativos = listaDeNumeros.filter(n => n < 0).length

console.log(`Quantidade de negativos: ${numerosNegativos}`)
console.log(`Soma de positivos: ${numerosPositivosSoma}`)