import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuOpcoes } from './menu-opcoes';

describe('MenuOpcoes', () => {
  let component: MenuOpcoes;
  let fixture: ComponentFixture<MenuOpcoes>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MenuOpcoes]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MenuOpcoes);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
