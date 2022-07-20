# Service Parts Managment

This is an service contracts and parts managment app for service maintenance companies.

The application has two main objectives, firstly to allow for parts forecasting, which will allow for spare and replacement parts to be included in service contract quotes. In order for competitive quotes parts are allocated a priority, which will allow customers to select essential, standard or a complete parts package.

The second objective is to allow for automated spares planning, for existing customer contracts. Parts have an upper limit of weighted hours run and an upper limit of length of time installed, if either of those limits are met, the part should be highlighted for replacement.

**It features:**

- A Contracts section
- A Service section

## Tech Stack

**Client:** JavaScript, React, HTML5, CSS,

**Server:** Java, Spring, JPA, SQL


## Installation

- Ensure NPM is installed on your local machine
- In your terminal go to a directory you want to save the app in and perform the following commands:

```bash
  git clone git@github.com:NortyNorts/service_parts_management.git
  cd group_project
```

Install modules in **client:** Open up a new terminal window then perform the following commands:

```bash
  cd client
  npm install
```

## Deployment

To deploy this project:

Open Server and run SparesPlanningApplication.

From client run:

```bash
  npm start 
```
Verify it is running correctly by browsing http://localhost:3000

## Outstanding bugs

Parts forecasting in the client section only updates once runnings hours have been updated on the client in the service section. This is a React bug, as the data updates on the server when a customer is created.

There are a number of rendering issues, which have been temporarily worked around by using React router history, to move the user to a page that will force the re render of a page. These bugs are React issues.
## Contributors

- @NortyNorts
- @drleafgreen88
