enum class Nivel {BASICO, INTERMEDIARIO, DIFICIL}
class Usuario (val nome: String)  
data class ConteudoEducacional(var nome: String, var duracao: Int , val nivel : Nivel){
//     companion object {
//    fun conteudo(nome: String, duracao: Int) = println("$nome, $duracao hours") }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
    
     val inscritos = mutableListOf<Usuario>()
         
     fun matricular(usuario: Usuario) {
    
               if(inscritos.contains(usuario)){
               println("\nUsuário já cadastrado! Não será realizada a matrícula!")
               
               } else{   
               val usuarios = usuario.nome
               inscritos.add(usuario)
               println("\nCadastro realizado com sucesso!O aluno $usuarios está inscrito no curso: "
              +"\n$nome com o seguinte conteudo $conteudos")
     }


}
fun main() {
    
   //testando entrada de usuário
  val usuario1 = Usuario("Bob")
  val usuario2 = Usuario("Patrick")
  val usuario3 = Usuario("Molusco")
 
   //testando entrada de Conteudo Educacional
  val conteudoMobile = ConteudoEducacional("Desenvolvedor Mobile", 30, Nivel.BASICO)
  val conteudoDados = ConteudoEducacional("Cientista de Dados", 20, Nivel.INTERMEDIARIO)
  val conteudoUX = ConteudoEducacional("Designer UX", 60, Nivel.DIFICIL)
     
    //testando entrada de informações da Formação
  val formacaoMobile = Formacao("Kotlin, Layout, Firebase, API", listOf(conteudoMobile))
  val formacaoCientistaDados = Formacao("SQL, Python, Cloud Computer", listOf(conteudoDados))
  val formacaoUX = Formacao("Arquitetura UX, Figma, Protótipos", listOf(conteudoUX))
   
  //matriculando aluno
  formacaoMobile.matricular(usuario1)
  formacaoCientistaDados.matricular(usuario2)
  formacaoUX.matricular(usuario3)
    
    //matriculando aluno repetido
  formacaoMobile.matricular(usuario1)
     
}
