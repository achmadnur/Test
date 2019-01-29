<?php
    $username="";
    $pass = "";
    $usernameErr = "";
    $passErr = "";
    $username_valid = true;
    $pass_valid = true;
    $username_valid_msg = "";
    $pass_valid_msg = "";
    
    if(isset($_POST['submit'])){
        $username = trim($_POST['username']);
        $pass = trim($_POST['pass']);
        
        
        if(empty($username)){
            $usernameErr = "Username masih kosong.<br>";
        }
        if(empty($pass)){
            $passErr = "Password masih kosong.<br>";
        }

        if(strlen($username) <= 8){
            $username_valid = false;
            $username_valid_msg = "Username minimal 8 digit.<br>";
        }

        if(strlen($pass) <= 8){
            $pass_valid = false;
            $pass_valid_msg = "Password minimal 8 digit.<br>";
        }
        
        
        if(!preg_match("/^[a-z_]*$/",$username)){
            $username_valid = false;
            $username_valid_msg = "Hanya huruf kecil yang diijinkan dan wajib menggunakan underscore.<br>";
        }

        if(!preg_match("/^[a-zA-Z0-9+&@#\/%?=~_|!:,.;]*$/",$pass)){
            $pass_valid = false;
            $pass_valid_msg = "Hanya huruf kecil,besar, dan karakter spesial yang diijinkan.<br>";
        }
        if( !empty($username) and !empty($pass) and $username_valid ){
        
            echo "Selamat semua input sudah diisi dengan benar.<br>";
        }
        
    }
?>
<html>
<body>
<h3>From Login</h3>

<form action="dua.php" method="post">
    Username : <input type="text" name="username" value="<?php echo $username; ?>"><br>
        <?php echo $usernameErr.$username_valid_msg; ?>
    Password : <input type="password" name="pass" value="<?php echo $pass; ?>"><br>
        <?php echo $passErr; ?>
    <input type="submit" name="submit" value="Register">
</form>
</body>
</html>
<?php
?>