import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { faSearch,faUser,faList } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome'
@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FontAwesomeModule],
  templateUrl: './app.html',

  styleUrl: './app.scss'
})
export class App {
  protected readonly nomeUsuario = signal('Luiz');
  protected readonly faSearch = faSearch;
  protected readonly faUser = faUser;
  protected readonly faList = faList;
}
