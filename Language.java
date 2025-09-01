class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String langName, int speakers, String regions, String order) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = order;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\nThe language follows the word order: " + this.wordOrder + ".\n");
  }

  public static void main(String[] args) {
    Language english = new Language("English", 1500000000, "North America, the Caribbean, Oceania, and parts of Asia and Africa (India, Nigeria, South Africa)", "Subject-Verb-Object");

    english.getInfo();

    Language mayan = new Mayan("K'iche'", 2330000);

    mayan.getInfo();

    Language burmese = new SinoTibetan("Burmese", 43000000);

    burmese.getInfo();

    Language mandarin = new SinoTibetan("Mandarin Chinese", 1300000000);

    mandarin.getInfo();
  }
}