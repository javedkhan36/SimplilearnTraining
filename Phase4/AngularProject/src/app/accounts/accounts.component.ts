import { Component, OnInit } from '@angular/core';
// import * as _ from 'underscore';
import { AccountService } from '../services/account.service';

@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.css']
})
export class AccountsComponent implements OnInit {
  accounts: { name: string; status: string }[] = [];
  constructor(private accountService: AccountService) {}

  ngOnInit(): void {
    this.accounts = this.accountService.accounts;
  }

  // accounts = [
  //   {
  //     name: 'Master Account',
  //     status: 'active',
  //   },
  //   {
  //     name: 'Test Account',
  //     status: 'InActive',
  //   },
  //   {
  //     name: 'Secret Account',
  //     status: 'Dormant',
  //   },
  // ];

  // constructor() {}

  // onAccountAdded(newAccount: { name: string; status: string }) {
  //   this.accounts.push(newAccount);
  // }
  // onAccountDeleted(accountName: string) {
  //   // console.log('Account Deleted: ' + accountName);
  //   // this.accounts[id] = null;
  //   this.accounts = _.without(
  //     this.accounts,
  //     _.findWhere(this.accounts, {
  //       name: accountName,
  //     })
  //   );
  // }
  // ngOnInit(): void {}
  // onStatusChange(updatedInfo: { id: number; status: string }) {
  //   this.accounts[updatedInfo.id].status = updatedInfo.status;
  // }

}
