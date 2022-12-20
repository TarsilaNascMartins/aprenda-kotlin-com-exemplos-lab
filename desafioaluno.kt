enum class Nivel {BASICO, INTERMEDIARIO, DIFICIL}

class Usuario (val nome: String)  

data class ConteudoEducacional(var nome: String, var duracao: Int , val nivel : Nivel){
//     companion object {
//    fun conteudo(nome: String, duracao: Int) = println("$nome, $duracao hours") }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
           
    fun matricular(usuario: Usuario) {
        val usuarios = usuario.nome
       // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
      inscritos.add(usuario)
      println("O aluno $usuarios está inscrito no curso $nome com o seguinte conteudo"
              +"\n $conteudos")
    }
}

fun main() {
  //  TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
  //  TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    
//   val usuario = listOf(
//   Usuario("Bob"),
//   Usuario("Tarsila"),
// )

  

//   usuario.forEach {
//     println(it.nome)
// }
  
  
   //testando entrada de usuário
  val usuario = Usuario("Bob")
  
   //testando entrada de Conteudo Educacional
  val conteudo1 = ConteudoEducacional("Mobile", 30, Nivel.BASICO)

  //testando entrada de informações da Formação
  val formacao = Formacao("Mobile", listOf(conteudo1))
  
  //matriculando aluno
  formacao.matricular(usuario)
   
}
