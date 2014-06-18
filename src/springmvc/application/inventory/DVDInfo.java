package springmvc.application.inventory;


public class DVDInfo {
  // This class has been completed for you
  private String id;
  private String title;

  public DVDInfo(String id, String title) {
    this.id = id;
    this.title = title;
  }

  public String toString() {
    return "DVDInfo{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
