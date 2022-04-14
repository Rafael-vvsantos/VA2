class Quarto {
  int numero;
  Paciente paciente01;
  Paciente paciente02;
  Paciente paciente03;


  /*Quarto(int n , Paciente p1, Paciente p2, Paciente p3){
    paciente01 = p1;
    paciente02 = p2;
    paciente03 = p3;
  }*/
  
  int retornarMaxDiasInter(){
    if (paciente01.diasInternado > this.paciente02.diasInternado && paciente01.diasInternado > paciente03.diasInternado){
      return paciente01.diasInternado;
    }else if (paciente02.diasInternado > paciente01.diasInternado && paciente02.diasInternado > paciente03.diasInternado) {
      return paciente02.diasInternado;
    }else{
      return paciente03.diasInternado;
    }
    
  }

  int retornarMinDiasInter(){
    if (paciente01.diasInternado < paciente02.diasInternado && paciente01.diasInternado < paciente03.diasInternado){
      return paciente01.diasInternado;
    }else if (paciente02.diasInternado < paciente01.diasInternado && paciente02.diasInternado< paciente03.diasInternado) {
      return paciente02.diasInternado;
    }else{
      return paciente03.diasInternado;
    }

  }

int diasPorPaciente(int num){
  if (num == paciente01.diasInternado){
    return paciente01.diasInternado;
  } else if (num == paciente02.diasInternado){
    return paciente02.diasInternado;
  }else{
    return paciente03.diasInternado; 
  }
  
}

void verificaQuarto(){
  if(paciente01 == null || paciente02 == null || paciente01 == null){
      System.out.println("Exite cama vazias");
  }else
    System.out.println("Não há espaço");
  }
 

}
