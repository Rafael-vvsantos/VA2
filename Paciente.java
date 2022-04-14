class Paciente {
  String nome;
  Medico medicoReponsa;
  int diasInternado;
  
  Medico medico1 = new Medico("Roberto");
  
  

  Paciente(String n,int diaInt){
    nome = n;
    diasInternado = diaInt;
  }
  
  void exibirRelatorioPac(){
    System.out.println("Nome Paciente: " + nome + "\nMédico Resposável:" + medico1.nome + "\nDias internado:" + diasInternado);
  }

  int retornarDiasInterndo(){
    
    return diasInternado;
  }
}