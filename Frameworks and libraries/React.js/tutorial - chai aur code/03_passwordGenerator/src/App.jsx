import { useCallback, useEffect, useRef, useState } from "react";

import "./App.css";

function App() {
  const [password, setPassword] = useState("");
  const [passwordLength, setPasswordLength] = useState(8);
  const [includeNumbers, setIncludeNumbers] = useState(false);
  const [includeCharacters, setIncludeCharacters] = useState(false);

  const passwordGenerator = useCallback(() => {
    const numbers = "0123456789";
    const characters = "!@#$%^&*()_+";

    let password = "";
    let values = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    if (includeNumbers) values += numbers;
    if (includeCharacters) values += characters;

    for (let i = 0; i < passwordLength; i++) {
      const random = Math.floor(Math.random() * values.length);
      password += values[random];
    }

    setPassword(password);
  }, [passwordLength, includeNumbers, includeCharacters]);

  const copyPasswordToClipboard = useCallback(() => {
    passwordRef.current?.select();
    document.current?.setSelectionRange(0,101);
    window.navigator.clipboard.writeText(password);
  }, [password]);

  useEffect(() => {
    passwordGenerator();
  }, [includeNumbers, includeCharacters, passwordGenerator]);

  const passwordRef = useRef(null);

  return (
    <>
      <div className="w-full max-w-md mx-auto shadow-md rounded-lg px-4 my-8 text-orange-400 bg-gray-700 py-4">
        <h1 className="text-white text-center my-3">Password Generator</h1>
        <div className="flex shadow rounded-lg overflow-hidden mb-4">
          <input
            type="text"
            value={password}
            className="outline-none w-full px-3 py-1 bg-white text-gray-700"
            placeholder="password"
            readOnly
            ref={passwordRef}
          />
          <button className="outline-none bg-blue-700 text-white px-3 py-0.5 shrink-0"
          onClick={copyPasswordToClipboard}>
            Copy
          </button>
        </div>

        <div className="flex text-sm gap-x-2">
          <div className="flex items-center gap-x-1">
            <input
              type="range"
              min={6}
              max={100}
              value={passwordLength}
              className="cursor-pointer"
              onChange={(e) => {
                setPasswordLength(e.target.value);
              }}
            />
            <label>Length:{passwordLength}</label>
          </div>

          <div className="flex items-center gap-x-1">
            <input
              type="checkbox"
              defaultChecked={includeNumbers}
              id="numberInput"
              onChange={() => {
                setIncludeNumbers((prev) => !prev);
              }}
            />
            <label htmlFor="numberInput">Numbers</label>
          </div>

          <div className="flex items-center gap-x-1">
            <input
              type="checkbox"
              defaultChecked={includeCharacters}
              id="characterInput"
              onChange={() => {
                setIncludeCharacters((prev) => !prev);
              }}
            />
            <label htmlFor="charcterInput">Characters</label>
          </div>
        </div>
      </div>
    </>
  );
}

export default App; w