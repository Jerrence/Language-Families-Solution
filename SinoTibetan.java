class SinoTibetan extends Language {
  public SinoTibetan(String langName, int speakers) {
    super(langName, speakers, "Asia", "Subject-Object-Verb");

    if (langName.contains("Chinese")) {
      this.wordOrder = "Subject-Object-Verb";
    }
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\nThe language follows the word order: " + this.wordOrder + ".\n");
  }
}