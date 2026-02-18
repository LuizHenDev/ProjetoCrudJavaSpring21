import { Component, signal } from '@angular/core';
import { faSearch,faUser,faList } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome'
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';
@Component({
  selector: 'app-header',
  imports: [FontAwesomeModule, MatMenuModule, MatButtonModule],
  templateUrl: './header.html',
  styleUrl: './header.scss',
})
export class Header {
  protected readonly nomeUsuario = signal('Luiz');
  protected readonly faSearch = faSearch;
  variavel = signal('');
  protected readonly faUser = faUser;
  protected readonly faList = faList;
  alterarNomeUsuario() {
    (this.nomeUsuario() =='Luiz' ?this.nomeUsuario.set('Outro') : this.nomeUsuario.set('Luiz'));
  }


}
