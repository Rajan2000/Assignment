import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrationmoduleComponent } from './registrationmodule.component';

describe('RegistrationmoduleComponent', () => {
  let component: RegistrationmoduleComponent;
  let fixture: ComponentFixture<RegistrationmoduleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrationmoduleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegistrationmoduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
