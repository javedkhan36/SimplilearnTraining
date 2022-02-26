import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-numbers',
  templateUrl: './numbers.component.html',
  styleUrls: ['./numbers.component.css']
})
export class NumbersComponent implements OnInit {
  shownumbers = true;
  numbers = [1,2,3,4,5,6,17,18,29,40];
  constructor() { }
  svalue=33;

  ngOnInit(): void {}
  toggleShow(){
    this.shownumbers = !this.shownumbers;
  }
}
