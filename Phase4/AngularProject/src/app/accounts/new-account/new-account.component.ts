import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { AccountService } from 'src/app/services/account.service';
import { LoggingService } from 'src/app/services/logging.service';

@Component({
  selector: 'app-new-account',
  templateUrl: './new-account.component.html',
  styleUrls: ['./new-account.component.css'],
  providers: [LoggingService],
})
export class NewAccountComponent implements OnInit {

  constructor(
      private loggingService: LoggingService,
      private accountService: AccountService) {}

  ngOnInit(): void {}

  // @Output()
  // accountAdded = new EventEmitter<{ name: string; status: string }>();

  onCreateAccount(accountName: string, accountStatus: string) {
    this.loggingService.logAccountAdded(accountName, accountStatus);
    // this.accountAdded.emit({
    //   name: accountName,
    //   status: accountStatus,
    // });
    this.accountService.addAccount(accountName, accountStatus);
  }

}
