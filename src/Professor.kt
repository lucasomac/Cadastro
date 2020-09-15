class Professor (val rd: Int, var nome: String) : Docencia{
    override fun darAulas(vararg aulas: Aula) {
        aulas.forEach {
            println("Dando aula da matéria ${it.materia.nome}, que começa as ${it.horaInicio}" +
                    " e termina as ${it.horaTermino}")
        }
    }

    override fun fazerChamada(vararg alunos : Aluno) {
        println("Fazendo chamada")
        alunos.forEach { println("Chamando ${it.nome} ${it.sobreNome}") }
    }


}