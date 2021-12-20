//
// Created by damtowise on 18/12/2021.
//
#include <iostream>
using namespace std;

void printResult(int, int, string, string);



int main(void){
    int scrT1,scrT2;
    string team_1,team_2;
    cout<<"===============[ GUESS THE SCORE ]==============="<<endl<<endl;
    cout<<"Enter the  name of the first team: ";
    cin>>team_1;
    cout<<endl;
    cout<<"Enter the  name of the second team: ";
    cin>>team_2;
    cout<<endl<< endl;
    scrT1 = rand() % 10 + 1;//generates a random for team 1
    scrT2 = rand() % 10 + 2;//generates a random for team 2
    if (team_1.length() != 0 && team_2.length() != 0 ) {
        printResult(scrT1, scrT2, team_1, team_2);//print result
    }//checks if team name is empty

    return 0;
}
void printResult(int scrT1, int scrT2,string team_1, string team_2) {
    cout << "===============[ THE RESULT OF THE MATCH  ]===============" << endl << endl;
    cout<<team_1<<"->"<<scrT1<<" <---> "<<team_2<<"->"<<scrT2<<endl;
}
