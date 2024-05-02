<!DOCTYPE html> 
<html> 
    <head> 
        <title>Calculador de Imposto</title> 
    </head>
    <body> 
        <h1>Calculador de Imposto</h1>
        <form action="calcularImposto" method="post">
            <label for="areaTotal">Área Total:</label>
            <input type="text" name="areaTotal"><br>
            <label for="idade">Idade do Imóvel:</label>
            <input type="text" name="idade"><br>
            <label for="numComodos">Número de Cômodos:</label>
            <input type="text" name="numComodos"><br>
            <label for="numQuartos">Número de Quartos:</label>
            <input type="text" name="numQuartos"><br>
            <label for="areaGaragem">Área da Garagem:</label>
            <input type="text" name="areaGaragem"><br>
            <input type="submit" value="Calcular">
        </form>
        <c:if test="${not empty resultado}">
            <p>Resultado do cálculo do imposto: R$ ${resultado}</p>
        </c:if>
    </body>
 </html>