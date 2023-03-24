<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/signUp.css">
    <link rel="stylesheet" href="/css/flex.css">
    <link rel="stylesheet" href="/css/main.css">
</head>

<body class="flex-col">
    <div class="header flex-row">
        <a href="/sign-up" class="header-link">Sign Up</a>
        <a href="/" class="header-link">Home</a>
        <a href="/sign-in" class="header-link">Sign In</a>
    </div>
    <div class="main-content flex-row">
        <div class="signup-box flex-col">
            <h1>Sign Up</h1>
            <div class="flex-row justify-center text-input-margin">
                <div>Email: </div><input class="text-input" type="text" />
            </div>
            <div class="flex-row justify-center text-input-margin">
                <div>Password: </div><input class="text-input" type="password" />
            </div>
            <div class="flex-row justify-center text-input-margin">
                <div>Name: </div><input class="text-input" type="text" />
            </div>
            <button class="button">Submit</button>
        </div>
    </div>
</body>

</html>