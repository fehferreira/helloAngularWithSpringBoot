import { HttpClientService } from './../service/http-client.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees: string[];

  constructor(
    private httpClientService: HttpClientService
  ) { }

  ngOnInit(): void {
    this.httpClientService.getEmployees().subscribe(
      response => this.handleSucessfulResponse(response)
    );
  }

  handleSucessfulResponse(response){
    this.employees = response;
  }

}
