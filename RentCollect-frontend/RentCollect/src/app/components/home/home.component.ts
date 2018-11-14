import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  firstName: string;
  lastName: string;


  holder: string;

  constructor() { }

  ngOnInit() {
  }


  test() {
    this.holder = this.firstName;
    console.log(this.holder);
  }
}
