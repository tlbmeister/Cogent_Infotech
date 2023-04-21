import { Component,OnInit } from "@angular/core";
import { User } from "./user";
import { UserService } from "./UserService";

@Component({
    selector:'user',
    templateUrl:'./user.component.html'
})

export class UserComponent implements OnInit{
    users:User[]=new Array();
    constructor(private userService:UserService){
        this.users=[];
    }

    ngOnInit(): void {
        this.userService.getUsers().subscribe((data:User[])=>{
            console.log(data);
            this.users=data;
        })
    }
}