import { Component, OnInit } from '@angular/core';
import { Tutorial } from 'src/app/models/tutorial.model';
import { TutorialService } from 'src/app/services/tutorial.service';
import { FormGroup, FormControl, Validators} from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-tutorial',
  templateUrl: './add-tutorial.component.html',
  styleUrls: ['./add-tutorial.component.css']
})
export class AddTutorialComponent implements OnInit {
  websiteList: any = ['Triangulo', 'Cuadrado', 'Circulo']
  opcionSeleccionado: string  = '0';
  verSeleccion: string        = '';
   
  form = new FormGroup({
    website: new FormControl('', Validators.required)
  });
   
  get f(){
    return this.form.controls;
  }
  tutorial: Tutorial = {
    id:0,
    superficie: 0,
    tipoFigura: '',
    base: 0,
    altura: 0,
    diametro: 0
  
  };
  submitted = false;

  constructor(private tutorialService: TutorialService) { }

  ngOnInit(): void {
  }

  capturar() {
    // Pasamos el valor seleccionado a la variable verSeleccion
    this.verSeleccion = this.opcionSeleccionado;
    console.log("data Create", this.verSeleccion  )
   }

  saveTutorial(): void {
    const data = {
      id:0,
      base: this.tutorial.base,
      altura: this.tutorial.altura,
      diametro: this.tutorial.diametro,
      superficie: this.tutorial.superficie,
      tipoFigura: this.opcionSeleccionado
    };

    this.tutorialService.create(data)
      .subscribe(
        response => {
          console.log("create", response);
          this.submitted = true;
        },
        error => {
          console.log(error);
        });
  }

  newTutorial(): void {
    this.submitted = false;
    this.tutorial = {
      id:0,
      superficie: 0,
      tipoFigura: '',
      base: 0,
      altura: 0,
      diametro: 0
    };
  }

}
