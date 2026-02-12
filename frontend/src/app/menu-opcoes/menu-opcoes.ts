import { Component } from '@angular/core';
import {MatMenuModule} from '@angular/material/menu';
import {MatButtonModule} from '@angular/material/button';

@Component({
  selector: 'app-menu-opcoes',
  imports: [MatButtonModule, MatMenuModule],
  templateUrl: './menu-opcoes.html',
  styleUrl: './menu-opcoes.scss',
})
export class MenuOpcoes {

}
