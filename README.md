# acm-gamejam-2019
ETSU ACM Game Jam submission from March 2019
Created during first semester of computer science courses.

This is a game jam submission for the East Tennessee State University branch of the ACM organization. The theme was "Steampunk Volcano Epidemic," and participants were given three weeks to create a game. I chose to create a text-based dungeon crawler. At the time, I was in my first semester of computer science courses, and the introductory course was taught in Java. At the time of the game jam, we had not covered objects or arrays, so I learned that as I was programming the game. Looking back after learning those concepts, I could have made the code much more simple. Also, I had not learned about exception handling, so it can crash under a circumstance defined below. There are many features I wanted to implement, but the time constraint of a game jam limited the final feature set. However, it is playable and able to be won and lost.

Important notes:

- This is a text-based game and must be ran through the command line
- The fight sequence is not fine-tuned, but I have been able to win so it is at least possible
- The inputs are case-insensitve
- The game logic handles input errors (e.g. pressing 'h' when there is no option for 'h'), but...
- Pressing ENTER without typing any selection will cause the game to crash
