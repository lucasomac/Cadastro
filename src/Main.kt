import java.sql.Time

fun main() {
    val aulaKotlin = Aula(Materia("Kotlin"), Time(10, 30, 0), Time(11,20,0))
    val aulas = ArrayList<Aula>()
    aulas.add(aulaKotlin)
    val alunos = ArrayList<Aluno>()
    val aluno1 = Aluno (1, "Lucas", "Macedo")
    val aluno2 = Aluno (2, "Sarah", "Carneiro")
    val aluno3 = Aluno (3, "Gustavo", "Santos")
    val aluno4 = Aluno (3, "Joao", "Oveira")
    alunos.add(aluno1)
    alunos.add(aluno2)
    alunos.add(aluno3)
    val curso = Curso("cursoKotlin", aulas, alunos, Professor(1, "Victoria"))
    val cursoFS = Curso("cursoFS", aulas, alunos, Professor(1, "Victoria"))
    val turma = Turma ("Turma04", curso)
    val turmaFullStack = Turma ("FS", curso)

    curso.professor.darAulas(curso.aulas[0])
    curso.professor.fazerChamada(curso.alunos[0], curso.alunos[1], curso.alunos[2])

    curso.alunos.forEach {
        it.fazerLicoesDeCasa(curso.aulas[0].materia)
        it.assistirAulas(curso.aulas[0])
    }
}