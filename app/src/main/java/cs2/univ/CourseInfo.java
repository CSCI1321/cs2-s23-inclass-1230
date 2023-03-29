package cs2.univ;

public class CourseInfo {
  public final String semester;
  public final String section;
  public final int id;
  public final String title;
  public final String timeroom;
  public final String instructor;
  public final int hours;
  public final String pathways;

  public CourseInfo(String semester, String section, int id, String title, String timeroom, String instructor, int hours, String pathways) {
    this.semester = semester;
    this.section = section;
    this.id = id;
    this.title = title;
    this.timeroom = timeroom;
    this.instructor = instructor;
    this.hours = hours;
    this.pathways = pathways;
  }

  public String toString() {
    return section + " (" + id + ") " + title + " -- " + instructor;
  }
}

