
PROJECT TITLE: World Cup Hockey 2024
PURPOSE OF PROJECT: This project is designed to simulate the Group Stage of the 2024 World Hockey Championship.
VERSION or DATE: 03.22.24
HOW TO START THIS PROJECT: 1) Create an object of instance WorldCup, specifying the number of groups and the number of teams in every group. In our current version, we have support for a total of 30 teams.
                           2) Call the method hockeyCupSetup(), which sets up the championship by populating the groups with random teams. (Optional) Call the method display() to show the current groups, and all teams should have zero points.
                           3) Call the method randomGames(), which randomly simulates matches in every single group.
                           4) Call the method display() to view the standings and points at the end of the Group Stage. This method takes about 5-10 seconds. 
AUTHORS: Farhan Ishrak Probandho (10 points)
         Aryan Biju Daniel (10 points)
         Rohan Torul (10 points)


Class Details:
Class WorldCup: 
Class that simulates the Hockey World Cup group stage.
 * It is responsible for populating the groups with randomised teams, simulating matches and displaying results.
 * It is responsible for keeping track of the groups.

Class Group: 
Contains information about a group. It contains all the teams and the matches played in a particular group.
 * It is responsible for keeping track of the teams and the matches that occur in the group.
 * It creates matchups between teams in the group, sorts teams based on their points and calculates and displays the standings in the group.

Class Game:
Contains information about a Match.
 * This class is responsible for simulating a game and adding points to respective teams.

Class Team:
Class that stores information about a particular team. 
 * It is responsible for keeping track of the team name, total points and goal difference. 
 * Further iterations may contain additional data such as
 * Player names, Player count, Coach, etc
