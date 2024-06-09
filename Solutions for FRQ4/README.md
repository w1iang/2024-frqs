### FRQ 4 -
## Objective
- In FRQ 4, the objective of part a) is to create a path across a board of 
numbers where each next number you land on, whether it's below or right of the 
current tile in the number grid, is greater than the other. For instance, if the 
right number is 4, and the number below is 5, you'd land on five, and so on. In part
b), the objective is to add up all the values from the number grid that collectively
compile the path you made using the getNextLoc method (part a). sumPath (part b) 
returns an integer.
## Obstacles
- I had a difficult time correctly ensuring the loop wouldn't go out of bounds
as well as struggling with or/and statements. The sumPath method was simple as is,
only needing to add together index values of each location derived from part a. On
the AP exam, I ran out of time because of the hinderance in part a, which I rewrote
in my repository.
## What I learned
- I learned that I should put the precondition statements (not going all the way
to the left or the bottom) of the number grid first, then worry about the looping
that determines