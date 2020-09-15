class Aluno(val ra: Int, var nome: String, var sobreNome: String) {
    fun assistirAulas(aula: Aula) {
        println("Assistindo aula de ${aula.materia.nome}")
    }

    fun fazerLicoesDeCasa(materia: Materia) {
        println("Fazendo a lição de casa de ${materia.nome}")
    }
}