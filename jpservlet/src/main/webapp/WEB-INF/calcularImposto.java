@WebServlet("/calcularImposto")
public class calcularImposto extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double areaTotal = Double.parseDouble(request.getParameter("areaTotal"));
        int idade = Integer.parseInt(request.getParameter("idade"));
        int numComodos = Integer.parseInt(request.getParameter("numComodos"));
        int numQuartos = Integer.parseInt(request.getParameter("numQuartos"));
        double areaGaragem = Double.parseDouble(request.getParameter("areaGaragem"));
        String cidade = request.getParameter("cidade");

        if("SaoPaulo".equals(cidade)) { 
            impostoStrategy = new SaoPauloImpostoStrategy(); 
        } else if("Belo Horizonte".equals(cidade)) {
             impostoStrategy = new BeloHorizonteImpostoStrategy();
             } else if("Curitiba".equals(cidade)) {
                 impostoStrategy = new CuritibaImpostoStrategy();
                 } else if("Porto Alegre".equals(cidade)) {
                     impostoStrategy = new PortoAlegreImpostoStrategy();
                     } else if("São Paulo".equals(cidade)) { 
            impostoStrategy = new SaoPauloImpostoStrategy();
        }
        
        CalculadoraImposto calculadora = new CalculadoraImposto(impostoStrategy);
        double resultado = calculadora.calcularImposto(areaTotal, idade, numComodos, numQuartos, areaGaragem);
    }
}