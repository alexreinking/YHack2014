grammar Command;

command : specificCommand EOF ;

specificCommand
        : movement
        | inspection
        | interaction
        | attack
        | gift
        | inventory
        | check
        ;

movement : relativeMovement | specificMovement ;
relativeMovement : (Go | Walk)? direction ;
specificMovement : (Enter | Exit) Identifier ;
direction : North | South | East | West | Up | Down | Leave ;

inspection : (Look 'at' | Inspect | Examine) longName ;

interaction : Touch longName
            | Pick 'up' longName
            | Take longName
            | Drop longName
            | Eat longName
            ;

attack : Attack longName (With longName)? ;
gift :  Give Identifier ('the' | 'my' | 'a')? longName ;

inventory : Open? Inventory ;

check : checkHealth | checkStatus ;
checkHealth : Check? Health;
checkStatus : Check? Status;

longName : Identifier+;

Attack: 'attack';
Check: 'check';
Down: 'down';
Drop: 'drop';
East: 'east' | 'e';
Eat: 'eat';
Enter: 'enter';
Examine: 'examine';
Exit: 'exit';
Give: 'give';
Go: 'go';
Health: 'health';
Inspect: 'inspect';
Inventory: 'inventory' | 'i';
Leave: 'leave';
Look: 'look';
North: 'north' | 'n';
Open: 'open';
Pick: 'pick';
South: 'south' | 's';
Status: 'status';
Take: 'take';
Touch: 'touch';
Trade: 'trade';
Up: 'up';
Walk: 'walk';
With: 'with';
West: 'west' | 'w';

Identifier: [A-Za-z][A-Za-z0-9]* ;

WS: [ \n\t\r]+ -> skip;
