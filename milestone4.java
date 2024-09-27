

```javascript
// Function to open the theme form popup
function openFormPopup() {
  document.getElementById('themeForm').style.display = 'block';
}

// Function to close the theme form popup
function closeFormPopup() {
  document.getElementById('themeForm').style.display = 'none';
}

// Function to handle form submission and store user preferences
function storeUserPreferences(event) {
  event.preventDefault();
  const email = document.getElementById('email').value;
  const name = document.getElementById('name').value;
  const theme = document.getElementById('theme').value;

  localStorage.setItem('userEmail', email);
  localStorage.setItem('userName', name);
  localStorage.setItem('userTheme', theme);

  // The selected theme
  document.body.classList.add(theme);

  closeFormPopup();
}

// Event listener to trigger theme form popup
document.getElementById('openThemeForm').addEventListener('click', openFormPopup);

// Event listener to handle form submission
document.getElementById('themeForm').addEventListener('submit', storeUserPreferences);

// Restore selected theme when the application is loaded
const storedTheme = localStorage.getItem('userTheme');
if (storedTheme) {
  document.body.classList.add(storedTheme);
}
```

