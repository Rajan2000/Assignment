import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingorderstatusComponent } from './shoppingorderstatus.component';

describe('ShoppingorderstatusComponent', () => {
  let component: ShoppingorderstatusComponent;
  let fixture: ComponentFixture<ShoppingorderstatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShoppingorderstatusComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingorderstatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
