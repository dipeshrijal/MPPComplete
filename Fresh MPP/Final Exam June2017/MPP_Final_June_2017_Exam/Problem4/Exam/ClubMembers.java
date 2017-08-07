package Problem4.Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClubMembers
{
  private List<ClubMember> members;
 
  public ClubMembers(List<ClubMember> members)
  {
    this.members = members;
  }
  
  public OptionalDouble getAverageAge()
  {
	 //Write your code here
	 return null;
  }

  public List<Tuple2<ClubMember, ClubMember>> getCouples()
  {
	  //Write your code here
	  return null;
  }
  
  public static void main(String args[])
  {
    ClubMember cm1 = new ClubMember("Johnny", true, 13);
    ClubMember cm2 = new ClubMember("Jenny", false, 9);
    ClubMember cm3 = new ClubMember("Dave", true, 21);
    ClubMember cm4 = new ClubMember("Penny", false, 28);
    ClubMember cm5 = new ClubMember("Mrs. Smith", false, 36);
    ClubMember cm6 = new ClubMember("Mr. Smith", true, 45);
    ClubMember cm7 = new ClubMember("Mr. Watts", true, 59);
    ClubMember cm8 = new ClubMember("Mrs. Watts", false, 60);
    ClubMember cm9 = new ClubMember("Bill", true, 68);
   
    ClubMember.registerPartners(cm5, cm6);
    ClubMember.registerPartners(cm7, cm8);
   
    ClubMember[] membersArray = new ClubMember[]
             { cm1, cm2, cm3, cm4, cm5, cm6, cm7, cm8, cm9 };
   
    ClubMembers members = new ClubMembers(Arrays.asList(membersArray));
   
    System.out.println("Average age: " + 
           new Double(members.getAverageAge().orElse(0))
                     .intValue());
    System.out.println("Couples: " + members.getCouples());
   
  }
}