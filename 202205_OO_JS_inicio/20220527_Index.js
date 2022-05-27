//Reunião das chamadas de classe e instanciamento de objetos

//Importação de classes externas via módulos
import User from './20220526_User.js';
import Admin from './20220526_Admin.js';
import Docente from './20220526_Docente.js';

//Instanciamento de novo objeto com valores dos atributos
const novoUser = new User('Mariana', 'm@m.com', '2002-08-12');
const novoAdmin = new Admin('Rodrigo', 'r@r.com', '2002-07-30');
//Evocação do método .exibirInfos() do objeto novoUser e novoAdmin
console.log(novoUser.exibirInfos());
console.log(novoAdmin.exibirInfos());
