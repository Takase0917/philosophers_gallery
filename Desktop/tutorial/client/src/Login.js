import React, { useState } from 'react'
import axios from 'axios'; //for HTTP requests

function Login() {

  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [error, setError] = useState('');
  
  const handleLogin = async () => {
    try {
      const res = await axios.post("https://localhost:5000/login", { //await keyword to send a POST request to /login endpoint
        username,
        password
      });
      if (res.data.isAuthenticated){
        setIsAuthenticated(true);
        setError('');
      }
    } catch (error) {
      console.error(error);
      setError('Invalid username or password');
    }
  };

  return (
    <div>
    {isAuthenticated ? (
      <div>Welcome!</div>
    ) : (
      <form>
        <label htmlFor="username">Username</label>
        <input
          type="text"
          id="username"
          value={username}
          onChange={e => setUsername(e.target.value)}
        />
        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={e => setPassword(e.target.value)}
        />
        <button onClick={handleLogin}>
          Login
        </button>
      </form>
    )}
    {error && <div style={{color: 'red'}}>{error}</div>}
  </div>
  );
}

export default Login
