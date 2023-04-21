import { Component } from '@angular/core';
import { User } from './user';
import { UserService } from './UserService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'assessment4-frontend-app';
  constructor(private service:UserService){
    this.user=new User();
  }
  user:User;

  onSubmit(userform:any){
    this.service.addUser(userform.value);
  }
}
