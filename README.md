Here's a professionally crafted HTML GitHub documentation for your Tic-Tac-Toe project. This documentation includes structured sections, professional formatting, and placeholders for images and code snippets. You can use this as a README file on GitHub to present your project clearly and effectively.

```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tic-Tac-Toe Project Documentation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            max-width: 800px;
            margin: auto;
            padding: 20px;
            background-color: #f5f5f5;
        }

        h1, h2, h3, h4 {
            color: #333;
            margin-top: 24px;
        }

        p {
            color: #555;
            font-size: 16px;
        }

        ul {
            list-style-type: none;
            padding: 0;
        }

        ul li {
            padding: 8px 0;
        }

        img {
            display: block;
            margin: 10px auto;
            max-width: 100%;
            height: auto;
            border: 1px solid #ddd;
            padding: 5px;
            background-color: #fff;
        }

        code {
            background-color: #eee;
            padding: 2px 4px;
            border-radius: 4px;
            font-size: 90%;
        }

        .contributors {
            margin-bottom: 20px;
        }

        .image-placeholder {
            width: 100%;
            height: 300px;
            background-color: #ddd;
            text-align: center;
            line-height: 300px;
            color: #aaa;
            border-radius: 8px;
            margin-top: 10px;
        }

        .algorithm {
            background-color: #f9f9f9;
            padding: 15px;
            border-radius: 8px;
            border-left: 4px solid #007bff;
            margin-top: 10px;
        }

        .step {
            margin-bottom: 10px;
        }
    </style>
</head>

<body>

    <header>
        <h1>Tic-Tac-Toe Project Documentation</h1>
        <p>This documentation provides an overview of the Tic-Tac-Toe project, its contributors, and detailed instructions on how the game is structured and implemented.</p>
    </header>

    <section id="contributors">
        <h2>Contributors</h2>
        <p>This project was developed by the following team members:</p>
        <ul class="contributors">
            <li><strong>Hanior Nabem Nathaniel</strong> - BHU/22/04/09/0074</li>
            <li><strong>Ezekiel Oyidih</strong> - BHU/22/04/05/0026</li>
            <li><strong>Ngakilahyel Samuel</strong> - BHU/22/04/10/0019</li>
            <li><strong>Caleb Joshua Fuojima</strong> - BHU/22/04/05/0018</li>
            <li><strong>Precious Oguntuase Toluwalope</strong> - BHU/22/04/05/0070</li>
        </ul>
    </section>

    <section id="images">
        <h2>Images</h2>
        <p>The following are images of various screens from the application:</p>

        <h3>Splash Screen</h3>
        <div class="1.png">[Placeholder for Splash Screen Image]</div>

        <h3>Initialization</h3>
        <div class="2.png">[Placeholder for Initialization Screen Image]</div>

        <h3>X Wins</h3>
        <div class="3.png">[Placeholder for X Wins Screen Image]</div>

        <h3>Reset Button</h3>
        <div class="4.png">[Placeholder for Reset Button Screen Image]</div>

        <h3>O Wins</h3>
        <div class="5.png">[Placeholder for O Wins Screen Image]</div>
    </section>

    <section id="algorithm">
        <h2>Algorithm</h2>
        <p>This section outlines the algorithm used to create the Tic-Tac-Toe game:</p>
        <div class="algorithm">
            <h3>1. Initialization</h3>
            <div class="step">
                <h4>1.1 Create a Splash Screen</h4>
                <p>Display a splash screen with the title <code>"Tic-Tac-Toe"</code> upon launching the application. Allow the splash screen to be visible for a short duration before transitioning to the main game window.</p>
            </div>
            <div class="step">
                <h4>1.2 Setup the Game Window</h4>
                <p>Create a main game window using <code>JFrame</code> with a size of 800x800 pixels. Set the window title to <code>"Tic-Tac-Toe"</code> and use an icon image. Utilize a <code>BorderLayout</code> to organize components within the frame.</p>
            </div>

            <h3>2. Component Configuration</h3>
            <div class="step">
                <h4>2.1 Title and Control Panels</h4>
                <p>Create a title panel and a control panel at the top and bottom of the window, respectively. Add a <code>JLabel</code> in the title panel for displaying game messages like player turns or win messages. Add a <code>Restart</code> <code>JButton</code> in the control panel to restart the game.</p>
            </div>
            <div class="step">
                <h4>2.2 Button Panel Setup</h4>
                <p>Create a 3x3 grid layout using <code>JPanel</code> to represent the Tic-Tac-Toe board. Initialize an array of 9 <code>JButtons</code>, each representing a cell on the board. Configure each button with a unique font, background color, and action listener.</p>
            </div>

            <h3>3. Game Initialization</h3>
            <div class="step">
                <h4>3.1 Determine the First Player</h4>
                <p>Use a random number generator to randomly decide which player starts first, either 'X' or 'O'. Display the current player's turn on the <code>JLabel</code>.</p>
            </div>
            <div class="step">
                <h4>3.2 Display the Game Window</h4>
                <p>Add the title panel, button panel, and control panel to the main frame. Make the frame visible, allowing users to interact with the game.</p>
            </div>

            <h3>4. Game Play (Action Listener for Button Clicks)</h3>
            <div class="step">
                <h4>4.1 Player Move Handling</h4>
                <p>Check which button was clicked by the player. If the button is empty, fill it with the current player's symbol ('X' or 'O') and update its color. Switch turns between players after each valid move. Display the next player's turn in the <code>JLabel</code>.</p>
            </div>
            <div class="step">
                <h4>4.2 Check for a Win or Tie</h4>
                <p>After each move, check all possible winning combinations on the board. If a winning combination is found for 'X', call the <code>xWins()</code> method. If a winning combination is found for 'O', call the <code>oWins()</code> method. If all buttons are filled and there is no winner, call the <code>tie()</code> method.</p>
            </div>

            <h3>5. Game Result Handling</h3>
            <div class="step">
                <h4>5.1 X Wins</h4>
                <p>Highlight the winning buttons with a distinct background color. Display <code>"X wins!"</code> in the <code>JLabel</code>. Disable all buttons to prevent further moves.</p>
            </div>
            <div class="step">
                <h4>5.2 O Wins</h4>
                <p>Highlight the winning buttons with a distinct background color. Display <code>"O wins!"</code> in the <code>JLabel</code>. Disable all buttons to prevent further moves.</p>
            </div>
            <div class="step">
                <h4>5.3 Tie</h4>
                <p>If neither player wins and all buttons are filled, display <code>"Tie!"</code> in the <code>JLabel</code>. Disable all buttons to prevent further moves.</p>
            </div>

            <h3>6. Restart Game Functionality</h3>
            <div class="step">
                <h4>6.1 Reset Button</h4>
                <p>Listen for the <code>"Restart"</code> button click event. Close the current game window and create a new instance of the Tic-Tac-Toe class to start a new game.</p>
            </div>

            <h3>7. End</h