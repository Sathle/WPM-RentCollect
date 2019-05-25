import { CurrencyPipe } from "@angular/common";

export class Lease {
    address: string;
    city: string;
    state: string;
    startDate: Date; //use a calender api
    endDate: Date; //use a calender api
    rent: number; //need to limit to two decimal places
}