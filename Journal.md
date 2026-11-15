# Journal 

## Phase 1
I choose an adjacency matrix because it's simple to use for a small number of cities. It makes it easy to see which cities are connected and the cost of traveling between them. Although it uses more memory than an adjacency list, I think it's easier to manage for this project.
<br><br>
## Phase 2
BFS uses a queue to check cities in the order they are discovered. It starts with the closet connections before moving farther away. This helps the program search the network level by level without skipping any reachable cities.
<br><br>
## Phase 3
The main difference is that BFS uses a queue while DFS uses a stack. BFS checks nearby cities first, while DFS follows one path as far as possible before going back to explore another. Both can find connections, but they search in different ways.
<br><br>
## Phase 4
While testing, I wanted to make sure the program could handle both connected and disconnected cities. I used a visited array to prevent the program from repeatedly checking the same cities. I also added checks for cities that don't exist in the graph. These tests helped me better understand how BFS and DFS work and how to make the program more reliable.
