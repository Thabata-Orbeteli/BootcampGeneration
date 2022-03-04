fun main(){
    /* Exercício 4
    Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
    Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
    Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
-o número de pessoas calmas;
-o número de mulheres nervosas;
-o número de homens agressivos;
-o número de outros calmos;
-o número de pessoas nervosas com mais de 40 anos;
-o número de pessoas calmas com menos de 18 anos.
     */

    var cont = 0
    var idade = 0
    var sexo = 0
    var opc = 0

    while(cont < 6){

        print("****Pessoa ${cont+1}***\n")

        print("Digite a idade: ")
        idade = readLine()!!.toInt()

        print("Digite o seu sexo: 1-Feminino,2 -Masculino e 3- Outros: ")
        sexo = readLine()!!.toInt()

        print("Digite o seu comportamento:  1 para calmo ,2 para nervoso e 3 para agressivo: ")
        opc = readLine()!!.toInt()

        var pCalm = 0
        var mNerv = 0
        var hAgr = 0
        var oCalm = 0
        var pNerv40 = 0
        var pCalm18 =0

        if(opc == 1){
            pCalm++
        }

        if(sexo == 1 && opc == 2){
            mNerv++
        }

        if(sexo == 2 && opc == 3) {
            hAgr++
        }

        if(sexo == 3 && opc == 1){
            oCalm++
        }

        if(idade > 40 && opc == 2){
            pNerv40
        }

        if(idade < 18 && opc == 1){
            pCalm18
        }
        cont++


        println ("O número de pessoas calmas é $pCalm.");
        println ("O número de mulheres nervosas é $mNerv. ")
        println ("O número de homens agressivos é $hAgr.")
        println ("O número de outros calmos é $oCalm.")
        println ("O número de pessoas nervosas com mais de 40 anos é $pNerv40.")
        println ("O número de pessoas calmas com menos de 18 anos é $pCalm18.")

    }

}