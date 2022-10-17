//Criação de objetos literais com as propriedades definidas
const user = {
    nome: "Juliana",
    email: 'j@j.com',
    nascimento: '2021/01/02',
    role:'estudante',
    ativo: true,
    exibirInfos: function(){
        console.log(this.nome,this.email);
    }
};

const admin = {
    nome: "Mariana",
    email: 'm@m.com',
    nascimento: '2021/05/02',
    role:'admin',
    ativo: true,
    criarCurso(){
        console.log("Curso criado!");
    }
};
//Uso o método para definir herança via protótipo, onde o objeto admin receberá as propriedades de user
Object.setPrototypeOf(admin, user);
//Chamada de método nativo e método herdado
admin.criarCurso();
admin.exibirInfos();
