const firebaseConfig = {
  apiKey: "AIzaSyBD7E3Dp7N7qwvh2v4cxYdrOYALITrKTKE",
  authDomain: "gf-form-e6804.firebaseapp.com",
  databaseURL: "https://gf-form-e6804-default-rtdb.firebaseio.com",
  projectId: "gf-form-e6804",
  storageBucket: "gf-form-e6804.appspot.com",
  messagingSenderId: "621755992611",
  appId: "1:621755992611:web:3ddf86bbec913ad58bbf96"
};

   // initializa firebase
   firebase.initializeApp(firebaseConfig);
   const app = initializeApp();
   const { initializeApp } = require('firebase-admin/app');
   import { initializeApp } from 'firebase-admin/app';
   var contactFormDB = firebase.database().ref("Information");
 
 const registrationForm = document.getElementById('information');
 const myRefreshToken = '...'; // Get refresh token from OAuth2 flow

initializeApp({
  credential: refreshToken(myRefreshToken),
  databaseURL: 'https://<DATABASE_NAME>.firebaseio.com'
});
initializeApp({
  credential: applicationDefault(),
  databaseURL: 'https://<DATABASE_NAME>.firebaseio.com'
});
// Initialize the default app
initializeApp(defaultAppConfig);

// Initialize another app with a different config
var otherApp = initializeApp(otherAppConfig, 'other');

console.log(getApp().name);  // '[DEFAULT]'
console.log(otherApp.name);     // 'other'

// Use the shorthand notation to retrieve the default app's services
const defaultAuth = getAuth();
const defaultDatabase = getDatabase();

// Use the otherApp variable to retrieve the other app's services
const otherAuth = getAuth(otherApp);
const otherDatabase = getDatabase(otherApp);
 
 function submitForm() {
     const name = document.getElementById('name').value;
     const email = document.getElementById('email').value;
     const number = document.getElementById('number').value;
     const name2 = document.getElementById('name2').value;
     const name3 = document.getElementById('name3').value;
 
     // Get a reference to the database
     const database = firebase.database();
 
     // Push data to the database
     database.ref('Info').push({
         name: name,
         email: email,
         number: number,
         name2: name2,
         name3: name3
     });
 
     alert('successfully Submited!');
     registrationForm.reset();
}