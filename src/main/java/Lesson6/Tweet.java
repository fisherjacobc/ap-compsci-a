class Tweet {
	private String message;
	private int retweets;
	private int likes;

	public Tweet(String m, int r, int lk) {
		this.message = m;
		this.retweets = r;
		this.likes = lk;
	}

	public void addLikes(int n) {
		this.likes += n;
	}

	public void addRetweets(int n) {
		this.retweets += n;
	}

	public boolean notLiked() {
		return this.likes < 10;
	}

	public boolean kindaLiked() {
		return this.likes > this.retweets;
	}

	public boolean isTrending() {
		return this.likes + this.retweets > 75;
	}

	public String toString() {
		return "msg " + message;
	}
}