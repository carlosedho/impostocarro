# impostocarro
Esse programa Java informa qual é o preço final baseado no imposto de um carro com duas variáveis: o preço do carro e o ano do carro e informa o preço final do mesmo em uma terceira variável. Ele utiliza uma condicional if para, se o ano do carro for anterior ao ano de 2000, ele fazer um determinado cálculo, como presente no trecho: 

if (anoCarro < 2000){
            precoFinal = precoCarro + (precoCarro * 0.01);
            System.out.println("O preço final do carro é de: " + precoFinal);
        }

se não for o caso, ele calcula e dá output do seguinte valor:

else{
            precoFinal = precoCarro + (precoCarro * 0.015);
            System.out.println("O preço final do carro é de: " + precoFinal);

        }
