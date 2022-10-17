//Reunião das chamadas de classe e instanciamento de objetos

//Importação de classes externas via módulos
import User from './20220526_User.js';
import Admin from './20220526_Admin.js';
import Docente from './20220526_Docente.js';

//Instanciamento de novo objeto com valores dos atributos
const novoUser = new User('Mariana', 'm@m.com', '2002-08-12');
const novoAdmin = new Admin('Rodrigo', 'r@r.com', '2002-07-30');
const novoDocente = new Docente ('Gilherme', 'g@g.com', '2000-03-21');
//Evocação do método .exibirInfos() do objeto novoUser, novoAdmin e novoDocente
console.log(novoUser.exibirInfos());
console.log(novoAdmin.exibirInfos());
console.log(novoDocente.exibirInfos());
//Exibição do valor de retorno da função getter nome do objeto novoAdmin e novo docente 
console.log('Admin ' + novoAdmin.getNome);
console.log('Docente ' + novoDocente.getNome);
//Chamada da função getter alteraNome(arg) e exibição do valor de retorno da função getter pegaNome, do objeto novoAdmin 
novoAdmin.setNome = 'André';
console.log('Novo nome Admin ' + novoAdmin.getNome);

//-----Comentado pois é apenas um teste de caso-----
// novoAdmin.setNome = '';
// console.log(novoAdmin.getNome);
