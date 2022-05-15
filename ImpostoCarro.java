/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package impostocarro;
import java.util.Scanner;

public class ImpostoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o preço do carro: ");
        double precoCarro, anoCarro, precoFinal;
        precoCarro = input.nextDouble();
        System.out.println("Informe o ano do carro: ");
        anoCarro = input.nextDouble();
        if (anoCarro < 2000){
            precoFinal = precoCarro + (precoCarro * 0.01);
            System.out.println("O preço final do carro é de: " + precoFinal);
        }
        else{
            precoFinal = precoCarro + (precoCarro * 0.015);
            System.out.println("O preço final do carro é de: " + precoFinal);

        }
    }
    
}