class Mayan extends Language {
  public Mayan(String langName, int speakers) {
    super(langName, speakers, "Central America", "Verb-Object-Subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".\nThe language follows the word order: " + this.wordOrder + ".\nFun fact: " + this.name + " is an eragative language.\n");
  }
}