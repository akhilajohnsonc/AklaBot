# AklaBot - The Coding Quote Twitter Bot :robot:

[![Twitter Follow](https://img.shields.io/twitter/follow/aklabot?style=social)](https://twitter.com/aklabot)

AklaBot is your friendly coding quote Twitter bot developed using Spring Boot and the Twitter4J API. It's here to sprinkle your Twitter feed with coding wisdom and humor. 🚀💻

<p align="center">
  <img src="https://github.com/akhilajohnsonc/AklaBot/blob/main/aklabot-demo.gif" alt="AklaBot Demo">
</p>

## How It Works

AklaBot is designed to bring a smile to your face through coding quotes. At specific intervals, the bot tweets out random coding quotes sourced from a predefined `.txt` file. The magic happens through the synergy of Spring Boot's scheduling and the Twitter4J API.

## Let the Laughter Begin! 😂

Follow [@aklabot](https://twitter.com/aklabot) on Twitter to enjoy a daily dose of coding humor and inspiration.

## Getting Started

To run your own instance of AklaBot, follow these steps:

### 1. Clone the Repository

Start by cloning the repository to your local machine:

```bash
git clone https://github.com/akhilajohnsonc/AklaBot.git
cd AklaBot
```

### 2. Set Up Twitter4J

AklaBot uses Twitter4J to interact with Twitter's API. Here's how to set it up:

1. Visit [Twitter Developer](https://developer.twitter.com/en/apps) and create a new application to obtain your API keys and access tokens.
2. Open `src/main/resources/application.properties` and replace the following placeholders with your Twitter API credentials:
   
   ```properties
   twitter4j.oauth.consumerKey=YOUR_CONSUMER_KEY
   twitter4j.oauth.consumerSecret=YOUR_CONSUMER_SECRET
   twitter4j.oauth.accessToken=YOUR_ACCESS_TOKEN
   twitter4j.oauth.accessTokenSecret=YOUR_ACCESS_TOKEN_SECRET
   ```

### 3. Customize Quotes

Add your own coding quotes to `src/main/resources/tweets.txt`. Each quote should be on a new line.

### 4. Build and Run

Build and run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

AklaBot will now start tweeting coding quotes at specified intervals.

## Contributing

Want to add your own touch of humor to AklaBot? We welcome contributions! Here's how you can do it:

### 1. Fork the Repository

Click the "Fork" button at the top right corner of this repository. This will create your own copy of the project.

### 2. Clone Your Fork

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/AklaBot.git
```

Replace `your-username` with your GitHub username.

### 3. Add Quotes

Navigate to the cloned repository on your machine and open `src/main/resources/tweets.txt`. Add your coding quotes, each on a new line.

### 4. Make Changes

Navigate to the cloned repository on your machine and make your changes. Feel free to enhance the code or introduce new features. Let your creativity flow! 🎉

### 5. Commit and Push

After making your changes, commit them with descriptive commit messages:

```bash
git add .
git commit -m "Add: Your changes here"
git push origin main
```

### 6. Create a Pull Request

Go to your forked repository on GitHub and click on the "New Pull Request" button. We'll review your changes and merge them into the main project if they align with our goals.

## Show Your Support

If AklaBot brought a smile to your face, consider giving it a ⭐️. It means a lot to us!

## Stay in Touch

Got questions, suggestions, or just want to chat? You can reach me on Twitter [@akhilajohnsonc](https://twitter.com/akhilajohnsonc). Let's connect! 🤝

---

Let's keep the coding fun alive! Happy coding and tweeting! 🎈🐦📚
