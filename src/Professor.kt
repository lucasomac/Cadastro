class Professor (val rd: Int, var nome: String) : Docencia{
    override fun darAulas(aula: Aula) {
        println("Dando aula da matéria ${aula.materia.nome}, que começa as ${aula.horaInicio}" +
                " e termina as ${aula.horaTermino}")
    }

    override fun fazerChamada() {
        println("Fazendo chamada")
    }


}