// registration (factory)
// training (observer & subject)
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
import java.time.Period;


class Course {
    private static int defaultID = 1;
    private int courseID;
    private String courseName;
    private double coursePrice;
    //@ElementCollection
    //private List<Date> CourseDates;
    //@ElementCollection
    //private List<String> CourseLocations;
    private LocalDate courseDates;
    private String courseLocations;
    private String courseContent;
    // default value
    private int courseDurationInDays;
    private int courseTraineeMin;
    private int courseGap; // month

    public Course(String name, double price, LocalDate dates, String locations, String content) {
        this.courseID = defaultID++;
        this.courseName = name;
        this.coursePrice = price;
        this.courseDates = dates;
        this.courseLocations = locations;
        this.courseContent = content;
    }

    // Getter for courseDurationInDays
    public int getCourseDurationInDays() {
        return courseDurationInDays;
    }

    // Setter for courseDurationInDays
    public void setCourseDurationInDays(int courseDurationInDays) {
        this.courseDurationInDays = courseDurationInDays;
    }

    // Getter for courseTraineeMin
    public int getCourseTraineeMin() {
        return courseTraineeMin;
    }

    // Setter for courseTraineeMin
    public void setCourseTraineeMin(int courseTraineeMin) {
        this.courseTraineeMin = courseTraineeMin;
    }

    // Getter for courseGap
    public int getCourseGap() {
        return courseGap;
    }

    // Setter for courseGap
    public void setCourseGap(int courseGap) {
        this.courseGap = courseGap;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", coursePrice=" + coursePrice +
                ", courseDates=" + courseDates +
                ", courseLocations='" + courseLocations + '\'' +
                ", courseContent='" + courseContent + '\'' +
                '}';
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int CourseID) {
        this.courseID = CourseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double CoursePrice) {
        this.coursePrice = CoursePrice;
    }

  /*
  public List<Date> getCourseDates() {
      return CourseDates;
  }
  public void setCourseDates(List<Date> courseDates) {
      CourseDates = courseDates;
  }
  public List<String> getCourseLocations() {
      return CourseLocations;
  }
  public void setCourseLocations(List<String> courseLocations) {
      CourseLocations = courseLocations;
  }
  */

    public LocalDate getCourseDates() {
        return courseDates;
    }

    public void setCourseDates(LocalDate CourseDates) {
        this.courseDates = CourseDates;
    }

    public String getCourseLocations() {
        return courseLocations;
    }

    public void setCourseLocations(String CourseLocations) {
        this.courseLocations = CourseLocations;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String CourseContent) {
        this.courseContent = CourseContent;
    }
}



class Registration {
    private static int defautID = 1;
    private int registrationID;
    private String registrationType;
    private LocalDate registrationDate;
    private String registrationLocation;
    private String registrationContact;
    private String registrationName;
    private String registrationCompany;
    private int registrationCourseID;
    private String registrationComments;

    public Registration(String type, LocalDate date, String location, String Contact, String name, String company,
                        int courseID, String comments) {
        this.registrationID = defautID++;
        this.registrationType = type;
        this.registrationDate = date;
        this.registrationLocation = location;
        this.registrationName = name;
        this.registrationCompany = company;
        this.registrationCourseID = courseID;
        this.registrationComments = comments;
    }

    public void display() {
        System.out.println("This is a registration" + this.registrationID);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "registrationID=" + registrationID +
                ", registrationType='" + registrationType + '\'' +
                ", registrationDate=" + registrationDate +
                ", registrationLocation='" + registrationLocation + '\'' +
                ", registrationContact='" + registrationContact + '\'' +
                ", registrationName='" + registrationName + '\'' +
                ", registrationCompany='" + registrationCompany + '\'' +
                ", registrationCourseID=" + registrationCourseID +
                ", registrationComments='" + registrationComments + '\'' +
                '}';
    }

    public String getRegistrationType() {
        return this.registrationType;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public String getRegistrationLocation() {
        return this.registrationLocation;
    }

    public String getRegistrationContact() {
        return this.registrationContact;
    }

    public String getRegistrationName() {
        return this.registrationName;
    }

    public String getRegistrationCompany() {
        return this.registrationCompany;
    }

    public int getRegistrationCourseID() {
        return this.registrationCourseID;
    }

    public String getRegistrationComments() {
        return this.registrationComments;
    }

}



class Training {
    private static Integer defaultID = 1;
    private Integer trainingID;
    private String trainingType; // inter or intra
    private int trainingGap; // per month
    private int trainingDurationInDays;   // number of days
    private String trainingLocation;
    private List<Registration> trainingRegistrations;
    private LocalDate trainingBeginDate;
    private LocalDate trainingPrepareBeginDate;
    private LocalDate trainingCancelDate;
    private String trainingCancelBy;
    private Boolean trainingFinishPreparation;
    private Integer trainingTrainerID;

    // Constructor
    public Training(String trainingType, int trainingGap, int trainingDurationInDays,
                    String trainingLocation, List<Registration> trainingRegistrations,
                    LocalDate trainingBeginDate, LocalDate trainingPrepareBeginDate,
                    LocalDate trainingCancelDate, String trainingCancelBy,
                    Boolean trainingFinishPreparation, Integer trainingTrainerID) {
        this.trainingID = ++defaultID;
        this.trainingType = trainingType;
        this.trainingGap = trainingGap;
        this.trainingDurationInDays = trainingDurationInDays;
        this.trainingLocation = trainingLocation;
        this.trainingRegistrations = trainingRegistrations;
        this.trainingBeginDate = trainingBeginDate;
        this.trainingPrepareBeginDate = trainingPrepareBeginDate;
        this.trainingCancelDate = trainingCancelDate;
        this.trainingCancelBy = trainingCancelBy;
        this.trainingFinishPreparation = trainingFinishPreparation;
        this.trainingTrainerID = trainingTrainerID;
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainingID=" + trainingID +
                ", trainingType='" + trainingType + '\'' +
                ", trainingGap=" + trainingGap +
                ", trainingDurationInDays=" + trainingDurationInDays +
                ", trainingLocation='" + trainingLocation + '\'' +
                ", trainingRegistrations=" + trainingRegistrations +
                ", trainingBeginDate=" + trainingBeginDate +
                ", trainingPrepareBeginDate=" + trainingPrepareBeginDate +
                ", trainingCancelDate=" + trainingCancelDate +
                ", trainingCancelBy='" + trainingCancelBy + '\'' +
                ", trainingFinishPreparation=" + trainingFinishPreparation +
                ", trainingTrainerID=" + trainingTrainerID +
                '}';
    }



    // Getters and Setters
    public Integer getTrainingID() {
        return trainingID;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public int getTrainingGap() {
        return trainingGap;
    }

    public void setTrainingGap(int trainingGap) {
        this.trainingGap = trainingGap;
    }

    public int getTrainingDurationInDays() {
        return trainingDurationInDays;
    }

    public void setTrainingDurationInDays(int trainingDurationInDays) {
        this.trainingDurationInDays = trainingDurationInDays;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }

    public List<Registration> getTrainingRegistrations() {
        return trainingRegistrations;
    }

    public void setTrainingRegistrations(List<Registration> trainingRegistrations) {
        this.trainingRegistrations = trainingRegistrations;
    }

    public LocalDate getTrainingBeginDate() {
        return trainingBeginDate;
    }

    public void setTrainingBeginDate(LocalDate trainingBeginDate) {
        this.trainingBeginDate = trainingBeginDate;
    }

    public LocalDate getTrainingPrepareBeginDate() {
        return trainingPrepareBeginDate;
    }

    public void setTrainingPrepareBeginDate(LocalDate trainingPrepareBeginDate) {
        this.trainingPrepareBeginDate = trainingPrepareBeginDate;
    }

    public LocalDate getTrainingCancelDate() {
        return trainingCancelDate;
    }

    public void setTrainingCancelDate(LocalDate trainingCancelDate) {
        this.trainingCancelDate = trainingCancelDate;
    }

    public String getTrainingCancelBy() {
        return trainingCancelBy;
    }

    public void setTrainingCancelBy(String trainingCancelBy) {
        this.trainingCancelBy = trainingCancelBy;
    }

    public Boolean getTrainingFinishPreparation() {
        return trainingFinishPreparation;
    }

    public Integer getTrainingTrainerID(){
        return trainingTrainerID;
    }
}


// Training session interface
interface TrainingSession {
    void prepareSession();
}

// Concrete training sessions
class InterCompanyTraining extends Training implements TrainingSession {
    public InterCompanyTraining(int trainingGap, int trainingDurationInDays, String trainingLocation,
                                List<Registration> trainingRegistrations, LocalDate trainingBeginDate,
                                LocalDate trainingPrepareBeginDate, LocalDate trainingCancelDate,
                                String trainingCancelBy, Boolean trainingFinishPreparation, Integer trainingTrainerID) {
        // Passing "inter" as trainingType for InterCompanyTraining
        super("inter", trainingGap, trainingDurationInDays, trainingLocation, trainingRegistrations,
                trainingBeginDate, trainingPrepareBeginDate, trainingCancelDate, trainingCancelBy,
                trainingFinishPreparation, trainingTrainerID);
    }

    @Override
    public void prepareSession() {
        System.out.println("Preparing Inter-Company Training Session");
    }
}


class IntraCompanyTraining extends Training implements TrainingSession {
    public IntraCompanyTraining(int trainingGap, int trainingDurationInDays, String trainingLocation,
                                List<Registration> trainingRegistrations, LocalDate trainingBeginDate,
                                LocalDate trainingPrepareBeginDate, LocalDate trainingCancelDate,
                                String trainingCancelBy, Boolean trainingFinishPreparation, Integer trainingTrainerID) {
        // Passing "intra" as trainingType for InterCompanyTraining
        super("intra", trainingGap, trainingDurationInDays, trainingLocation, trainingRegistrations,
                trainingBeginDate, trainingPrepareBeginDate, trainingCancelDate, trainingCancelBy,
                trainingFinishPreparation, trainingTrainerID);
    }

    @Override
    public void prepareSession() {
        System.out.println("Preparing Intra-Company Training Session");
    }
}


// Factory for creating training sessions
class TrainingSessionFactory {
    public static TrainingSession createTrainingSession(String type, int trainingGap, int trainingDurationInDays,
                                                        String trainingLocation, List<Registration> trainingRegistrations,
                                                        LocalDate trainingBeginDate, LocalDate trainingPrepareBeginDate,
                                                        LocalDate trainingCancelDate, String trainingCancelBy,
                                                        Boolean trainingFinishPreparation, Integer trainingTrainerID) {
        if ("inter".equalsIgnoreCase(type)) {
            return new InterCompanyTraining(trainingGap, trainingDurationInDays, trainingLocation,
                    trainingRegistrations, trainingBeginDate, trainingPrepareBeginDate, trainingCancelDate,
                    trainingCancelBy, trainingFinishPreparation, trainingTrainerID);
        } else if ("intra".equalsIgnoreCase(type)) {
            return new IntraCompanyTraining(trainingGap, trainingDurationInDays, trainingLocation,
                    trainingRegistrations, trainingBeginDate, trainingPrepareBeginDate, trainingCancelDate,
                    trainingCancelBy, trainingFinishPreparation, trainingTrainerID);
        }
        throw new IllegalArgumentException("Invalid training session type");
    }
}


// Observer interface
interface TrainingObserver {
    void update(String message);
}


// Concrete Observer
class Trainer implements TrainingObserver {
    @Override
    public void update(String message) {
        System.out.println("Trainer received: " + message);
    }
}

class Trainee implements TrainingObserver {
    @Override
    public void update(String message) {
        System.out.println("Trainee received: " + message);
    }
}

class RoomReservationManager implements TrainingObserver {
    @Override
    public void update(String message) {
        System.out.println("Room Reservation Manager received: " + message);
    }
}

class PlanningDepartment implements TrainingObserver {
    @Override
    public void update(String message) {
        System.out.println("Planning Department received: " + message);
    }
}


// Training session subject that holds state
class TrainingOrganizer {
    private List<TrainingObserver> observers = new ArrayList<>();

    public void addObserver(TrainingObserver observer) {
        observers.add(observer);
    }

    public void cancelSession() {
        notifyObservers("Training session has been cancelled.");
    }

    private void notifyObservers(String message) {
        for (TrainingObserver observer : observers) {
            observer.update(message);
        }
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        // Using Factory Pattern
        // TrainingSession session =
        // TrainingSessionFactory.createTrainingSession("inter");
        // session.prepareSession();

        // Using Observer Pattern
        // TrainingOrganizer organizer = new TrainingOrganizer();
        // Trainer trainer = new Trainer();
        // organizer.addObserver(trainer);
        // organizer.cancelSession();

        // List<TrainingSession> ts_inter = new ArrayList<>();
        // List<TrainingSession> ts_intra = new ArrayList<>();

        List<Course> cs = new ArrayList<>();
        cs.add(new Course("Python", 12.99, LocalDate.of(2023,8,2), "Paris", "Pygame"));
        cs.add(new Course("Java", 123.45, LocalDate.of(2023,7,12), "Lyon", "Spring Boot"));
        cs.add(new Course("PHP", 12.29, LocalDate.of(2023,7,1), "Lille", "PhpMyAdmin"));
        cs.add(new Course("Ajax", 122.11, LocalDate.of(2023,7,4), "Marseilles", "WebDev"));
        cs.add(new Course("JavaScript", 222.99, LocalDate.of(2023,8,5), "Bordeaux", "ReactJS"));
        cs.get(1).setCourseTraineeMin(3);
        cs.get(2).setCourseTraineeMin(4);
        cs.get(3).setCourseTraineeMin(3);
        cs.get(4).setCourseTraineeMin(4);
        cs.get(0).setCourseTraineeMin(3);
        cs.get(1).setCourseDurationInDays(10);
        cs.get(2).setCourseDurationInDays(20);
        cs.get(3).setCourseDurationInDays(30);
        cs.get(4).setCourseDurationInDays(40);
        cs.get(0).setCourseDurationInDays(50);
        cs.get(1).setCourseGap(4);
        cs.get(2).setCourseGap(2);
        cs.get(3).setCourseGap(3);
        cs.get(4).setCourseGap(4);
        cs.get(0).setCourseGap(4);


        List<Registration> rs = new ArrayList<>();
        rs.add(new Registration("inter", cs.get(0).getCourseDates(), cs.get(0).getCourseLocations(), "name1@gmail.com", "name1", "company1", 1,
                null));   // Course1 = Java
        rs.add(new Registration("inter", cs.get(0).getCourseDates(), cs.get(0).getCourseLocations(), "name2@gmail.com", "name2", "company2", 1,
                null));
        rs.add(new Registration("inter", cs.get(0).getCourseDates(), cs.get(0).getCourseLocations(), "name3@gmail.com", "name3", "company3", 1,
                null));
        rs.add(new Registration("intra", LocalDate.of(2023,8,4), cs.get(1).getCourseLocations(), "name4@gmail.com", "name4", "company4", 2,
                "Comment4"));
        rs.add(new Registration("intra", LocalDate.of(2023,7,5), "Efrei Paris K101", "name5@gmail.com", "name5", "company5", 3,
                "Comment5"));
        rs.add(new Registration("inter", cs.get(2).getCourseDates(), cs.get(2).getCourseLocations(), "name6@gmail.com", "name6", "company6", 3,
                null));
        rs.add(new Registration("inter", cs.get(2).getCourseDates(), cs.get(2).getCourseLocations(), "name7@gmail.com", "name7", "company7", 3,
                null));
        rs.add(new Registration("inter", cs.get(2).getCourseDates(), cs.get(2).getCourseLocations(), "name8@gmail.com", "name8", "company8", 3,
                null));
        rs.add(new Registration("inter", cs.get(3).getCourseDates(), cs.get(3).getCourseLocations(), "name9@gmail.com", "name9", "company9", 4,
                null));
        rs.add(new Registration("intra", cs.get(1).getCourseDates(), "Efrei Paris A101", "name10@gmail.com", "name10", "company10", 2,
                "Comment10"));



        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        for (Registration item : rs) {
            System.out.println(item);
        }
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

    /*
    TrainingAttributesManager m = new TrainingAttributesManager();
    Map<String, Object> attributes = m.getAttributesForCourse(1);
    //System.out.println("Attributes for course : " + attributes + attributes.get("trainingTrainerID"));
    Map<String, Object> course4Attributes = new HashMap<>();
    course4Attributes.put("trainingGap", 4);
    course4Attributes.put("trainingDurationInDays", 6);
    course4Attributes.put("trainingTrainerID", 2);
    course4Attributes.put("trainingTraineeMin", 5);
    m.addCourseAttributes(4, course4Attributes);
    Map<String, Object> course5Attributes = new HashMap<>();
    course5Attributes.put("trainingGap", 4);
    course5Attributes.put("trainingDurationInDays", 6);
    course5Attributes.put("trainingTrainerID", 2);
    course5Attributes.put("trainingTraineeMin", 5);
    m.addCourseAttributes(5, course5Attributes);
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    for (Course item : cs){
      System.out.println(item + " => " + item.getCourseID());
      m.addAttributeToCourse(item.getCourseID(), "trainingLocations", item.getCourseLocations());
      System.out.println("Attributes for course " + item.getCourseID() + " : " + m.getAttributesForCourse(item.getCourseID()));
    }
    //System.out.println(cs.get(1).getCoursePrice());
    */

        // Using Observer Pattern
        TrainingOrganizer organizer = new TrainingOrganizer();
        Trainer trainer = new Trainer();
        Trainee trainee = new Trainee();
        RoomReservationManager roomReservationManager = new RoomReservationManager();
        PlanningDepartment planningDepartment = new PlanningDepartment();
        organizer.addObserver(trainer);
        organizer.addObserver(trainee);
        organizer.addObserver(roomReservationManager);
        organizer.addObserver(planningDepartment);

        // Using Factory Pattern
        Map<Integer, Integer> courseIDCounts_inter = new HashMap<>();
        Map<Integer, Integer> courseIDCounts_intra = new HashMap<>();
        Map<Integer, List<Integer>> courseIDRegistrations_inter = new HashMap<>();
        Map<Integer, List<Integer>> courseIDRegistrations_intra = new HashMap<>();

        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");

        for (Registration item : rs) {
            System.out.println(item);
            int courseID = item.getRegistrationCourseID();
            String trainingType = item.getRegistrationType();
            //int registrationID = item.getRegistrationID();

            if ("inter".equals(trainingType)) {

                courseIDCounts_inter.put(courseID, courseIDCounts_inter.getOrDefault(courseID, 0) + 1);
            }
            else if ("intra".equals(trainingType)) {
                courseIDCounts_intra.put(courseID, courseIDCounts_intra.getOrDefault(courseID, 0) + 1);
            }
        }
        // InterCompanyTraining
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        for (Map.Entry<Integer, Integer> entry : courseIDCounts_inter.entrySet()) {
            System.out.println("Inter : CourseID: " + entry.getKey() + ", Count: " + entry.getValue());
            List<Registration> r = new ArrayList<>();
            int daysBetween = 0;
            for (Registration item : rs) {
                if (cs.get(entry.getKey()).getCourseTraineeMin() == entry.getValue()) {
                    if (item.getRegistrationCourseID() == entry.getKey()) {
                        r.add(item);
                    }
                    daysBetween = Period.between(LocalDate.now(), cs.get(entry.getKey()).getCourseDates()).getDays();

                    //System.out.println("true " + cs.get(entry.getKey()).getCourseName());
                }
            }
            //System.out.println(r);
            System.out.println(daysBetween + " = " + LocalDate.now() + " + " + cs.get(entry.getKey()).getCourseDates());
            if (entry.getValue() >= cs.get(entry.getKey()).getCourseTraineeMin()) {
                TrainingSession session = TrainingSessionFactory.createTrainingSession("inter", cs.get(entry.getKey()).getCourseGap(), cs.get(entry.getKey()).getCourseDurationInDays(),cs.get(entry.getKey()).getCourseLocations(), r, null, null, null, null, false, null);
                System.out.println(session);
                session.prepareSession();
            }
            else if (entry.getValue() < cs.get(entry.getKey()).getCourseTraineeMin() && daysBetween <= 15) {
                System.out.println("Sorry, training session for CourseID " + entry.getKey() +  " will be cancelled because of only " + entry.getValue() + " trainees (<= " + cs.get(entry.getKey()).getCourseTraineeMin() + ").");
                organizer.cancelSession();   // Observer design pattern
            }



            System.out.println("------------------------------------------");
        }
        // IntraCompanyTraining
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        for (Map.Entry<Integer, Integer> entry : courseIDCounts_intra.entrySet()) {
            System.out.println("Intra : CourseID: " + entry.getKey() + ", Count: " + entry.getValue());
            List<Registration> r = new ArrayList<>();
            for (Registration item : rs) {
                if (entry.getValue() >= 1) {
                    if (item.getRegistrationCourseID() == entry.getKey()) {
                        r.add(item);
                    }
                    //System.out.println("true " + cs.get(entry.getKey()).getCourseName());
                }
            }
            //System.out.println(r);
            TrainingSession session = TrainingSessionFactory.createTrainingSession("intra", cs.get(entry.getKey()).getCourseGap(), cs.get(entry.getKey()).getCourseDurationInDays(),cs.get(entry.getKey()).getCourseLocations(), r, null, null, null, null, false, null);
            System.out.println(session);
            session.prepareSession();
            System.out.println("------------------------------------------");
        }
    }
}
